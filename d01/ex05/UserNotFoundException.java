package d01.ex05;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(){
        super("User is not found");
    }
}
