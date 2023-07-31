import java.util.HashMap;

public class NumConvertToWords {
    public static void main(String[] args) {
        System.out.println(convertNumToWords(11));
        System.out.println(convertNumToWords(100));
        System.out.println(convertNumToWords(52));
        System.out.println(convertNumToWords(0));
        System.out.println(convertNumToWords(101));
    }

    public static String convertNumToWords(int number) {
        //        Create a hash map to hardcode the wording of numbers
        HashMap<Integer, String> wordsMap = new HashMap<>();
        wordsMap.put(0, "zero");
        wordsMap.put(1, "one");
        wordsMap.put(2, "two");
        wordsMap.put(3, "three");
        wordsMap.put(4, "four");
        wordsMap.put(5, "five");
        wordsMap.put(6, "six");
        wordsMap.put(7, "seven");
        wordsMap.put(8, "eight");
        wordsMap.put(9, "nine");
        wordsMap.put(10, "ten");
        wordsMap.put(11, "eleven");
        wordsMap.put(12, "twelve");
        wordsMap.put(13, "thirteen");
        wordsMap.put(14, "fourteen");
        wordsMap.put(15, "fifteen");
        wordsMap.put(16, "sixteen");
        wordsMap.put(17, "seventeen");
        wordsMap.put(18, "eighteen");
        wordsMap.put(19, "nineteen");
        wordsMap.put(20, "twenty");
        wordsMap.put(30, "thirty");
        wordsMap.put(40, "forty");
        wordsMap.put(50, "fifty");
        wordsMap.put(60, "sixty");
        wordsMap.put(70, "seventy");
        wordsMap.put(80, "eighty");
        wordsMap.put(90, "ninety");
        wordsMap.put(100, "one hundred");

        if (number >= 0 && number <= 100) {
            if (wordsMap.containsKey(number)) {
                return wordsMap.get(number);
            } else {
//            Seperate the first and the second digit
                int secondDigit = (number / 10) * 10;
                int firstDigit = (number % 10);
                return wordsMap.get(secondDigit) + (firstDigit > 0 ? " " + wordsMap.get(firstDigit) : " ");
            }
        }
        return "Number out of range 1-100";
    }
}