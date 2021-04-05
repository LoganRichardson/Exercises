package misc;

public class byteToChar {
    public static void main(String[] args) {
        String str = new String(new byte[]{0x66});
        System.out.println(str);
    }
}
