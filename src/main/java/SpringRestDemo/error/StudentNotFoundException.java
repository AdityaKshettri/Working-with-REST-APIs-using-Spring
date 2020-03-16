package SpringRestDemo.error;

public class StudentNotFoundException extends RuntimeException
{
    public StudentNotFoundException(String string) {
        super(string);
    }

    public StudentNotFoundException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public StudentNotFoundException(Throwable thrwbl) {
        super(thrwbl);
    }  
}
