package streamAPI.testingExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        int size = 1000;
        List<Integer> list=new ArrayList<>(size);
        Random random=new Random();
        for(int i=1;i<=size;i++){
            list.add((int)random.nextInt(100));
        }


        long nSeqStart=System.currentTimeMillis();
        int resultSS=list.stream().map(n->
            {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {

                }
                return n*2;
            })
            .mapToInt(n->n).sum();
        long nSeqEnd=System.currentTimeMillis();

        long pSStart=System.currentTimeMillis();
        int resultPS=list.parallelStream().map(n->
            {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                return n*2;
            })
            .mapToInt(n->n).sum();
        long pSEnd=System.currentTimeMillis();

        System.out.println( resultSS+"  "+ resultPS);
        System.out.println("Sequential stream = "+(nSeqEnd-nSeqStart));
        System.out.println("Parallel stream = "+(pSEnd-pSStart));

        

        
    }

}
