public class IntStack {
    private int[] data;
    private int top;

    public IntStack(int capacity) {
        data = new int[capacity];
        top = 0;
    }

    // O(1) amortized
    public void push(int value) {
        if (top == data.length) {
            // optional: resize array
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[top] = value;
        top++;
    }

    // O(1)
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        top--;
        return data[top];
    }

    // O(1)
    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[top - 1];
    }

    // O(1)
    public int size() {
        return top;
    }

    // O(1)
    public boolean isEmpty() {
        return top == 0;
    }
}
