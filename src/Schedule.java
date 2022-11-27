/**
 * The Schedule class represents a schedule, a schedule with event in it.
 */
public class Schedule {


    private String event;

    /**
     * Empty constructor for the schedule class. This can create a new object without any parameters.
     */
    public Schedule(){

    }

    /**
     * Constructor for the schedule class, this can create a new object with the event parameter.
     * @param event represents the event in user's schedule.
     */
    public Schedule(String event){
        this.event=event;

    }

    /**
     * This is the method in schedule class, this method can change the value of
     * the variable event to another value.
     * @param event This parameter is the new value of the private variable "event".
     */
    public void  changeSchedule(String event){
        this.event=event;

    }

    /**
     * dayPick method will pick a random day between Monday-Sunday
     * The days will be determined by a math.random method that chooses
     * a number between 1-7.
     * @return returns the String that represents the day in the week.
     */
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

    /**
     * The morning method can determine if user's morning schedule is
     * healthy or not.
     * @return returns a string to tell user whether they should fix
     * their morning schedule or not.
     */
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

    /**
     * The noon method will determine if user's
     * noon schedule is healthy or not
     * @return returns a String that represents the
     * feedback of their noon schedule, if it's not healthy,
     * the method will return a string that tells the user
     * they should fix their noon schedule.
     */
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

    /**
     * The afternoon method can determine whether user's afternoon
     * schedule is healthy or stressful.
     * @return returns a string that tells the user
     * if their schedule is healthy or they should fix the
     * schedule because it is too stressful.
     */
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

    /**
     * the evening method can determine if user's
     * evening schedule is healthy or not.
     * @return returns a string that tells the user
     * whether they should fix their evening schedule
     * or they have a good evening schedule.
     */
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

    /**
     * the toString method introduces the basic rule of the program to the user.
     * @return returns the string with dash lines to make the
     * output better, returns what each number is representing to what specific events,
     * and returns a string to let the user know what are the invalid inputs.
     */
    public String toString(){
        String box = "------------------------------------------\n";
        String day= "Type in your " + dayPick() + " Schedule starting with morning: ";
        String rule= "1 = work time, 2 = screen time, 3 = sports \n";
        String r2="4 = meal, 5 = sleep , 6 = free time\n";
        String r3= "Type in numbers to represent your schedule\n";
        String r4="You can only type in at most three numbers. Symbols and letters are not valid inputs!\n";
        return box + r3+ rule + r2  + r4 + box + day ;

    }

    /**
     * the checkLetter will check if user's input
     * contains any letters.
     * @return returns false if the input contains letters
     * otherwise return true.
     */
    public boolean checkLetter() {
        int i = 0;
        String sub = "";
        int count = 0;
        String letter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
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

    /**
     * the checkValue method check if user's input contains
     * any value that are not 1-6.
     * @return returns true if user's input doesn't contain
     * any number that are not 1-6. Otherwise return false.
     */
    private boolean checkValue(){
        if (event.contains("7") || event.contains("8")|| event.contains("9")|| event.contains("0")){
            return false;
        } else{
            return true;
        }
    }

    /**
     * The checkSymbol method checks if user's input contains
     * any special symbol or not.
     * @return returns true if user's input doesn't contain
     * any symbols, otherwise return false.
     */
    private boolean checkSymbol() {
        String symbol = "!@#$%^&*()_+<>,./?;'-~";
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

    /**
     * the limit method determine how many kinds of invalid inputs
     * did the user's input contains.
     * @return returns a string that tells the user why are their inputs
     * not valid, and what kind of rules did they break in their inputs.
     */
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

    /**
     * The toSchedule method will convert user's numeric input
     * to the actual word schedule.
     * @param numeric this parameter accepts the user's input in numbers.
     * @return returns user's schedule in words according to their number inputs.
     */
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
