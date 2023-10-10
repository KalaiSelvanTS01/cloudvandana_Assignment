import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

    public static boolean isPangram(String str) {
        Set<Character> alphabetSet = new HashSet<>();
         str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for (char c : str.toCharArray()) {
            alphabetSet.add(c);
        }
        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
