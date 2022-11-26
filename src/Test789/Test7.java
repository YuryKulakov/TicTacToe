package Test789;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test3");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        int b=0;
        try {
            Scanner scan = new Scanner(file);
            String line = scan.nextLine();
            String numbers[] = line.split(" ");


            for (String numb : numbers) {
                int a = Integer.parseInt(numb);
                b = b + a;

            }

            if(numbers.length!=10){
                throw new IOException();
            }

            System.out.println(Arrays.toString(numbers));
            System.out.println(b);

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IOException e){
            System.out.println("Некорректный входной файл");
        }


    }
}
