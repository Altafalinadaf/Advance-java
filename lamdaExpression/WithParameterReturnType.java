package lamdaExpression;

interface Payment{
    int add(int num1,int num2);
}

public class WithParameterReturnType {
    public static void main(String[] args) {

        // using return method while returning value
        Payment pay=(int a,int b)->
        {
                return a+b;
        };
        int result=pay.add(20, 3);
        System.out.println(result);

        //not using return method while returning value
        // full short
        Payment pay2=(a,b)->a+b;
        int result2=pay2.add(20, 24);
        System.out.println(result2);



        
    }

}
