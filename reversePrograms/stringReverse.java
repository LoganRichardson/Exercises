package reversePrograms;

public class stringReverse {
 public static void main(String[] args) {
        String str = "another";
        String temp = "";
        System.out.println(str.length());
        
        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }
        System.out.println(temp);
    }
}
