import java.sql.SQLOutput;

public class Java {
    public static void main(String[] args) {
        String strA = "first a short string";
        String strB = "Friends, Romans, countrymen, lend me your ears; I come to bury Caesar, not to praise him;";
        String strC = "this that and the other this does not make sense that does not either does this";


        if(strA.compareTo(strB)>0)
        {
            System.out.println("strA is bigger String");
        } else {
            System.out.println("strB is bigger String");

        }

        if (strA.compareToIgnoreCase(strB) > 0) {
            System.out.println("strA is bigger String");
        } else {
            System.out.println("strB is bigger String");

        }
        System.out.println("Found ears at position: "+strB.indexOf("ears"));

        String[] words = strC.split("");
        String[] words2 = strC.split("[aeiou]");
            System.out.println("The number of words in strC is : " + words.length);
        System.out.println("The number of words in strC is : " + words2.length);
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]);
        }



    }
}