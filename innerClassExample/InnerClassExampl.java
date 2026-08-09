package innerClassExample;

// non static inner class example

class A{
    void show(){
        System.out.println("Hello show from A class");
    }

    int a = 10;

    class B{
        int a =20;
        void show(){
            System.out.println("Hello show from B class");
            System.out.println(a);
            A a = new A();
            System.out.println(a.a);
        }
        
    }
}

public class InnerClassExampl {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        A.B b2=new A().new B();
        b2.show();



        A.B b=a.new B();
        b.show();
        
    }

}
