package misc;

public class temp3 {

    public static void main(String[] args) {
        int N = -999;
        int digits = Integer.toString(N).length();
        int[] array = new int[digits + 1];

        String str;
        if(N < 0){
            N = N * -1;
            str = String.valueOf("5" + N);
            N = Integer.parseInt(str);
            N = N * -1;
            str = String.valueOf(str);
            
        }else{
            str = String.valueOf("5" + N);
        }
        int first = Integer.parseInt(str);

        
        int temp = first;

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = first % 10;
            first = first / 10;
        }

        int sum = 0;
        int arrayTemp;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                arrayTemp = array[i];
                array[i+1] = 5;
                
            } else {
                arrayTemp = array[i - 1];
                array[i] = 5;
                array[i-1] = arrayTemp;
            }

            for (int j = 0; j < array.length; j++) {
                sum = sum + array[j];
            }
            if (temp < sum) {
                temp = sum;
            }

        }
        
        if(N < 0){
            temp = temp * -1;
            System.out.println(temp);
        }else{
            System.out.println(temp);
        }

    }
}
