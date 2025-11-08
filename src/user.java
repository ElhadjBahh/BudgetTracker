import java.util.*;

public class user {

    Scanner keyboard = new Scanner(System.in);

    ArrayList<bankFeatures> bankFeaturesNav = new ArrayList<>();


    String firstName, lastName;
    int DOB, startMoney;


    public void sysAdmin () {

        ListIterator <bankFeatures> it = bankFeaturesNav.listIterator();

       while (it.hasNext())  {

           System.out.println(it.next());
       }



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

        if (bankFeaturesNav.size() > 3) {


            Queue<bankFeatures> waitingList = new LinkedList<>();
            System.out.println("Thank you for signing up in the budget tracker but there's currently a waiting list.");
            System.out.println(waitingList.add(user) + "Was added to the waiting list.");


        }

        else {

            System.out.println("Welcome " + user.getFirstName());
            bankFeaturesNav.add(user);

        }


        return bankFeaturesNav;

    }

    public void returningUser () {

        String userName;


        for (bankFeatures lookup : bankFeaturesNav) {


            System.out.println("Welcome back.");
            System.out.println("Enter your first name: ");
            keyboard.nextLine();
            userName = keyboard.nextLine();

            if (lookup.getFirstName().equals(userName)) {


                System.out.println("Welcome back " + lookup.getFirstName());
            }



        }

    }


}
