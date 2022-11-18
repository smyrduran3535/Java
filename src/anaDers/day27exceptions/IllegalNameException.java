package anaDers.day27exceptions;

public class IllegalNameException extends RuntimeException{//exc nı kod calıstıktan sonra exc atmasını istiyorsak;extend runtimeexc. yaparız
    public IllegalNameException(String message){
        super(message);
    }
}
