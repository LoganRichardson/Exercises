package misc;

public class squareRoot {

    public static void main(String[] args) {
        int value = 82;
        System.out.println(square(value));
    }

    public static int square(int value) {
        for (int i = 0; i < value; i++) {
            if(i * i == value){
                return (i * i);
            }
        }
        return 0;
    }
}
