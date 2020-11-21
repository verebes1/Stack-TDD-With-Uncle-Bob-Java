package Stack;

public class Stack {
    private boolean isEmpty = true;

    public static void main(String[] args) {

    }

    public boolean isEmpty(){
        return isEmpty;
    }


    public void push(int element) {
        isEmpty = false;
    }

    public int pop() {
//        return -1;
        throw new Underflow();
    }

    public class Underflow extends RuntimeException {

    }
}
