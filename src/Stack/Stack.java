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

    public class Underflow extends RuntimeException {

    }
}
