package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapToIntExample {

    public static void main(String[] args) {

        // Number of elements we want to generate
        int size = 10000;

        // Creating an ArrayList with initial capacity of 10000
        List<Integer> list = new ArrayList<>(size);


        // Creating Random object to generate random numbers
        Random ran = new Random();

        // Generating 10000 random numbers
        // nextInt(100) generates values from 0 to 99
        for(int i = 0; i < size; i++) {
            list.add(ran.nextInt(100));
        }


        // Printing all elements of the list
        // This is commented because we don't want to print 10000 values
        // for(int i:list){
        //     System.out.println(i);
        // }


        /*
         * Normal Sequential Stream
         *
         * map() -> transforms every number by multiplying by 2
         *
         * reduce() -> combines all values and calculates the sum
         *
         * Example:
         *
         * 2 -> 4
         * 3 -> 6
         * 4 -> 8
         *
         * Then reduce() adds all the values.
         */
        int result = list.stream()
                         .map(n -> n * 2)
                         .reduce(0, (c, e) -> c + e);

        // Printing result
        // System.out.println(result);


        // --------------------------------------------------
        // Sequential Stream + mapToInt()
        // --------------------------------------------------

        /*
         * Starting time before sequential stream execution.
         *
         * currentTimeMillis() gives the current time
         * in milliseconds.
         */
        long startseq = System.currentTimeMillis();


        /*
         * stream()
         *     ↓
         * map()
         *     ↓
         * mapToInt()
         *     ↓
         * sum()
         *
         * map() multiplies every number by 2.
         *
         * mapToInt() converts the Stream<Integer>
         * into an IntStream.
         *
         * sum() calculates the total.
         */
        int result2 = list.stream()
                          .map(n -> n * 2)
                          .mapToInt(n -> n)
                          .sum();

        // Printing result
        // System.out.println(result2);


        // Ending time after sequential stream execution
        long endSeq = System.currentTimeMillis();


        // --------------------------------------------------
        // Parallel Stream + mapToInt()
        // --------------------------------------------------

        /*
         * Starting time before parallel stream execution.
         */
        long startPara = System.currentTimeMillis();


        /*
         * parallelStream() allows the stream operations
         * to be executed using multiple threads.
         *
         * map() -> multiplies every number by 2
         *
         * mapToInt() -> converts to IntStream
         *
         * sum() -> calculates the total
         */
        int result3 = list.parallelStream()
                          .map(n -> n * 2)
                          .mapToInt(n -> n)
                          .sum();


        // Printing all three results
        //
        // result  -> Sequential Stream + reduce()
        // result2 -> Sequential Stream + mapToInt() + sum()
        // result3 -> Parallel Stream + mapToInt() + sum()
        //
        // All three should produce the same result.
        System.out.println(result + " " + result2 + " " + result3);


        // Ending time after parallel stream execution
        long endPara = System.currentTimeMillis();


        // --------------------------------------------------
        // Comparing Execution Time
        // --------------------------------------------------

        /*
         * Calculating sequential stream execution time.
         *
         * endSeq - startseq
         * gives the approximate execution time in milliseconds.
         */
        System.out.println("Seq = " + (endSeq - startseq));


        /*
         * Calculating parallel stream execution time.
         *
         * endPara - startPara
         * gives the approximate execution time in milliseconds.
         */
        System.out.println("Para = " + (endPara - startPara));


        /*
         * IMPORTANT:
         *
         * Don't assume that parallelStream() will always be faster.
         *
         * For a small/simple operation, sequential stream
         * can be faster because parallel processing has
         * additional overhead such as thread management
         * and splitting/combining data.
         *
         * Parallel streams can be beneficial for sufficiently
         * large datasets and CPU-intensive operations.
         */
    }
}