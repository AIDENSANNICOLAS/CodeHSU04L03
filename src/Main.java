public class Main {


    public static void main(String[] args) {
        System.out.println(VowelCount("This is a string."));
        System.out.println("Correct output: 4");

        System.out.println(VowelCount(" "));
        System.out.println("Correct output: 0");

        System.out.println(VowelRemover("AIUEO"));
        System.out.println("Correct output: 5");

        System.out.println(ContainsSubstring("Sentence","ten"));
        System.out.println("Correct output: true");

        System.out.println(ReverseString("ABCDEF"));
        System.out.println("Correct output: FEDCBA");

        System.out.println(PalindromeChecker("level"));
        System.out.println("Correct output: true");
    }

    /**
     * Count the vowels in the input string regardless of case
     * @param input String
     * @return vowel count int
     */


    public static int VowelCount(String input){
        int length = input.length();
        String lowerCaseInput = input.toLowerCase();
        int count = 0;
        for(int i = 0; i<length; i++){
            String letter = lowerCaseInput.substring(i,i +1);
            if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
                count++;
            }

        }
        //make input lower case
        return count;
    }

    /*
    Use the following methods:
    .length()
    .substring(start, finish) doesn't include finish
    .substring(start) goes to the end
    .indexOf(someString)
    someString.equals(otherString) !(compare content in a string)!

     */
    public static String VowelRemover(String input){

        

        /*
        int length2 = input.length();
        String lowerCaseInput2 = input.toLowerCase();
        int count2 = 0;
        for(int i2 = 0; i2<length2; i2++){
            String letter2 = lowerCaseInput2.substring(i2,i2 +1);
            if(letter2.equals("a") || letter2.equals("e") || letter2.equals("i") || letter2.equals("o") || letter2.equals("u"))
            {

            }

        }

*/

        /*
        int length2 =

        Create  .length() int  variable
        for statement to loop
         if statement containing vowels --> will create new variable repeatedly






         .indexOf(theString)
         count++ to break




        */

        return "";
    }

    /**
     * Determine if a substring target is contained in a given string
     * @param input - Given string
     * @param target - String being looked for
     * @return true if target found, false otherwise
     */
    public static boolean ContainsSubstring(String input, String target){

        return false;
    }

    /**
     * Reverses a given string
     * @param input String
     * @return reversed input String
     */
    public static String ReverseString(String input){

        return "";
    }

    /**
     * Determines if a given string is palindrome
     * @param input String
     * @return true if given string is a palindrome, false otherwise
     */
    public static boolean PalindromeChecker(String input){

        return false;
    }
}
