import java.util.Scanner;


public class TicketSelect{

    static Scanner scan = new Scanner(System.in);

    static String peopleTypes[];
    static Person guys[];
    static int seatNumber[];

    private static final int max_people = 100;

    public static int getSeatNumber(int type)
    {
        System.out.println("Please enter amount of " + peopleTypes[type] + " seats");
        return scan.nextInt();
    }

    public static void main(String[] args){

        peopleTypes = new String[5];
        seatNumber = new int[5];
        guys = new Person[max_people];

        peopleTypes[1] = "Standard";
        peopleTypes[2] = "OAP";
        peopleTypes[3] = "Student";
        peopleTypes[4] = "Child";

        int total = 0;

        for (int i=1; i<=4; ++i)
        {
            seatNumber[i] = getSeatNumber(i);
            for (int j=1; j<=seatNumber[i]; ++j)
            {
                switch (i)
                {
                case 1: guys[++total] = new Adult("Adult" + j); break;
                case 2: guys[++total] = new OAP("OAP" + j); break;
                case 3: guys[++total] = new Student("Student" + j); break;
                case 4: guys[++total] = new Child("Child" + j); break;

                }
            }
        }

        int totalPrice = 0;

        for (int i=1; i<= total; ++i)
        {
            totalPrice += guys[i].getTicket().getPrice();
        }


        System.out.println("The total cost of your movie is "+ totalPrice);
    }
}