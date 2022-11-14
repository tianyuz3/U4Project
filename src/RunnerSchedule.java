import java.util.Scanner;
public class RunnerSchedule {
    public static void main(String[] args) {
        Schedule input= new Schedule("");
        System.out.println(input.toString());
        Scanner m = new Scanner(System.in);
        String morning= m.nextLine();
        input.changeSchedule(morning);

        System.out.println(input.limit());
        m.nextLine();


        if(input.morning().indexOf("Your")!=-1){
            while(input.morning().indexOf("Your")!=-1){
                System.out.println(input.morning());
                morning=m.nextLine();
                input.changeSchedule(morning);

            }
        } else{
            System.out.println(input.morning());
            String remorning = input.morning();
        }
        System.out.println("Type in your noon schedule: ");
        Scanner n=new Scanner(System.in);
        String noon=n.nextLine();
        input.changeSchedule(noon);
        if(input.noon().indexOf("Your")!=-1){
            while(input.noon().contains("Your")){
                System.out.println(input.noon());
                noon=n.nextLine();
                input.changeSchedule(noon);
            }
        }
        else{
            System.out.println(input.noon());
            String renoon = input.noon();
        }


    }



}
