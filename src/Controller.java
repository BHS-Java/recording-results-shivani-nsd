import java.io.File;

public class Controller {

    public static void main(String[] args) {
       Main m = new Main();
       Player p1 = new Player();

        /*String name = m.askString("What is your name?");
        p1.setName(name);

       int age = m.askNumber("How old are you?");
       p1.setAge(age);


       int tall = m.askNumber("How tall are you?");
       p1.setHeight(tall);

       System.out.println(p1.getName() + p1.getHeight() + p1.getAge());
        */
        p1.Climb("UDleft");
        p1.Climb("left");
        System.out.println();
        p1.Climb("UDright");
        p1.Climb("right");

        File newFile = new File("/workspaces/recording-results-shivani-nsd/src/ConvertMe.csv");

        

        
    }

    public int dothis(){
        return 3;

    }

    
}
