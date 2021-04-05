package commonMultiples;

public class index {

    public static void main(String[] args) {
        for (int i = 1; i < 51; i++) {
            System.out.print(i + " ");
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("A and B");
            } else {
                if (i % 3 == 0) {
                    System.out.print("A");
                }
                if (i % 5 == 0) {
                    System.out.print("B ");
                }
            }
            System.out.println("");
        }
    }
}
