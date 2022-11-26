package Test789.v2;

import Test789.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class People {

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        List<String> array = new ArrayList<>();;
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String person []=line.split(" ");
                int a = Integer.parseInt(person[1]);
                if(a<0){
                    throw new IllegalArgumentException();
                }
                array.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IllegalArgumentException e){
            System.out.println("А нихуяяяяя, экзепшен подъехал братан \n"+"Где то отрицательный возраст" );
            array=null;
        }

        return array;
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> arrayPerson = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                Person p1 = new Person();
                String line = scan.nextLine();
                String person []=line.split(" ");
                p1.setName(person[0]);
                int a = Integer.parseInt(person[1]);
                p1.setAge(a);
                if(a<0){
                    throw new IllegalArgumentException();
                }
                arrayPerson.add(p1);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IllegalArgumentException e){
            System.out.println("А нихуяяяяя, экзепшен подъехал братан \n"+"Где то отрицательный возраст" );
            arrayPerson=null;
        }

        return arrayPerson;


    }
}
