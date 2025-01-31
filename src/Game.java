import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    Wins win;
    ArrayList<Person> persons;

    public Results tellInfo(){
        return this.win;

    };

    public Game(Person p){
        this.persons.add(p);
    }

    public void addPerson(Person p){
        this.persons.add(p);
    }

    public Results getResults(){
        return this.win;
    }

    public int loadPlayers(File csv){
        int num=0;
        ArrayList<Person> loaded;
        Scanner s = new Scanner("/workspaces/recording-results-shivani-nsd/src/ConvertMe.csv");
        s.useDelimiter(",");
        while(s.hasNext()){
            num++;
        }
       
        return num;

    
    }



    
}
