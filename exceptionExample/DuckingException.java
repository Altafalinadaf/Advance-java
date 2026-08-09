package exceptionExample;

public class DuckingException {

    int balance=1000;
    void withdraw(int amount) throws Exception{
        if(amount<=balance){
            System.out.println("withdraw amount "+amount);
            balance-=amount;
        }
        else{
            throw new Exception("Insuffient balance");
        }
    }

    void transaction(int amount) throws Exception{
        System.out.println("Transaction started ");
        withdraw(amount);
        System.out.println("Transaction Complete");

    }

    void atm(int amount) throws Exception{
        System.out.println("ATM is Procession ");
        transaction(amount);
    }
    void bank(int amount) throws Exception{
        System.out.println("Bank server connected");
        atm(amount);

    }    
    public static void main(String[] args) {
        DuckingException d=new DuckingException();
        try{
            d.withdraw(4000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

}
