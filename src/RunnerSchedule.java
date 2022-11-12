import java.util.Scanner;
public class RunnerSchedule {
    public static void main(String[] args) {
        System.out.println("Type numbers to represent your schedule!");
        System.out.println("1 represent work time, 2 represent screen time, 3 represent sports ");
        System.out.println("4 represents meal, 5 represents sleep , 6 represents free time");
        System.out.println("Type in your morning schedule: ");
        Scanner m = new Scanner(System.in);
        String morning= m.nextLine();
        Schedule r = new Schedule(morning);
        if(r.morning().indexOf("Your")!=-1){
            while(r.morning().indexOf("Your")!=-1){
                System.out.println(r.morning());
                morning=m.nextLine();
                r.changeSchedule(morning);

            }
        } else{
            System.out.print(r.morning());
        }



    }



}
