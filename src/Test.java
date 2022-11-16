public class Test {
    public static void main(String[] args) {

       Schedule s = new Schedule("(((((((");
        s.changeSchedule("2222");
        int t;
        for(int i=0; i<100 ;i++ ) {
            t=(int)(Math.random()*7)+1;
            System.out.println(t);
            System.out.println(s.dayPick());

        }
    }
}
