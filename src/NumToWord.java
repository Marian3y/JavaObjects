public class NumToWord {
    public static void main(String[] args) {
        for (int i = 0; i <=109 ; i++) {
            String word = convertToWords(i);
            System.out.println("The number " +i+" = "+word);
        }
    }

    public static String convertToWords(int num){
         String word="";// tensWord, onesWord, teensWord;

         int tens = num / 10;
         int ones = num % 10;

         switch (tens){
             case 0:
                 word =" ";
                 break;
             case 1:
                 word ="one ";
                 break;
             case 2:
                 word ="twenty ";
                 break;
             case 3:
                 word =" thirty ";
                 break;
             case 4:
                 word =" forty ";
                 break;
             case 5:
                 word =" fifty ";
                 break;
             case 6:
                 word =" sixty ";
                 break;
             case 7:
                 word =" seventy ";
                 break;
             case 8:
                 word =" eighty ";
                 break;
             case 9:
                 word =" ninety ";
                 break;
             case 10:
                 word ="one hundred ";
                 break;
             case 11:
                 word ="one hundred ";
                 break;
             case 12:
                 word ="one hundred ";
                 break;
             case 13:
                 word ="one hundred ";
                 break;
             case 14:
                 word ="one hundred ";
                 break;
             case 15:
                 word ="one hundred ";
                 break;
             case 16:
                 word ="one hundred ";
                 break;
             case 17:
                 word ="one hundred ";
                 break;
             case 18:
                 word ="one hundred ";
                 break;
             case 19:
                 word ="one hundred ";
                 break;

         }


         switch(ones){
             case 0:
                 word +=" ";
                 break;
             case 1:
                 word += "one";
                 break;
             case 2:
                 word +="two";
                 break;
             case 3:
                 word +="three";
                 break;
             case 4:
                 word +="four";
                 break;
             case 5:
                 word +="five";
                 break;
             case 6:
                 word +="six";
                 break;
             case 7:
                 word +="seven";
                 break;
             case 8:
                 word +="eight";
                 break;
             case 9:
                 word +="nine";
                 break;

         }
        switch(num){
            case 0:
                word="zero";
                break;
            case 10:
                word +="ten";
                break;
            case 11:
                word +="eleven ";
                break;
            case 12:
                word ="twelve ";
                break;
            case 13:
                word ="thirteen";
                break;
            case 14:
                word =" fourteen ";
                break;
            case 15:
                word =" fifteen ";
                break;
            case 16:
                word =" sixteen ";
                break;
            case 17:
                word =" seventeen ";
                break;
            case 18:
                word =" eighteen ";
                break;
            case 19:
                word =" nineteen ";
                break;
        }


        System.out.println(num);

        return word;
    }
}
