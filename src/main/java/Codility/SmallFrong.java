package Codility;

public class SmallFrong {

    public static void main(String[] args) {
        int solution = Solution.solution(10, 1000000000, 100);
        System.out.println(solution);
    }
}

class Solution {
    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        Double difference = Double.valueOf(Y - X);
        if ( difference >0){
            return   (int)Math.ceil(difference / D);
        }
        return 0;
    }
}
