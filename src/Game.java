import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    Wins win;
    ArrayList<Player> players;
    private File csvFile;
    private PrintStream p;

    public Game(){
        
        
    }


    

    public Game(Player p){
        this.persons.add(p);
    }

    public Results tellInfo(){
        return this.win;

    };

    

    public void addPerson(Player p){
        this.persons.add(p);
    }

    public Results getResults(){
        return this.win;
    }

    public ArrayList<Player> loadPlayers(String fileName) throws FileNotFoundException{
        File f = new File(fileName);
        this.csvFile= f;
        this.players = new ArrayList<Player>();
        p = new PrintStream(this.csvFile);
        Scanner u = new Scanner(f);
        while(u.hasNextLine()){
          this.players.add(new Player(u.nextLine().split("[,]")));
        }
        u.close();
        return this.players;

    
    }

    public Player selectPlayer(String name){
        for(int x = 0; x<this.players.size(); x++){
            if(players.get(x).getName().equals(name)){
                return players.get(x);
            }

        }
        return null;

    
    }

    
}
