
import java.io.*;
import java.util.Scanner;


public class vault{
    private static final String FILE_PATH = "vault.txt";

    public static void addEntry(String site, String username, String password) throws Exception {
    String data = username + ":" + password;
    String encrypted = aes.encrypt(data, "1234567890654321"); // 16-byte AES key

    try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
        fw.write(site + ":" + encrypted + "\n");
    }

    System.out.println("Entry added successfully.");
}
        public static void viewAll() throws Exception {
           File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println("No entries found.");
            return;
        }
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(":",2);
            if (parts.length == 2) {
                String site = parts[0];
                String encryptedData = parts[1];
                String decryptedData = aes.decrypt(encryptedData, "1234567890654321");
                String[] credentials = decryptedData.split(":");
                if (credentials.length == 2) {
                    System.out.println("Site: " + site + ", Username: " + credentials[0] + ", Password: " + credentials[1]);
                }
            } else {
                System.out.println("Invalid entry format: " + line);
            }
        }
        sc.close();     
    }
}


