import java.util.Arrays;

class multiarrayWithDifferntFunction {
    public static void main(String[] args) {
        int arrays[][] = {
            {-3, 8, 7, 4}, {6, 0, 1, 2, 5}, {1, 6, 4, 2, 8}, {2, 1, 3, 8, 5}
        };

        findSortArray(arrays[0]);
        findMissingNumberInArray(arrays[1]);
        findEvenIndexPrint(arrays[2]);
        findAddElements(arrays[3]);
    }

    public static void findSortArray(int array[]) {
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void findMissingNumberInArray(int array[]) {
        boolean[] present = new boolean[array.length + 1];
        for (int i : array) {
            if (i >= 0 && i < present.length) {
                present[i] = true;
            }
        }
        System.out.print("Missing numbers: ");
        for (int i = 0; i < present.length; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void findEvenIndexPrint(int array[]) {
        System.out.print("Elements at even indices: ");
        for (int i = 0; i < array.length; i =i+2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void findAddElements(int array[]) {
        int sum = 0;
        for (int i=0;i<array.length;i++) {
            sum =sum+array[i];
        }
        System.out.println("Sum of elements: " + sum);
    }
}
