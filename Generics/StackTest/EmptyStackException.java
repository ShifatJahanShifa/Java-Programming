public class EmptyStackException extends RuntimeException{
    public EmptyStackException()
    {
        this("the stack is empty");
    }
    public EmptyStackException(String exception)
    {
        super(exception);
    }
}
