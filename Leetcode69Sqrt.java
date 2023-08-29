public class Leetcode69Sqrt{
    public static void main(String[] args) {
        
        System.out.println(mySqrt(2147395600));
    }

    public static int mySqrt(int x){

            for (long i = 0; i < x; i++) {
                long powerNumber = (i*i);
                if (x>=1 && x<=3) return 1;
                if (powerNumber>x){
                    return (int)(i-1);
                }
            }
            return 0;
    }
}