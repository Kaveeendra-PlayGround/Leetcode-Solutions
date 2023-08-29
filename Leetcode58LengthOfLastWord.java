public class Leetcode58LengthOfLastWord {
    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
        
    }

    public static int lengthOfLastWord(String s){
        char [] c = s.strip().toCharArray();
        System.out.println(s.strip());
        int index = 0;
        for (int i = 0; i < c.length; i++) {
            if(Character.isSpaceChar(c[i])){
                index = i+1;  
                System.out.println(index);              
            }
        }
        // System.out.println(index+1);
        // System.out.println(s.substring(index));
        return s.strip().substring(index).length();
    }
}
