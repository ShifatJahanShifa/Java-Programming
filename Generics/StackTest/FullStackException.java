public class FullStackException extends RuntimeException{
    public FullStackException()
    {
        this("the stack is full");
    }
    public FullStackException(String exception)
    {
        super(exception);
    }
}
