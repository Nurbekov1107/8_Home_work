public class Main {
    public static void main(String[] args) {

        int[] massiv = {4, 5, 6, 7, 8, 9, 10, 11, 12, 18};
        maxIndex(massiv);
        minIndex(massiv);
    }
    private static void maxIndex(int[] massiv) {
        int max = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[0] < massiv[i]) {
                max = massiv[i];
            }
        }
        System.out.println("Maximum index of array is " + max);
    }
    private static void minIndex(int[] massiv) {
        int min = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[0] > massiv[i]) {
                min = massiv[i];
            }
        }
        System.out.println("Minimum index of array is " + min);
    }
}