package practiceSetProgram.exceptions;

class BankException extends Exception{
    String msg; 

    BankException(String msg){
        super(msg);
    }
}


class SavingAccount{
    int bal=2000;

    public int deposite(int amount){
        return bal+=amount;
    }

    public int withdraw(int amount) throws Exception{
        if(amount<bal){
            return bal-=amount;
        }
        else{
            throw new BankException("Insuffient balance"); 
        }
    
        
    }
}

public class Example {
    public static void main(String[] args) {
        SavingAccount account=new SavingAccount();
        System.out.println(account.deposite(2000));

        try{
            System.out.println(account.withdraw(3000));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}
