package Codility;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

public class MatrixDemo {

    public static int maxRows = 0;

    public static void main(String[] args) {
        int[][] values ={

                {0,1,0,0},
                {1,0,1,0},
                {0,1,0,1},
                {1,0,1,0}
        };

        Matrix matrix = new Matrix(4,4,values);
        String str = "";
        for(int i=0 ; i<matrix.getRows() ; i++){
            str = str + i;
        }
        Set<Character> set = new HashSet<>();
        compute(str, 0,2, matrix,set);
        //System.out.println("Max rows :="+ maxRows);


    }

    public static void compute(  String str, int l, int r ,Matrix matrix, Set<Character> set ){
        System.out.println(" l:"+ l+" , r: "+r +", str: ?"+str );
        System.out.println("Entered with:"+ set);
        if (l == r) {
            System.out.println(set);
            System.out.println(str+": "+matrix.noOfrows());
            //matrix.print();
        }
        else
        {
            for (int i = l; i <= r; i++)
            {

                set.add(str.charAt(i));
                System.out.println("added in set:"+ str.charAt(i));
                System.out.println("Flipped at "+ i);
                matrix.flip(i);
                str = swap(str,l,i, matrix);
                compute(str, l+1, r, matrix, set);

                System.out.println("Flipped back :"+i);
                matrix.flip(i);
                System.out.println("Removed from set:"+str.charAt(i));
                set.remove(str.charAt(i));
                str = swap(str,l,i, matrix);

            }
        }
    }

    public  static String swap(String a, int i, int j, Matrix matrix){
        char temp;

        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }


}
