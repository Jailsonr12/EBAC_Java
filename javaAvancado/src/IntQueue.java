public class IntQueue {
    private int[] data;
    private int head;
    private int tail;
    private int size;

    public IntQueue(int capacity) {
        data = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }


    public void enqueue(int value) {
        if (size == data.length) {
            throw new IllegalStateException("Queue is full");
        }
        data[tail] = value;
        tail = (tail + 1) % data.length;
        size++;
    }


    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = data[head];
        head = (head + 1) % data.length;
        size--;
        return value;
    }


    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[head];
    }


    public int here() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int lastIndex = (tail - 1 + data.length) % data.length;
        return data[lastIndex];
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }
}
