package practiceSetProgram.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamExamples {
    public static void main(String[] args) {
        
        int size=1000;
        List<Integer> list=new ArrayList<>(size);
        Random random=new Random();
        for(int i=0;i<size;i++){
            list.add(random.nextInt(100));
        }

        long staSeq = System.currentTimeMillis();
        
        int res=list.stream()
        .map(n->
            {
                try{
                    Thread.sleep(1);
                    
                }
                catch(InterruptedException e){

                }
                return n*2;
            }).mapToInt(n->n).sum();

        long endSeq = System.currentTimeMillis();

        long strPar = System.currentTimeMillis();
        int res2=list.parallelStream()
        .map(n->
            {
                try{
                    Thread.sleep(1);
                }
                catch(Exception e){

                }
            return n*2;
        }).reduce(0, (a,b)->a+b);
        
        long endPar = System.currentTimeMillis();

        System.out.println(res);
        System.out.println(res2);
        System.out.println("seq = "+(endSeq-staSeq));
        System.out.println("Para = "+(endPar-strPar));
    }

}
