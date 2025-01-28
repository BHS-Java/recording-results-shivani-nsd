
import java.util.Scanner;

public class Main implements Spec{
    public static void main(String[] args) {

    }


    public String askString(String question){
        Scanner s = new Scanner(System.in);
        System.out.println(question);
        String answer = s.nextLine();
        return answer;
    }

    public int askNumber(String question){
        Scanner s = new Scanner(System.in);
        System.out.println(question);
        int answer = s.nextInt();
        return answer;
    }

    public String getResults(Game guessingOrBetter){
        String ans = String.valueOf(guessingOrBetter.tellInfo());
        return ans;
    }

    public Person makePerson(String name){
        Person p1 = new Player();
        p1.setName(name);
        return p1;
    }

    public void addResults(Person name){
        
     
    }
}