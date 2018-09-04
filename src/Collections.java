//import java.util.ArrayList;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
       String strC = "Arianne Hernandez";

        String[] words = strC.split("");
        Set<String> treeSet = new TreeSet<>();//put the letters in alphabetical order
        Set<String> hashSet = new LinkedHashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for(String word : words){ // a function to print all the array list from a variable.
            System.out.print(word);
            //System.out.print("\n");
            treeSet.add(word);
          //  hashSet.add(word);
           // list.add(word);
        }
        System.out.println("treeSet= "+treeSet);
        System.out.println("hashSet= "+hashSet);
        System.out.println("list= "+list);
     }
}
