import java.util.ArrayList;

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



    
}
