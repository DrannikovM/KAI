public class Main {
    public static void main(String[] args) {
        System.out.println("Designed by:\tDrannikov Mykhailo");

        int rows = 2;
        int cols = 3;
        int[][] A = new int[rows][cols];
        int totalSum = 0;

        System.out.println("Matrix A(" + rows + "," + cols + "):");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = (int) (Math.random() * 10);
                System.out.printf("[%d]", A[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < A.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < A[0].length; j++) {
                rowSum += A[i][j];
            }
            totalSum += rowSum; // Додаємо до загальної суми для середнього
            System.out.println("Sum of row " + (i + 1) + " is:\t" + rowSum);
        }

        double arrAVG = (double) totalSum / (rows * cols);
        System.out.println("Arithmetic mean:\t" + String.format("%.2f", arrAVG));
    }
}
