import java.util.Scanner;

public class splitStringWithRegex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input string from the user and remove any leading or trailing whitespace
        String s = scan.nextLine().trim();

        // If the string is empty, print 0
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            // Split the string into an array of tokens using a regular expression
            // The regular expression matches one or more occurrences of any of the characters in the character class
            String[] tokens = s.split("[ !,?._'@]+");

            // Print the number of tokens in the array
            System.out.println(tokens.length);

            // Print each token on a separate line
            for (String token : tokens) {
                System.out.println(token);
            }
        }

        // Close the scanner to free up resources
        scan.close();
    }
}
