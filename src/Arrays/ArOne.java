package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArOne {
    public static void main(String[] args) {
        List<Integer> integer = new ArrayList<>();
        fillArray(0,30,integer);
        System.out.println(integer);
        fillArray(300,350,integer);
        System.out.println(integer);

    }

    public static void fillArray(int a,int b,List <Integer> list){
        for(int i=a;i<b+1;i++){
            if(i%2==0)
            list.add(i);
        }
    }
}
