package duplicateString;

public class index {
    public static void main(String[] args) {
        String main = "I want my main desk to be my office desk too";
        String[] array = main.split(" ");
        String[] duplicates = new String[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[i].equals(array[j]) && i != j){
                    duplicates[counter] = array[j];
                    array[i] = "";
                    System.out.println("Duplicates: " + duplicates[counter]);
                    counter++;
                }
            }            
        }
    }
}
