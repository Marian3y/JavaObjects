public class ConvertToElvis2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String word = convertToWordsUsingElvis2(i);
            System.out.println("The number " + i + " = " + word);
        }

    }

    static String[] onesAndTeens = {"zero", "one", "two", "Three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] tensArray = {" ", ",", "twenty", "thirty", "forty", "fifty", "Sixty", "seventy", "eighty", "ninety "};

    public static String convertToWordsUsingElvis2(int num) {
        return (num < 20) ? onesAndTeens[num] : tensArray[num / 10] + ((num % 10 != 0) ? onesAndTeens[num % 10] : "");
    }
}

