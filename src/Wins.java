public class Wins implements Results{
    int win = 0;

    public void upWin(){
        this.win = this.win+1;
    };

    public int tellStats(){
        return win;
    };
    
}
