package Stack;

public class Stack {
    private int size = 0;
    private int element = -1;

    public static void main(String[] args) {

    }

    public boolean isEmpty(){
        return size == 0;
    }


    public void push(int element) {
        this.element = element;
        size++;
    }

    public int pop() {
        if (isEmpty())
            throw new Underflow();
        --size;
        return element;
    }

    public class Underflow extends RuntimeException {

    }
}
