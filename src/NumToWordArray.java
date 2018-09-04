public class NumToWordArray {
    public static void main(String[] args) {
     for (int i = 0; i < 100 ; i++) {
           // String num = convertToWordsUsingArrays(i);
            String word =convertToWordsUsingArrays(i);
            System.out.println("The number " +i+" = "+word);
      }
    }

    static String[] teensArray = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","Sixteen","Seventeen", "eighteen", "nineteen","bente"};
    static String[] tensArray = {" ",",", "twenty ", "thirty ", "forty ", "fifty ", "Sixty ", "seventy ", "eighty ", "ninety "};
    static String[] onesArray = {" ","one", "two", "three", "four", "five", "Six", "seven", "eight", "nine"};

    public static String convertToWordsUsingArrays(int num) {

        String word;
        if (num == 0) {
            word = "zero";
        } else if (num >= 10 && num <= 20) {
            word = teensArray[num - 10];
        } else {
            word = tensArray[num / 10] + onesArray[num % 10];
        }
        return word;
    }


}