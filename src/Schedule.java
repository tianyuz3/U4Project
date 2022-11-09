public class Schedule {

    private int event;

    public Schedule(){
        this.event=event;

    }
    public int dayPick(){
        int day=(int)(Math.random()*7)+1;
    }
    public boolean morning(){
        if (event<=3){
            return true;

        }
        else{
            return false;
        }
    }
    public boolean noon(){
        if (event<=5){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean afternoon(){

    }
}
