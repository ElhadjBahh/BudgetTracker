import java.util.*;

public class user {

    Scanner keyboard = new Scanner(System.in);

    int userInput;

    ArrayList<bankFeatures> bankFeaturesNav = new ArrayList<>();
    Queue<bankFeatures> waitingList = new LinkedList<>();


    String firstName, lastName;
    int DOB, startMoney;


    public void sysAdmin () {


        while (true) {


            System.out.println("1. View all users ");
            System.out.println("2. Register user");
            System.out.println("3. Remove users");
            System.out.println("0. Return to main menu");


            userInput = keyboard.nextInt();
            keyboard.nextLine();


            switch (userInput) {

                case 1:
                 ListIterator<bankFeatures> it = bankFeaturesNav.listIterator();
                 while (it.hasNext()) {

                    System.out.println(it.next());
                }
                 break;


                case 2:
                    sysAdminNewUser();
                    break;


                case 3:


                    for (int i = 0; i < bankFeaturesNav.size(); i++) {


                        System.out.println(i + ". : " + bankFeaturesNav.get(i).getFirstName());

                    }

                    System.out.println();
                    System.out.println("Enter the number of Who you would like to remove");

                    userInput = keyboard.nextInt();
                    keyboard.nextLine();


                    System.out.println(bankFeaturesNav.remove(userInput).getFirstName() + " was removed");




                case 0:
                    return;

            }

            System.out.println("Press 0 to Exit (Demo)");
            userInput = keyboard.nextInt();

        }




    }

    public ArrayList<bankFeatures> newUser () {


        System.out.println("Take control over your money - Enter your full name: ");
        firstName = keyboard.nextLine();

        System.out.println("Enter your DOB: ");
        DOB = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter your initial deposit: ");
        startMoney = keyboard.nextInt();
        keyboard.nextLine();



        bankFeatures user = new bankFeatures(firstName, lastName, DOB, startMoney);

        if (bankFeaturesNav.size() > 3) {


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



    }

    public void sysAdminNewUser () {

        {

            System.out.println("Enter your client name: ");
            firstName = keyboard.nextLine();

            System.out.println("Enter your DOB: ");
            DOB = keyboard.nextInt();

            System.out.println("Enter your initial deposit: ");
            startMoney = keyboard.nextInt();


            bankFeatures user = new bankFeatures(firstName, lastName, DOB, startMoney);
            bankFeaturesNav.add(user);

        }


    }

    public void UsermenuOptions () {

        System.out.println("Press the following numbers." );
        System.out.println("1. Add money");
        System.out.println("2. Withdraw money");
        System.out.println("3. View transaction");
        System.out.println("4. Add expense");

        System.out.println("0. Exit");


    }


}
