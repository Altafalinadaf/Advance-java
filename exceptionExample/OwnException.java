package exceptionExample;


class MyException extends Exception{
    String msg;
    public MyException(String msg) {
        this.msg=msg;
    }
    public String getMessage(){
        return msg;
    }
    
}

public class OwnException {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try {
            j=18/i;
            throw new MyException("This is my exception");

        }
        catch(MyException e){
            System.out.println("My exception = "+e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Defalut ");
        }
        
    }

}
