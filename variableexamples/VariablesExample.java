package variableexamples;
public class VariablesExample {
    public static void main(String[] args) {
        int num=100000000;
        int num2=10_00_00_000;
        System.out.println(num);
        System.out.println(num2);

        // if you want to store binary values;
        int num3=0b101;
        System.out.println(num3);

        // if you want to store hexadecimal values 
        // 10  11
        // A*16^1 + B*16^0= 160+11= 171
        int num4=0xAB;
        System.out.println(num4);

    }
}
