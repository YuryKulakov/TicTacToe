package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TwoFiles {
    public static void main(String[] args) throws FileNotFoundException {
        createTwoFiles();
        File file2 = new File("file2.txt");
        printResult(file2);

    }

    public static void createTwoFiles() throws FileNotFoundException {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        List chisla = new ArrayList<>();
        List chisla2 = new ArrayList<>();

        PrintWriter pw = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);
        int count = 0;
        double b = 0;
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 101);
            chisla.add(a);
            if (count % 20 != 0) {
                b += a;
            } else {
                chisla2.add(b / 20);
                b = 0;
            }
            count++;
        }
        for (Object l : chisla) {
            pw.println(l);
        }
        for (Object l : chisla2) {
            pw2.println(l);
        }
        pw.close();
        pw2.close();


    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        double sum = 0;
        while (scan.hasNextLine()) {

            sum += Double.parseDouble(scan.nextLine());
        }
        int sum2 = (int) sum;
        System.out.println(sum2);

//        String numbers [] = line.split("\n");
////        List <Double> d = new ArrayList<Object>();
//        for(String s:numbers){
//            System.out.println(s);
////            d.add(Double.parseDouble(s));
//        }


    }
}
