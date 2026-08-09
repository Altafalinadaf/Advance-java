package innerClassExample;

class A2{
    void show(){
        System.out.println("Hello from A");
    }

    static class B2{
        void show(){
            System.out.println("Hello from B");
        }
    }
}

public class StaticInnerClass {
  
    public static void main(String[] args) {
        A2.B2 b=new A2.B2();
        b.show();
    }

}
