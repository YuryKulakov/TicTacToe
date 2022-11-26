package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class One {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test3");
        DecimalFormat df = new DecimalFormat("#.###");
        String r2 = df.format(printResult(file));
//        String format = String.format("%.3f%n",r2);
        System.out.println(printResult(file)+"----->"+r2);

    }

    public static double printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double d = 0;
        String line[] = scanner.nextLine().split(" ");
        for(String s:line) {

            d+=Integer.parseInt(s);

        }
        double r=d/line.length;

        return r;

    }
}
