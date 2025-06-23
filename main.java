import java.util.Scanner;

public class main{
    private static final String MASTER_PASSWORD ="admin123";
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to the Vault!");
        System.out.print("Enter master password: ");
        String inputPassword = sc.nextLine();

        if (!inputPassword.equals(MASTER_PASSWORD)) {
            System.out.println("Incorrect password. Exiting.");
            return;
        }

        while (true) {
            System.out.println("1. Add Entry");
            System.out.println("2. View All Entries");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter site name: ");
                    String site = sc.nextLine();
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();
                    vault.addEntry(site, username, password);
                    break;
                case 2:
                    vault.viewAll();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
    }
}