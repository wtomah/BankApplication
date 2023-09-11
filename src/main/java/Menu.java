import java.util.Scanner;

public class Menu {

    public static void mainMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to this Elite Banking");
        System.out.println("1. Log In");
        System.out.println("2. Leave App");

        int userInput = scan.nextInt();

        switch (userInput){
            case 1:
                login();
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
    public static void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username");
        String username = scan.nextLine();
        System.out.println("Enter password");
        String password = scan.nextLine();

        if (username.equals("user") && password.equals("123")) {
            System.out.println("Welcome to your Account, User");
        } else {
            System.out.println("Wrong username and/or password");
            login();
        }


    }
}
