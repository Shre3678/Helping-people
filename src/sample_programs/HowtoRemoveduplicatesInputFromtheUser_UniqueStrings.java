package sample_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HowtoRemoveduplicatesInputFromtheUser_UniqueStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input list of strings
        List<String> inputList = new ArrayList<>();
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            inputList.add(scanner.nextLine());
        }

        // Find unique strings
        Set<String> uniqueList = findUniqueStrings(inputList);

        // Display unique strings
        System.out.println("Unique strings:");
        for (String str : uniqueList) {
            System.out.print(str + " ");
        }

        scanner.close();
    }

    // for unique values
    public static Set<String> findUniqueStrings(List<String> inputList) {
        // Using HashSet to remove duplicates
        return new HashSet<>(inputList);
    }
}
