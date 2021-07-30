import java.util.Scanner;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        Task1();
        System.out.println();

        Task2();
        System.out.println();

        Task3();
        System.out.println();

        Task4();

        Task5(5, 3);


    }

    public static void Task1() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void Task2() {
        int[] numb = new int[100];
        for (int i = 1; i < numb.length; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void Task3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            } else {
                array[i] = array[i];
            }
            System.out.println(array[i]);
        }
        System.out.println();

    }


    public static void Task4() {
        int[][] matrix = Nmatrix();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i == j) || (i + j == matrix.length - 1)) matrix[i][j] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static int[][] Nmatrix() {
        return new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
    }


    public static int[] Task5(int len, int initialValue) {
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }
        System.out.println();
        return array;
    }
}
















































