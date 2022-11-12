public class Schedule {


    private String event;

    public Schedule(String event ){
        this.event=event;

    }
    public void  changeSchedule(String event){
        this.event=event;

    }

    public String dayPick(){
        int day=(int)(Math.random()*7)+1;
        String d= "";
        if (day==1){
            d="Monday";
        }
        if (day==2){
            d="Tuesday";
        }
        if (day==3){
            d="Wednesday";
        }
        if (day==4){
            d="Thursday";
        }
        if (day==5){
            d="Friday";
        }
        if (day==6){
            d="Saturday";
        }
        else{
            d="Sunday";
        }
        return d;
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
    public String noon(){
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
    public String afternoon(){
        int a=0;
        String anoon="";
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
            anoon="Don't forget to watch the sunset!\n";
        }
        else{
            anoon="Don't forget to watch the sunset!\n";
        }
     return anoon;
    }
    public String evening(){
        int e=0;
        String night="";
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

            night="Don't stress yourself out at night! Let's relax!";
        }
        else{
           night= "Good night! Get ready for your next day of the adventure!\n";
        }
        return night;
    }

    public String toString(){
        String day= "Type in your " + dayPick() + " Schedule:";
        String result= day  + morning()  + noon()  + afternoon()  + evening();
        return result;
    }
}
