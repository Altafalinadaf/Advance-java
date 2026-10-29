package practiceSetProgram.exceptions;

class ShadiException extends Exception{
    ShadiException(String msg){
        super(msg);
    }
}

class Candidate{
    String name;
    int age;

    Candidate(String name,int age){
        this.name=name;
        this.age=age;
    }


    public void getMarriage() throws Exception{
        if(age<21){
            throw new ShadiException("Below age");       
        }
        System.out.println("Eligible for Marriage");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Candidate candidate1=new Candidate("Raju", 16);
        Candidate candidate2=new Candidate("Kasim", 26);
        try{
            candidate2.getMarriage();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
