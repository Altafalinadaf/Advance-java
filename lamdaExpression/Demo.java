package functionalInterface;

@FunctionalInterface
interface Car{
    void display();
}
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Car c=()->System.out.print("Show details");
        c.display();

    }
}
