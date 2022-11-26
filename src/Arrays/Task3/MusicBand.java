package Arrays.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicBand {
    int year;
    String name;
    List<Artist> list;

    public MusicBand(String name,int year,List <Artist>list) {
        this.year = year;
        this.list=list;
        this.name=name;

    }

    public void transferMembers( MusicBand b){

        for(Artist members: this.getList()){
            b.list.add(members);
        }
        this.list.clear();
    }

    @Override
    public String toString() {
        return "MusicBand|" + getName() + getYear() +getList()+
                '|';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artist> getList() {
        return list;
    }

    public void setList(List<Artist> list) {
        this.list = list;
    }
}
