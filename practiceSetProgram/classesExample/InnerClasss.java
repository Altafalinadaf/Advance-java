package practiceSetProgram.classesExample;

class A{
    int a=10;
    class B{
        int a = 20;
    }
}

public class InnerClasss {
    public static void main(String[] args) {

        A a = new A();
        A.B b=a.new B();

        A.B c=new A().new B();
        System.out.println(a.a);
        System.out.println(b.a);
    }

}
