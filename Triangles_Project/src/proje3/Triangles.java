package proje3;

import java.util.Scanner;
import java.util.Arrays;

public class Triangles {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter matrix size:");
        int size = scn.nextInt();
        int[][] arr = new int[size][size];

        System.out.println("Enter number 1:");
        int x1 = scn.nextInt();
        System.out.println("Enter number 2:");
        int y1 = scn.nextInt();
        System.out.println("Enter number 3:");
        int x2 = scn.nextInt();
        System.out.println("Enter number 4:");
        int y2 = scn.nextInt();
        System.out.println("Enter number 5:");
        int x3 = scn.nextInt();
        System.out.println("Enter number 6:");
        int y3 = scn.nextInt();

        while (isValidInput(x1, y1, x2, y2, x3, y3)) {
            clearMatrix(arr);

            drawLine(arr, x1, y1, x2, y2);
            drawLine(arr, x1, y1, x3, y3);
            drawLine(arr, x2, y2, x3, y3);

            if (isWithinBounds(x3, y3, arr)) {
                arr[x3][y3] = '*';
            }

            printMatrix(arr);

            System.out.println("Enter number 1:");
            x1 = scn.nextInt();
            System.out.println("Enter number 2:");
            y1 = scn.nextInt();
            System.out.println("Enter number 3:");
            x2 = scn.nextInt();
            System.out.println("Enter number 4:");
            y2 = scn.nextInt();
            System.out.println("Enter number 5:");
            x3 = scn.nextInt();
            System.out.println("Enter number 6:");
            y3 = scn.nextInt();
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print((char) arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void drawLine(int[][] arr, int x0, int y0, int x1, int y1) {
        int dx = Math.abs(x1 - x0), sx = x0 < x1 ? 1 : -1;
        int dy = -Math.abs(y1 - y0), sy = y0 < y1 ? 1 : -1;
        int err = dx + dy, e2;

        while (true) {
            if (isWithinBounds(x0, y0, arr)) {
                arr[x0][y0] = '*';
            }
            if (x0 == x1 && y0 == y1) break;
            e2 = 2 * err;
            if (e2 >= dy) {
                err += dy;
                x0 += sx;
            }
            if (e2 <= dx) {
                err += dx;
                y0 += sy;
            }
        }
    }

    public static void clearMatrix(int[][] arr) {
        for (int[] row : arr) {
            Arrays.fill(row, ' ');
        }
    }

    public static boolean isWithinBounds(int x, int y, int[][] arr) {
        return x >= 0 && x < arr.length && y >= 0 && y < arr[0].length;
    }

    public static boolean isValidInput(int x1, int y1, int x2, int y2, int x3, int y3) {
        return x1 >= 0 || x2 >= 0 || x3 >= 0 || y1 >= 0 || y2 >= 0 || y3 >= 0;
    }
}
