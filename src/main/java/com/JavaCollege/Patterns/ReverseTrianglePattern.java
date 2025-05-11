package com.JavaCollege.Patterns;


/*N = 7 no of rows
1st row - spaces = 0(N-7) stars = 7  stars = N
2nd row - spaces = 1 stars = 6  stars = N - 1
3rd row - spaces = 2 stars = 5  N - 2
4th row - spaces = 3 stars = 4  N - 3
5th row - spaces = 4 stars = 3  N - 4
6th row - spaces = 5 stars = 2  N - 5
7th row - spaces = 6(N-1) stars = 1  N - 6
 */


//i) First of all print all the spaces and then print the stars
class ReverseTrianglePattern{

    // Main driver method
    public static void main(String[] args)
    {
        // Declaring and initializing variable to
        // Size of the pyramid
        int number = 7;

        int i = number, j;

        // Nested while loops
        // Outer loop

        // Till condition holds true
        while (i > 0) {
            j = 0;

            // Inner loop
            // Condition check
            while (j++ < number - i) {
                // Print whitespaces
                System.out.print(" ");
            }

            j = 0;

            // Inner loop
            // Condition check
            while (j++ < (i * 2) - 1) {
                // Print star
                System.out.print("*");
            }

            // By now, we reach end of execution for one row
            // so next line
            System.out.println();

            // Decrementing counter because we want to print
            // reverse of pyramid
            i--;
        }
    }
}
