package com.JavaQspiders.String.Problem;

public class ExactlyVisitedOnce {
    public static void main(String[] args) {
        boolean[] visited = new boolean[10]; // For digits '0' to '9'

        process('0', visited);
        process('5', visited);
        process('0', visited); // Will be skipped
    }

    static void process(char ch, boolean[] visited) {
        int index = ch - '0'; // Convert char to corresponding index (e.g., '0' -> 0, '5' -> 5)
        if (visited[index]) {
            System.out.println(ch + " already visited. Skipping.");
        } else {
            System.out.println("Processing " + ch);
            visited[index] = true;
        }
    }
}
