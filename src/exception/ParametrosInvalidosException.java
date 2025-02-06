package exception;

public class ParametrosInvalidosException extends RuntimeException{

    public ParametrosInvalidosException(String msg){
        super(msg);
    }

    public ParametrosInvalidosException(String msg, Throwable throwable){
        super(msg, throwable);
    }
}
