public class Schedule {


    private String event;

    public Schedule(String event ){
        this.event=event;

    }
    public String changeSchedule(String event){
        this.event=event;
        return event;
    }

    public int dayPick(){
        int day=(int)(Math.random()*7)+1;
        return day;
    }
    public String morning() {
        int m = 0;
        String morn="";
        if (event.indexOf("2") != -1) {
            m++;
        }
        if (event.indexOf("5") != -1) {
            m++;
        }
        if (event.indexOf("1") != -1 || event.indexOf("4") != -1 || event.indexOf("6") != -1) {
            m--;
        }
        if(m>1){
            morn="Your morning schedule is a little bit stressful, try to fix it!";
    }
        else{
            morn= "You have a healthy morning schedule!";
        }
            return morn;
    }
    public String  noon(){
        int n=0;
        String noon="";
        if (event.indexOf("1")!=-1){
            n++;
        }
        if(event.indexOf("2")!=-1 && event.indexOf("5")!=-1){
            n++;
        }
        if(event.contains("3") && event.indexOf("6")!=-1){
        n--;

        }
        if (n>1){
            noon="Your noon schedule is not healthy, try to fix it!";
        }
        else{
            noon= "What a nice noon time you have!";
        }
        return noon;
    }
    public boolean afternoon(){
        int a=0;
        if(event.contains("2")){
            a++;
        }
        if(event.contains("5") || event.contains("4") || event.contains("3")){
            a--;
        }
        if(event.contains("6") || event.contains("1")){
            a--;
        }
        if(a!=1){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean evening(){
        int e=0;
        if(event.contains("5")){
            e=e+2;
        }
        if(event.contains("2")){
            e--;
        }
        if(event.contains("1")){
            e--;
        }
        if(event.contains("4")){
            e++;
        }
        if(e<1){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        String result="";
        if(!morning()){
           result+="You have a healthy morning schedule!\n";
        }
        if (morning()){
            result+="Your morning schedule is a little bit stressful, try to fix it!\n";
        }
        if(!noon()){
            result+="What a nice noon time you have!\n";
        }
        if(noon()){
            result+="Your noon schedule is not healthy, try to fix it!\n";
        }
        if(!(afternoon())){
            result+="Don't forget to watch the sunset!\n";
        }
        if(afternoon()){
            result+="Make another afternoon schedule, relax, it's almost the end of the day!\n";
        }
        if(!evening()){
            result+="Good night! Get ready for your next day of the adventure!\n";
        }
        if(evening()){
            result+="Don't stress yourself out at night! Let's relax!";
        }
        return result;
    }
}
