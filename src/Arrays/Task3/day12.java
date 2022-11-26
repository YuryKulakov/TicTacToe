package Arrays.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class day12 {
    public static void main(String[] args) {

        MusicBand music= new MusicBand("AC/DC",1975,new ArrayList<>(Arrays.asList(new Artist("John",26), new Artist("Genry",20))));
        MusicBand music2= new MusicBand("Pink Floyd",1995,new ArrayList<>(Arrays.asList(new Artist("Mila",22),new Artist("Joshua",30),new Artist("John",31))));

//        List<MusicBand> mbList = new ArrayList<>(Arrays.asList(new MusicBand("MusBand one",1990,Arrays.asList(new Artist("John",26), new Artist("Genry",20))),
//                new MusicBand("MusBand two",1987,Arrays.asList(new Artist("Mila",22),new Artist("Joshua",30),new Artist("John",31)))));

        System.out.println(music);
        System.out.println(music2);
        System.out.println("___________________________________");
music.transferMembers(music2);
        System.out.println(music);
        System.out.println(music2);



    }

}
