package queue;

public class Queue {

    int[] queue = new int[10];
    int front;
    int rear;
    int size;

    public void enQueue(int data) {
        if (isFull() == false) {
            queue[rear] = data;
            rear++;
            size++;
        } else {
            System.out.println("Queue is full");
        }

    }

    public int deQueue() {
        int data = queue[front];
        if (isEmpty() == false) {
            front++;
            size--;
        } else {
            System.out.println("Queue is empty");
        }
        return data;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(queue[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size <= 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size >= 10) {
            return true;
        }
        return false;
    }

}
