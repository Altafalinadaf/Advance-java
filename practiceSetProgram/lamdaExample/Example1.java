package practiceSetProgram.lamdaExample;

interface A{
    void show();
}

interface B{
    int add(int a,int b);
}

public class Example1 {

    public static void main(String[] args) {
        A a = new A() {
        public void show(){
            System.out.println("Show the details");
        }
    };
    a.show();

    A a2=()->System.out.println("show details");
    a2.show();

    B b=(int a3,int b3)->{
        return a3+b3;
    };
    System.out.println(b.add(2,4));
    }

}
