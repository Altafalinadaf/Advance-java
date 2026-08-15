package streamAPI.testingExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapToIntAndParallelStream {
    public static void main(String[] args) {
        int size = 100000;
        List<Integer> list=new ArrayList<>(size);
        Random random=new Random();
        for(int i=1;i<=size;i++){
            list.add((int)random.nextInt(100));
        }

        // for(Integer i:list){
        //     System.out.println(i);
        // }

        long nSstart=System.currentTimeMillis();
        int resultnS=list.stream().map(n->n*2).reduce(0,(a,b)->a+b);
        long nSEnd=System.currentTimeMillis();

        long nSeqStart=System.currentTimeMillis();
        int resultSS=list.stream().map(n->n*2).mapToInt(n->n).sum();
        long nSeqEnd=System.currentTimeMillis();

        long pSStart=System.currentTimeMillis();
        int resultPS=list.parallelStream().map(n->n*2).mapToInt(n->n).sum();
        long pSEnd=System.currentTimeMillis();

        System.out.println(resultnS +" "+ resultSS+"  "+ resultPS);
        System.out.println("Normal stream = "+(nSEnd-nSstart));
        System.out.println("Sequential stream = "+(nSeqEnd-nSeqStart));
        System.out.println("Parallel stream = "+(pSEnd-pSStart));

        

        
    }

}
