package practiceSetProgram.lamdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("KAsim","tohid","Ranjit","kartik","kiran");
        names.forEach(name->System.out.println(name));

        Consumer<String> con=new Consumer<>() {
            public void accept(String name){
                System.out.println(name);
            }
        };

        System.out.println("anonymous class");
        names.forEach(con);

        System.out.println("Lamda expression");
        Consumer<String> con2=(name)->System.out.println(name);
        names.forEach(con2);

    }

}
