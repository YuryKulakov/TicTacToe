package Day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recurseSum(numbers,0));
    }

    public static int recurseSum(int [] massive,int i){
        if(massive.length==i){
            return 0;
        }

//        if(i>massive.length-1)
//            return 0;


        return massive[i]+recurseSum(massive,i+1);
    }
}
