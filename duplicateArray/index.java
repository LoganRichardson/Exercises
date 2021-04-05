package duplicateArray;

public class index {

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 2, 1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Duplicate: " + duplicate(array));
    }

    public static int duplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i] && j != i) {
                    return array[j];
                }
            }
        }
        return 0;
    }
}
