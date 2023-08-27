public class Leetcode9Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(112221));
    }

    public static boolean isPalindrome(int number){

        char [] c = Integer.toString(number).toCharArray();

        for (int i = 0; i < c.length; i++) {

            if(c [i] != c [c.length-1-i]){
                return false;
            }
            
            if(i> c.length-1-i){
                break;
            }

        }

        return true;
    }
}
