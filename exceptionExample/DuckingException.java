package exceptionExample;

public class DuckingException {

    int balance = 1000;

    void withdraw(int amount) throws Exception {

        if (amount <= balance) {

            System.out.println("Withdraw amount " + amount);
            balance -= amount;

        } else {

            throw new Exception("Insufficient balance");
        }
    }


    void transaction(int amount) throws Exception {

        System.out.println("Transaction started");

        // Exception is passed to transaction()
        withdraw(amount);

        System.out.println("Transaction Complete");
    }


    void atm(int amount) throws Exception {

        System.out.println("ATM is processing");

        // Exception is passed to atm()
        transaction(amount);
    }


    void bank(int amount) throws Exception {

        System.out.println("Bank server connected");

        // Exception is passed to bank()
        atm(amount);
    }


    public static void main(String[] args) {

        DuckingException d = new DuckingException();

        try {

            // Exception finally reaches main()
            d.bank(4000);

        }
        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}