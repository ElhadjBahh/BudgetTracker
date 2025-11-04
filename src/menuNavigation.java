import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class menuNavigation {

    Scanner keyboard = new Scanner(System.in);
    int userInput;




    Stack<Integer> mainMenu = new Stack<>();

    public void start() {

        System.out.println(" -- Welcome to your budget tracker. --  \n" ) ;

        firstMenuOptions();

        switch (userInput) {

            case 1:



        }






    }

    public void firstMenuOptions () {


        System.out.println("Press the following numbers to navigate the program");
        System.out.println("1. System Administrator login in ");
        System.out.println("2. Create a new user ");
        System.out.println("3. Existing users ");

    }

    public void sysAdmin () {



    }

    public void newUser () {



        System.out.println("Take control over your money - Enter your full name: ");


    }

    public void returningUser () {


    }
}
