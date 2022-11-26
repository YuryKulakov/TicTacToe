package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shoes {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("shoes.csv");
        try {
            Scanner scanner = new Scanner(fileIn);
            PrintWriter fileOut = new PrintWriter("shoesNEW");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String shoes[] =line.split(";");
                if(shoes.length==3) {
                    int a = Integer.parseInt(shoes[2]);
                    if (a == 0) {
                        fileOut.println(line);
                    }
                }else{
                    throw new IllegalArgumentException();
                }
            }
            fileOut.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IllegalArgumentException c){
            System.out.println("Неверный формат документа");
        }
    }
}
