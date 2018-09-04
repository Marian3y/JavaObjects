class Base {
    public void show() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public void show() {
        System.out.println("Derived");
    }
}

class Main{
    public static void doShow( Base o ) {
        o.show();
    }
    public static void main(String[] args) {
        Base    x = new Base();
        Base    y = new Derived();
        Derived z = new Derived();
        doShow(x);
        doShow(y);
       doShow(z);
    }
}
