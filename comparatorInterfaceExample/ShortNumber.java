package comparatorInterfaceExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShortNumber {
    public static void main(String[] args) {

        // using lamda expression
        List<Integer> list=Arrays.asList(12,33,43,54,32,54,64,23,54,23,53);
        System.out.println("Original List = "+list);


        Collections.sort(list);
        System.out.println("Sorted List = "+list);

        // short list using second digit
        Comparator<Integer> com=(a,b)-> a%10>b%10?1:-1;
        Collections.sort(list,com);
        System.out.println("Sorted list with second digit = "+list);

    }

}
