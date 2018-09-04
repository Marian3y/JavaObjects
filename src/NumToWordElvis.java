public class NumToWordElvis {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String num = convertToWordsUsingElvis(i);
            System.out.println("The number " + i + " = " + num);
        }
    }
    static String[] teensArray = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","Sixteen","Seventeen", "eighteen", "nineteen"};
    static String[] tensArray = {" ", ",", "twenty", "thirty", "forty", "fifty", "Sixty", "seventy", "eighty", "ninety "};
    static String[] onesArray = {" ", " one", " two", " three", " four", " five", " Six", " seven", " eight", " nine"};
    public static String convertToWordsUsingElvis(int num) {
        return (num == 0) ? "zero" : (num >= 10 && num <= 19) ? teensArray[num - 10] : tensArray[num / 10] + onesArray[num % 10];
    }

}
