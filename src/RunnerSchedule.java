import java.util.Scanner;
public class RunnerSchedule {

    public static void main(String[] args) {
        String remorning="";
        String renoon="";
        String reafter="";
        String reevening="";
        Schedule input = new Schedule("");
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
            remorning = m.nextLine();
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
            renoon = n.nextLine();
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
                input.changeSchedule(afternoon);
            }
        } else {
            System.out.println(input.afternoon());
           reafter = a.nextLine();
        }

        System.out.println("Type in your evening schedule: ");
        Scanner e = new Scanner(System.in);
        String evening = e.nextLine();
        input.changeSchedule(evening);
        while (input.limit().indexOf("Press") == -1) {
            System.out.println(input.limit());
            evening = e.nextLine();
            input.changeSchedule(evening);
        }
        if (input.evening().indexOf("Don't") != -1) {
            while (input.evening().contains("Your")) {
                System.out.println(input.evening());
                evening = e.nextLine();
                input.changeSchedule(evening);
            }
        } else {
            System.out.println(input.evening());
            reevening = e.nextLine();
        }
        System.out.println(remorning);
    }
}
