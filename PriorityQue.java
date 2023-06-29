import java.util.Arrays;
import java.util.Random;

public class PriorityQue {
    private int[] items;
    private int front, rear;
    private Random random;

    public PriorityQue(int size) {
        items = new int[size];
        front = -1;
        rear = -1;
        random = new Random();
    }

    public boolean isFull() {
        if (front == 0 && rear == items.length - 1) {
            return true;
        }
        return false;
    }

    public void enQueue(int element) {
        if (isFull()) {
            throw new RuntimeException("Очередь переполнена");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
        }
    }

    public void pop(int element) {
        if (isEmpty()) {
            throw new RuntimeException("Очередь пуста");
        } else {
            if (front == rear) {
                rear = -1;
                front = -1;
            } else {
                front++;
            }
        }
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int peek() {
        return items[front];
    }

    public static void main(String[] args) {//Дырявые тесты
        PriorityQue pq = new PriorityQue(5);
        pq.enQueue(3);
        pq.enQueue(5);
        pq.enQueue(1);
        pq.pop(3);
        System.out.println(pq.peek());
    }
}