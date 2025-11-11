import java.util.Scanner;
import java.util.Stack;

public class menuNavigation {

    Scanner keyboard = new Scanner(System.in);
    int userInput;

    user userNavigation = new user();

    Stack<String> mainMenu = new Stack<>();

    public void start () {


        System.out.println("-- Welcome to the budget tracker. -- ");


        menuOptions();


        userInput = keyboard.nextInt();
        keyboard.nextLine();

        while ( userInput != 0) {
            switch (userInput) {


                case 1:
                    mainMenu.push("Admin");
                    adminMenu();
                    break;

                case 2:
                    mainMenu.push("New User");
                    newUser();
                    break;

                case 3:
                    mainMenu.push("Returning user");
                    returningUser();
                    break;



            }

            menuOptions();
            userInput = keyboard.nextInt();

        }


        System.out.println("Good bye");



    }

    public void adminMenu  (){

        userNavigation.sysAdmin();
        mainMenu.pop();

    }

    public void newUser () {

        userNavigation.newUser();
        mainMenu.pop();
    }

    public void returningUser () {

        userNavigation.returningUser();
        mainMenu.pop();
    }


    public void menuOptions () {

        System.out.println("Press the following numbers." );
        System.out.println("1. System administrator");
        System.out.println("2. New user");
        System.out.println("3. Returning user");
        System.out.println("0. Exit");


    }




}
