package practiceSetProgram.optionalClass;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example1 {
    public static void main(String[] args) throws IOException{
        List<String> names = Arrays.asList("Kartik","Suresh","Kishor","Rajesh");
        Optional<String> name = names.stream().filter(str->str.contains("R")).findFirst();

        System.out.println(name.orElse("Not exist"));

        int a = System.in.read();
        System.out.println(a);
    }

}
