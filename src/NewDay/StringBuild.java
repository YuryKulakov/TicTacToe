package NewDay;

public class StringBuild {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder a=new StringBuilder("");
        for (int i = 0; i <= 2000; i++) {
            a.append(i+" ");

        }
        System.out.print(a);
        long stopTime = System.currentTimeMillis();

        System.out.println();
        System.out.println();
        System.out.println(stopTime-startTime);
    }
}
