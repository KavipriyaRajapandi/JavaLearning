class Rotation {
    public static void main(String[] args) {
        int arrays[][] = {
            {1,2,3,4}, 
            {1,2,3}, 
            {1,2,3,4,5}, 
            {1,2,3,4,5,6}
        };

        for (int i = 0; i < arrays.length; i++) {
            rotationarray(arrays[i], i);
        }

        // Printing the rotated arrays
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotationarray(int a[], int n) {
        for (int k = 1; k <= n; k++) {
            int first = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];// roatated and stored 
            }
            a[a.length - 1] = first; // roatated and stored 
        }
    }
}
