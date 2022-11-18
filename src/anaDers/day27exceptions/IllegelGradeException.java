package anaDers.day27exceptions;

import java.util.jar.JarException;
//eger Exception Class'a expend sizin Class'iniz "Compile Time Excwption" olur
public class IllegelGradeException extends Exception {//butun exception classlar exceptionın child ıdır.
   public IllegelGradeException(String message){
       super(message);
   }


}
