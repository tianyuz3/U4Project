public class Test {
    public static void main(String[] args) {

       Schedule s = new Schedule("(((((((");
        s.changeSchedule("^^62");
        System.out.println(s.checkSymbol());
        System.out.println(s.checkLetter());
    }
}
