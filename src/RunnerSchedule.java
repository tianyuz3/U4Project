import java.util.Scanner;
public class RunnerSchedule {

    public static void main(String[] args) {
        Schedule input = new Schedule();
        System.out.println(input.toString());
        Scanner m = new Scanner(System.in);
        String morning = m.nextLine();
        input.changeSchedule(morning);

        while (input.limit().indexOf("Press") == -1) {
            System.out.println(input.limit());
            morning = m.nextLine();
            input.changeSchedule(morning);
        }


        if (input.morning().indexOf("Your") != -1) {
            while (input.morning().indexOf("Your") != -1) {
                System.out.println(input.morning());
                morning = m.nextLine();
                input.changeSchedule(morning);

            }
        } else {
            System.out.println(input.morning());

        }
        System.out.println("Type in your noon schedule: ");
        Scanner n = new Scanner(System.in);
        String noon = n.nextLine();
        input.changeSchedule(noon);
        while (input.limit().indexOf("Press") == -1) {
            System.out.println(input.limit());
            noon = n.nextLine();
            input.changeSchedule(noon);
        }
        if (input.noon().indexOf("Your") != -1) {
            while (input.noon().contains("Your")) {
                System.out.println(input.noon());
                noon = n.nextLine();
                input.changeSchedule(noon);
            }
        } else {
            System.out.println(input.noon());

        }

        System.out.println("Type in your afternoon schedule: ");
        Scanner a = new Scanner(System.in);
        String afternoon = a.nextLine();
        input.changeSchedule(afternoon);
        while (input.limit().indexOf("Press") == -1) {
            System.out.println(input.limit());
            afternoon = a.nextLine();
            input.changeSchedule(afternoon);
        }
        if (input.afternoon().indexOf("Your") != -1) {
            while (input.afternoon().contains("Your")) {
                System.out.println(input.afternoon());
                afternoon = a.nextLine();
            }
        } else {
            System.out.println(input.afternoon());
        }

        Schedule input2 = new Schedule(afternoon);
        System.out.println("Type in your evening schedule: ");
        Scanner e = new Scanner(System.in);
        String evening = e.nextLine();
        input2.changeSchedule(evening);
        while (input2.limit().indexOf("Press") == -1) {
            System.out.println(input2.limit());
            evening = e.nextLine();
            input2.changeSchedule(evening);
        }
        if (input2.evening().indexOf("Do") != -1) {
            while (input2.evening().contains("Do")) {
                System.out.println(input2.evening());
                evening = e.nextLine();
                input2.changeSchedule(evening);
            }
        } else{
            System.out.println(input2.evening());
        }
        System.out.println("Here is your schedule for the day:");
        System.out.println("Morning:");
        System.out.print(input.toSchedule(morning));
        System.out.println("Noon:");
        System.out.print(input.toSchedule(noon));
        System.out.println("Afternoon:");
        System.out.print(input.toSchedule(afternoon));
        System.out.println("Evening:");
        System.out.print(input2.toSchedule(evening));


    }
}
