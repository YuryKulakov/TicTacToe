package Test;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int array[]= new int[100];
        int maxThree=0;
        int index=0;

        Random r=new Random();
        for (int i=0;i<array.length;i++){
            array[i]=r.nextInt(10000);
        }

        for (int i=0;i<array.length-2;i++) {
            int sum=0;
            sum=array[i]+array[i+1]+array[i+2];

            if(sum>maxThree){
                maxThree=sum;
                index=i;
            }
        }

        System.out.println(maxThree);

    }
}
