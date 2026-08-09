package lamdaExpression;

interface Vehicle{
    void show(String name,int amount);
}

public class WithParameterExample {
    public static void main(String[] args) {
        System.out.println("Hello world");
        

        // passing parameter with data types and variable
        Vehicle vehicle=(String name,int amount)->System.out.println("car name = "+name+" amount = "+amount);
        vehicle.show("Audi",4000000);
        
        // passing parameter with without data type and can directly use variable name
        Vehicle vehicle2=(name,amount)->System.out.println("car name = "+name+" amount = "+amount);
        vehicle2.show("Honda", 3000000);

        // passing parameter with without data type and variable can be anything
        Vehicle vehicle3=(a,num)->System.out.println("car name = "+a+" amount = "+num);
        vehicle3.show("Honda", 3000000);
    }

}
