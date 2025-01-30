public class Player implements Person{

    String name;
    int height;
    int age;
    Wins wins;
    

    public void     setName(String name){
        this.name = name;

    };

    public String   getName(){
        return this.name;

    };

    public int      getHeight(){
        return this.height;

    };

    public int      getAge(){
        return this.age;



    };

    public void      setAge(int age){
       this.age = age;



    };

    public void      setHeight(int tall){
        this.height = tall;
 
 
 
     };
    public Results  getResults(){
        return this.wins;

    }; 

    public void  addWin(){
        this.wins.upWin();

    }; 




}
