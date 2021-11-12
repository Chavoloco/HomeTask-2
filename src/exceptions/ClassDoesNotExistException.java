package exceptions;

public class ClassDoesNotExistException extends ClassNotFoundException{
    private final String message;

    public ClassDoesNotExistException(String message){
        super(message);
        this.message = message;
    }
}
