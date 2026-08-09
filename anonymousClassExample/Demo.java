package anonymousClassExample;

class Car{
    public void display(){
        System.out.println("display features");
    }
    void show(){
        System.out.println("Show car details");
    }
}

public class Demo {
    public static void main(String[] args) {
        Car car = new Car(){
            public void display(){
                System.out.println("Display new Features");
            }
        };

        car.display();
        car.show();

       System.out.println("hello");

    }

}
