public class IllegalTriangleException extends Throwable {
    private String s;
    public IllegalTriangleException(String s){
        this.s = s;
    }
    public String getS(){return s;}
}
