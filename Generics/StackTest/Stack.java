public class Stack<T> {
    private int size;
    private int top;
    private T[] elements;

    public Stack()
    {
        this.size=10;
    }
    public Stack(int s)
    {
        size=s>0 ? s:10;
        top=-1;
        elements=(T[]) new Object[size];
    }

    public void push(T item)
    {
        if(top==size-1) {
            throw new FullStackException(String.format("Stack is full, can't push %s", item));
        }
        elements[++top]=item;
    }

    public T pop()
    {
        if(top==-1) {
            throw new EmptyStackException("Stack is empty, can't pop");
        }
        return elements[top--];
    }
}
