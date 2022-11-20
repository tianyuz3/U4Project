public class Schedule {


    private String event;

    private String letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private String symbol = "!@#$%^&*()_+<>,./?;'-~";
    public Schedule(){

    }
    public Schedule(String event){
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
        else if(day==7){
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
        if(a==1){
            anoon="Your afternoon schedule is too stressful, fix it!";
        }
        else{
            anoon="Nice afternoon schedule!";
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
           night= "Good night!";
        }
        return night;
    }

    public String toString(){
        String box = "------------------------------------------\n";
        String day= "Type in your " + dayPick() + " Schedule starting with morning: ";
        String rule= "1 = work time, 2 = screen time, 3 = sports \n";
        String r2="4 = meal, 5 = sleep , 6 = free time\n";
        String r3= "Type in numbers to represent your schedule\n";
        String r4="You can only type in at most three numbers. Symbols and letters are not valid inputs!\n";
        return box + r3+ rule + r2  + r4 + box + day ;

    }
    public boolean checkLetter() {
        int i = 0;
        String sub = "";
        int count = 0;
        while (i < letter.length()) {
            sub = letter.substring(i, i + 1);
            if (event.indexOf(sub) != -1) {
                i++;
                count++;
            } else {
                i++;

            }
        }
            if (count != 0) {
                return false;
            } else if (count==0)
            {
                return true;
            }

                return true;
    }
    private boolean checkValue(){
        if (event.contains("7") || event.contains("8")|| event.contains("9")|| event.contains("0")){
            return false;
        } else{
            return true;
        }
    }

    private boolean checkSymbol() {

        String sub;
        int count = 0;
        int i = 0;
        while (i < symbol.length()) {
            sub = symbol.substring(i, i + 1);
            if (event.indexOf(sub) != -1) {
                i++;
                count++;
            } else {
                i++;
            }
        }
            if (count != 0) {
                return false;
            } else if(count==0)
            {
                return true;
            }

                return false;
    }
    public String limit() {
        if(!checkValue()){
            return "Your input should not be 0 or any number that's great than 6";
        }
        if (event.length() > 3) {
            if (!checkLetter() && !checkSymbol()) {
                return "You can only enter at most 3 numbers, letters and symbols are not valid input";
            }
            if (!checkLetter()) {
                return "You can only enter at most 3 numbers, letters are not valid input";
            }
            if (!checkSymbol()) {
                return "You can only enter at most 3 letters, symbols are not valid input";
            }
        } else if (!checkSymbol() || !checkLetter()) {
            if (!checkSymbol() && !checkLetter()) {
                return "Symbols and letters are not valid input";
            }
            if (!checkSymbol()) {
                return "Symbols are not valid input";
            }
            if (!checkLetter()) {
                return "Letters are not valid input";
            }
        } else {
            return "Press enter to continue";
        }
            return "You can only include at most three events in your schedule";
    }
    public String toSchedule(String numeric){
        String result="";
        if (numeric.indexOf("1")!=-1){
            result+="Work time\n";
        }
        if(numeric.indexOf("2")!=-1){
            result+="Screen time\n";
        }
        if (numeric.indexOf("3")!=-1){
            result+="sports\n";
        }
        if (numeric.indexOf("4")!=-1){
            result+="meal\n";
        }
        if(numeric.indexOf("5")!=-1){
            result+="sleep\n";
        }
        if(numeric.indexOf("6")!=-1){
            result+="free time\n";
        }
        return result;
    }
}
