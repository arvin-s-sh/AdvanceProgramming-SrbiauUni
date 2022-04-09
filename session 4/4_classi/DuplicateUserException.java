package session4_classi;

public class DuplicateUserException extends Exception{
    public DuplicateUserException(String errorText){
        super(errorText);
    }
}
