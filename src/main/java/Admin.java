import java.util.*;

public class Admin {
    public static void adminMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Check All Accounts");
        System.out.println("2. Log Out");

        int userInput = scan.nextInt();

        switch (userInput) {
            case 1 -> showAccounts();
            case 2 -> {
                System.out.println("Goodbye");
                Menu.mainMenu();
            }
            default -> {
                System.out.println("Invalid Input");
                adminMenu();
            }
        }


    }
    public static void showAccounts(){
        Account account1 = new Account("William Tomah", 3000.00);
        Account account2 = new Account("Bob McDermott", 2000.00);
        Account account3 = new Account("Cyrus Sean", 2500.00);
        HashMap<Integer, Account> accountList = new HashMap<Integer, Account>();

        accountList.put(1, account1);
        accountList.put(2, account2);
        accountList.put(3, account3);


        Set<Map.Entry<Integer, Account>> set = accountList.entrySet();


        for (Map.Entry<Integer, Account> entry : set) {
            int accountId = entry.getKey();
            Account account = entry.getValue();
            System.out.println(accountId + " |  " + account);
        }
        adminMenu();


        }

    }
