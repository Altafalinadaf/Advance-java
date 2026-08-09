package optionClassExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionClassExample {
    public static void main(String[] args) {
        List<String> name=Arrays.asList("Kartik","Rajesh","Asif","Kasim");

        Optional<String> n =name.stream().filter(str->str.contains("x")).findFirst();
        //System.out.println(n.get());
        System.out.println(n.orElse("Not found"));
    }

}
