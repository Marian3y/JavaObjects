public class sample {
    public static void main(String[] args) {
        String str = "Hello my name is John and I like to go fishing and hiking I have two sisters and one brother.";
        String find = "I";

        for (int index = str.indexOf("I"); index >= 0; index = str.indexOf("I", index + 1))
        {
            System.out.println(index);
        }
    }
}
