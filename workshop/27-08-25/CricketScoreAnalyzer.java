import java.util.Scanner;

public class CricketScoreAnalyzer {
    
    // Method to find highest score
    public static int findHighest(int[] scores) {
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }

    // Method to find lowest score
    public static int findLowest(int[] scores) {
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        return lowest;
    }

    // Method to calculate average score
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Method to check for century scorers
    public static void printCenturyScorers(int[] scores) {
        boolean found = false;
        for (int score : scores) {
            if (score >= 100) {
                System.out.println("Century Scorer: " + score);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Century Scorer.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of batsmen
        System.out.print("Enter number of batsmen: ");
        int n = sc.nextInt();
        int[] scores = new int[n];

        // Input runs scored by each batsman
        System.out.println("Enter runs scored by each batsman:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Calling methods
        int highest = findHighest(scores);
        int lowest = findLowest(scores);
        double average = calculateAverage(scores);

        // Display results
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);
        
        // Check for centuries
        printCenturyScorers(scores);
    }
}