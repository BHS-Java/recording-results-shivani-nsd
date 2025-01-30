public class Controller {

    public static void main(String[] args) {
       Main m = new Main();
       String name = m.askString("What is your name?");
       Player p1 = new Player();
       p1.setName(name);

       int age = m.askNumber("How old are you?");
       p1.setAge(age);


       int tall = m.askNumber("How tall are you?");
       p1.setHeight(tall);

       System.out.println(p1.getName() + p1.getHeight() + p1.getAge());



        
    }

    public int dothis(){
        return 3;

    }

    
}
