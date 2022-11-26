package Test789;

import java.io.File;
import java.io.FileNotFoundException;

import static Test789.v2.People.parseFileToObjList;
import static Test789.v2.People.parseFileToStringList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("people");



        System.out.println(parseFileToObjList(file));

    }
}
