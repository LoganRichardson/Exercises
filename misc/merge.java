package misc;

public class merge {
    public static void main(String[] args) {
        int[] merge;
    
    }
    
    int[] merge(int[] a, int[] b){
                int[] result = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            result[2*i] = a[i];
            result[(2*i) + 1] = b[i];
        }
        return result;
    }
}
