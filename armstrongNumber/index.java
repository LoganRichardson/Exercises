package armstrongNumber;

public class index {

    public static void main(String[] args) {
        int[] array = {1,1,3,1,2,1,3,3,3,3};
        int num = 10;
        System.out.println(sockMerchant(num, array));
        //int value = 0153;
        //System.out.println(arm(value));
    }

    public static int sockMerchant(int n, int[] ar) {
      int finalCount = 0;
      
      for(int i = 0; i < n; i++){
        if(ar[i] != 0){
        for(int j = i + 1; j < n; j++){
          if(ar[j] == ar[i]){
            finalCount++;
            ar[j] = 0;
          }
        }
      }
      }
      return finalCount;
    }

    public static int arm(int value) {
        int temp = 0;
        while (value != 0) {
            int digit = value / 10;
            temp = (temp * 10) + (digit * digit * digit);
            value = value / 10;
        }
        return temp;
    }
}
