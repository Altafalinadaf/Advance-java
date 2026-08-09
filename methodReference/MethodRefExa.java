package methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodRefExa {
    public static void main(String[] args) {
        List<String> name=Arrays.asList("Rafik","Mahiboob","Sohail","Kisor");
        
        List<String> uName=name.stream().map(str->str.toUpperCase()).toList();
        uName.forEach(n->System.out.println(n));

        // using method reference 
        List<String> uName2=name.stream().map(String::toUpperCase).toList();
        //we can use same for foreach method asweel
        uName2.forEach(System.out::println);
    }

}
