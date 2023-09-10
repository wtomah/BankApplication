import java.util.Scanner;

public class Menu {
    public static void mainMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to this Elite Banking");
        System.out.println("1. Log In");
        System.out.println("2. Log Out");

        int userInput = scan.nextInt();

        switch (userInput){
            case 1:
                System.out.println("You haven't built this yet");
                break;
            case 2:
                System.out.println("Goodbye");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                mainMenu();
        }

    }
}
