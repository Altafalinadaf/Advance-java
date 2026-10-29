package practiceSetProgram.anonymous;


interface B{
    void disp(int a);
}

abstract class A{
    abstract void show(int n);
}


interface C{
    int disp(int a);
}
public class Program2 {
    public static void main(String[] args) {
        A a=new A() {
            void show(int n){
                System.out.println("n value is = "+n);
            }
        };

        a.show(5);

        B b = new B() {
            public void disp(int a){
                System.out.println("a value is = "+a);
            }
        }; 
        
        C c=new C() {
            public int disp(int a){
                return  a*10;
            }
        };

        
        System.out.println(c.disp(10));
    }
}
