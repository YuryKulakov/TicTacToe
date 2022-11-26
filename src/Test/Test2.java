package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Random r = new Random();
        int array[][]=new int [12][8];
        int maxSum=0;
        int index=0;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]= r.nextInt(50);
            }
        }

        for(int i=0;i<array.length;i++){
            int sum=0;
            for(int j=0;j<array[i].length;j++){
                sum +=array[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
                index=i;
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Максимальная сумма в строке под индексом: "+ index);
    }
}
