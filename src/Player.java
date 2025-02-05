public class Player implements Person{

    String name;
    int height;
    int age;
    Wins wins;
    int win;
    int loss;


    public Player(String[] data){ 
        this.name = data[0];
        this.height = Integer.parseInt(data[1]);
        this.age = Integer.parseInt(data[2]);
        this.win = Integer.parseInt(data[3]);
        this.loss = Integer.parseInt(data[4]);

    }
    

    public void Climb(String direction){

        if(direction.equals("UDright")){
            String msg = "";
            for(int x=1; x<5; x++){
                msg="";
                for(int b=x; b<5;b++){
                msg = msg + "|T|";}
                System.out.println(msg);
            }

        }

        if(direction.equals("left")){
            String msg = "";
            for(int x=5; x>0; x--){
                msg="";
                for(int b=x; b<5;b++){
                msg = msg + "|T|";}
                System.out.println(msg);
            }
        }


        if(direction.equals("UDleft")){
            String msg = "";
            for(int x=5; x>0; x--){
                msg="";
                for(int b=x; b<5;b++){
                msg = msg + "   ";}
                for(int l=1; l<x;l++){
                    msg = msg + "|T|";}
                System.out.println(msg);
            }

            
        }

        if(direction.equals("right")){
            String msg = "";
            for(int x=0; x<6; x++){
                msg="";
                for(int b=x; b<5;b++){
                msg = msg + "   ";}
                for(int l=1; l<x;l++){
                    msg = msg + "|T|";}
                System.out.println(msg);
            }

        }
      





    }


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
