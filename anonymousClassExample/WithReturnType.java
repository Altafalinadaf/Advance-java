package anonymousClassExample;

interface Calcultor{
    int add(int a,int b);
    int sub(int a,int b);
}

public class WithReturnType {
    public static void main(String[] args) {
        Calcultor cal=new Calcultor() {
            public int add(int a,int b){
                return a+b;
            }

            public int sub(int a,int b){
                return a-b;
            }
        };

        int add = cal.add(2, 3);
        int sub=cal.sub(4, 1);
        System.out.println(add + " "+sub);

        
    }


}
