package sortingMethods;

public class bubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 2, 1,6,1,45,12,77,1,88,35,7,64};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);            
        }
    }
}
