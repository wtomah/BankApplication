import java.util.Scanner;

public class Login {
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
