package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Random r=new Random();
        int mass[]=new int[100];
        int max=mass[0];
        int min=mass[0];
        int count=0;
        int count0=0;

        for(int i=0;i< mass.length;i++){
            mass[i]=r.nextInt(1000);

        }

        for(int i=0;i< mass.length;i++){
            if(mass[i]>max) {
                max=mass[i];
            }
            if(mass[i]<min){
                min=mass[i];
            }

        }
        System.out.print ("Числа заканчивающиеся на 0: ");

        for(int s:mass){

            if(s%10==0){

                System.out.print(s+"  ");
                count0+=s;
            }

        }
        System.out.println();
        System.out.println("Минимальное: "+min+" Максимальное: "+ max);
        System.out.println("Сумма нулевых: "+count0);
        System.out.println(Arrays.toString(mass));


    }
}
