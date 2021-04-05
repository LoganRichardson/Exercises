package boundedBuffer;

public class Runner {
    public static void main(String[] args) {
        Producer produce = new Producer();
        produce.setName("Producer1");
        produce.start();
        
        Consumer consume = new Consumer(produce);
        consume.setName("Consumer1");
        consume.start();
    }
}
