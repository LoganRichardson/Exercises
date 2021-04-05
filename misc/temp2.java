package misc;

public class temp2 {

    public static String ones[] = {"one", "two", "three", "four", "five", "six", " seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"};
    public static String tens[] = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};

    public static void main(String[] args) {
        int[] array = {6, 2, 3, 8};

        int num = 64;

        int value1 = 0;
        int value2 = 0;
        String str = "";

        while (num != 0) {

            value1 = (num % 10);           
            
            value2 = num % 10;
            
            System.out.println(value1);
            System.out.println(value2);
            
            
            str = tens[value2] + ones[value1];
            
            num = num / 10;
            
        }
        
        System.out.println(str);

    }

}
