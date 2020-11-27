package Stack;

public class Stack {
    private int size = 0;
    private int[] elements = new int[2];

    public static void main(String[] args) {

    }

    public boolean isEmpty(){
        return size == 0;
    }


    public void push(int element) {
        // Increments the size and that increment number is the index of the newly added element
        this.elements[size++] = element;
    }

    public int pop() {
        if (isEmpty())
            throw new Underflow();
        //returns the element at index number which is equal to size and after that it decrements the size by one.
        return elements[--size];
    }

    public class Underflow extends RuntimeException {

    }
}
