package Stack;

public class Stack {
    private int size = 0;

    public static void main(String[] args) {

    }

    public boolean isEmpty(){
        return size == 0;
    }


    public void push(int element) {
        size++;
    }

    public int pop() {
        if (isEmpty())
            throw new Underflow();
        --size;
        return -1;
    }

    public class Underflow extends RuntimeException {

    }
}
