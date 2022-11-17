public class Test {
    public static void main(String[] args) {

       Schedule s = new Schedule("(((((((");
        s.changeSchedule("2222");
        System.out.println(s.toSchedule("4"));

        }

}
