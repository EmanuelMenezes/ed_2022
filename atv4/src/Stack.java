public class Stack<T> {
    private T[] stack;
    private T top;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.stack = (T[]) new Object[size];

        this.top = null;
    }

    public void push(T item) {
        if (stack.length == size) {
            size = size * 2;
            T[] newStack = (T[]) new Object[size];
            for (int i = 0; i < size; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        } else {
            if (this.top == null) {
                this.top = item;
                this.stack[0] = item;
            } else {
                this.top = item;
                for (int i = 0; i < this.size; i++) {
                    if (this.stack[i] == null) {
                        this.stack[i] = item;
                        break;
                    }
                }
            }
        }
    }

    public T pop() {
        T item = this.top;
        this.top = null;
        for (int i = 0; i < this.size; i++) {
            if (this.stack[i] == item) {
                this.stack[i] = null;
                break;
            }
        }
        return item;
    }

    public T peek() {
        return this.top;
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < this.size; i++) {
            if (this.stack[i] != null) {
                empty = false;
                break;
            }
        }
        return empty;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.stack[i] != null) {
                size++;
            }
        }
        return size;
    }

    public void print() {
        for (int i = 0; i < this.size; i++) {
            if (this.stack[i] != null) {
                System.out.println(this.stack[i].toString());
            }
        }
    }

    // Atividade 3 - Parte 3
    public void reverseFirstAndTop() {
        T first = this.stack[0];
        T top = this.top;
        this.stack[0] = top;
        this.top = first;
    }

}