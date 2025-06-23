Password Vault – Java CLI Project

This is a simple and secure password manager built using Java. It uses AES encryption to safely store usernames and passwords in a local text file.

Features:

Implements AES-128 encryption to securely store passwords.

Access is protected by a master password.

Stores credentials in a local file (vault.txt) using a simple and readable format.

Allows users to add new login details and view all saved credentials.

Easy-to-use command-line interface, ideal for learning Java and basic cryptography.

How to Run
Make sure you have Java installed (Java 8 or later). Then, compile and run the program from your terminal:

javac Main.java Vault.java AESUtil.java
java Main

Make sure all the .java files are in the same folder when compiling.



Example Output

Welcome to the Vault!
Enter master password: ******
1. Add Entry
2. View All Entries
3. Exit
Choose an option: 2
Site: gmail → Username: user@example.com, Password: mysecurepassword


Technologies Used:

Java (JDK 8+)
AES Encryption (via javax.crypto)
Base64 Encoding (java.util.Base64)
File Handling and Input (FileWriter, Scanner)

Possible Improvements:

Search for credentials by site name
Add functionality to delete specific entries
Add a graphical user interface (GUI) using Java Swing
Store data in a secure local database like SQLite instead of a text file

Author:
Created by Hashvanthini

