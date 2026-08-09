package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {

    public static void main(String[] args) {

        int size = 10000;

        List<Integer> list = new ArrayList<>(size);

        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            list.add(ran.nextInt(100));
        }


        // Starting time for Sequential Stream
        long startSeq = System.currentTimeMillis();

        /*
         * Sequential Stream
         *
         * Each element is processed one after another.
         *
         * Thread.sleep(1) is used to simulate
         * a time-consuming operation.
         */
        int result2 = list.stream()
                .map(n -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }

                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();


        // Ending time for Sequential Stream
        long endSeq = System.currentTimeMillis();


        // Starting time for Parallel Stream
        long startPara = System.currentTimeMillis();


        /*
         * Parallel Stream
         *
         * The same operation is performed here.
         *
         * parallelStream() allows the work
         * to be processed by multiple threads.
         */
        int result3 = list.parallelStream()
                .map(n -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }

                    return n * 2;
                })
                .mapToInt(n -> n)
                .sum();


        // Both results should be the same
        System.out.println(result2 + " " + result3);


        // Ending time for Parallel Stream
        long endPara = System.currentTimeMillis();


        // Sequential Stream execution time
        System.out.println("Seq = " + (endSeq - startSeq));


        // Parallel Stream execution time
        System.out.println("Para = " + (endPara - startPara));

    }
}