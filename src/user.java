import java.util.ArrayList;
import java.util.Scanner;

public class user {

    Scanner keyboard = new Scanner(System.in);

    ArrayList<bankFeatures> bankFeaturesNav = new ArrayList<>();


    String firstName, lastName;
    int DOB, startMoney;

    public void sysAdmin () {



    }

    public ArrayList<bankFeatures> newUser () {

        System.out.println("Take control over your money - Enter your full name: ");
        firstName = keyboard.nextLine();
        lastName = keyboard.nextLine();

        System.out.println("Enter your DOB: ");
        DOB = keyboard.nextInt();

        System.out.println("Enter your initial deposit: ");
        startMoney = keyboard.nextInt();



        bankFeatures user = new bankFeatures(firstName, lastName, DOB, startMoney);
        return

    }

    public void returningUser () {



    }
}
