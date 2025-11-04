import java.util.Scanner;

public class bankFeatures {

    Scanner keyboard = new Scanner(System.in);

    String firstName, lastName;
    int dateOfBirth;
    double initialDeposit;


    public bankFeatures (String firstName, String lastName, int dateOfBirth, int initialDeposit) {

        this.firstName = firstName;
        this.lastName = lastName;
        this. dateOfBirth = dateOfBirth;
        this. initialDeposit = initialDeposit;

    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int addMoney () {

        int moneyAdded;

        System.out.print( getFirstName() +  " How much would like to add: " );
        moneyAdded = keyboard.nextInt();


        while (moneyAdded <= 0 ) {

            System.out.println(" TRY - AGAIN -- You can't depost less ( $0 )");
            moneyAdded = keyboard.nextInt();
        }


        initialDeposit += moneyAdded;

        return (int)initialDeposit;

    }

    public int withdrawnMoney () {

        int withDrawnMoney;

        System.out.print( getFirstName() +  " How much would like to withdrawn: " );
        withDrawnMoney = keyboard.nextInt();

        if (withDrawnMoney > initialDeposit ) {

            System.out.println("Decline not enough funds - Current funds is " + getInitialDeposit());
        }
        else {

            initialDeposit -= withDrawnMoney;


        }


        return (int)initialDeposit;

    }



}
