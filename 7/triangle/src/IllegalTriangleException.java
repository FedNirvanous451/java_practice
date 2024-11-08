// задание 2 - обработка исключений
public class IllegalTriangleException extends Exception {
    private double s_1, s_2, s_3;
    
    public IllegalTriangleException(String message, double s1, double s2, double s3) {
        super(message);
        s_1 = s1;
        s_2 = s2;
        s_3 = s3;    
    }
}


