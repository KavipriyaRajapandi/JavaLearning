class MinMaxArray {
    public static void main(String[] args) {
        int numbers[][] = {
            {3, 5, 7}, {2, 8, -1}, {4, 10, 12},
        };

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }

    public static int findMin(int array[][]) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int findMax(int array[][]) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
