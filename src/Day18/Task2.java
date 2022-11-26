package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237,0,0));
    }

    public static int count7(int i,int j,int count){
        Scanner scan = new Scanner(String.valueOf(i));
        String[] d = scan.nextLine().split("");
        if(j>d.length-1)
            return 0;
        if(Integer.parseInt(d[j])==7)
            return 1+count7(i, j + 1, count);
        else
        return count7(i, j + 1, count);
    }
}
