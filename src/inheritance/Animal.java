package inheritance;

public class Animal {
    public static void main(String[] args) {
        System.out.println("A new animal has been created!");
        Bird bird = new Bird();
         Dog dog = new Dog();

        bird.sleep();
        bird.eat();

        dog.sleep();
        dog.eat();
    }

}
    class Bird extends Animal {
        public Bird() {

            System.out.println("A new bird has been created!");
        }


        public void sleep() {
            System.out.println("A bird sleeps...");
        }


        public void eat() {
            System.out.println("A bird eats...");
        }
    }

    class Dog extends Animal {
        public Dog() {

            System.out.println("A new dog has been created!");
        }


        public void sleep() {
            System.out.println("A dog sleeps...");
        }


        public void eat() {
            System.out.println("A dog eats...");
        }
    }

