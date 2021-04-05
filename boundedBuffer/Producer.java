package boundedBuffer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread{
    final int MAX_QUEUE_SIZE = 3;
    List<String> message = new ArrayList<>();
    
    @Override
    public void run(){
        while(true){
            try{
                produce();
            }catch(Exception exc){
                
            }
        }
    }
    
    public synchronized void produce() throws Exception{
        if(message.size() == MAX_QUEUE_SIZE){
            System.out.println("Queue limit reached. Waiting for consumer...");
            wait();
            System.out.println("Producer notified from consumer");
        }
        String data = LocalDateTime.now().toString();
        message.add(data);
        System.out.println("Producer produced data.");
        notify();
    }
    
    public synchronized String consume() throws Exception{
        notify();
        while(message.isEmpty()){
            wait();
        }
        String data = message.get(0);
        message.remove(data);
        return data;
    }
    
}
