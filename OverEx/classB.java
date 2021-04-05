package OverEx;

public class classB extends classA{
    int k;
    
    public classB(int i, int j, int k){
        this.k = k;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public void show(){
        System.out.println("k: " + k);
    }
}