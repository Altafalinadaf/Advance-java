package practiceSetProgram.anonymous;

class Car{
    void disp(){
        System.out.println("Display car features");
    }

    void show(){
        System.out.println("show car details");
    }
}

public class Program1 {
    public static void main(String[] args) {
       Car car=new Car();
       car.show(); 

       Car car2=new Car(){
        void show(){
            System.out.println("show cars new details");
        }
       };

       car2.show();
    }

}
