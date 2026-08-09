package exceptionExample;

public class Demo {
    public static void main(String[] args) {

        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException("don't want non zero value");
            }
        }
        catch(ArithmeticException e){
            System.out.println("default value");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(j);
        
    }

}
