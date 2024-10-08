package Arrays_2D;

public class    spiral_form {
    public static void printarr(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int m = arr.length;
        int n = arr[0].length;
//        printarr(arr);
        // spiral print

        int maxr = m - 1;
        int minr = 0;
        int minc = 0;
        int maxc = n - 1;
        while (minr <= maxr && minc <= maxc) {
            // left to right

            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;
            if(minc > maxc || minr >maxr) break;
            // top to bottom
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;
            if(minc > maxc || minr >maxr) break;
            // right to left


            for (int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j] + " ");
            }
            maxr--;
            if(minc > maxc || minr >maxr) break;
            // bottom to top
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + " ");
            }
            minc++;
        }
    }

}
