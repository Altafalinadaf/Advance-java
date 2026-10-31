package practiceSetProgram.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SeqAndParStream {
    public static void main(String[] args) {
        int size=10000;
        List<Integer> nums=new ArrayList<>(size);
       
        Random random=new Random();
        for(int i=0;i<size;i++){
            nums.add((int)(Math.random()*100));
            // nums.add(random.nextInt(100));
        }

        long startSeq=System.currentTimeMillis();
        int result = nums.stream()
        .map(n->{
                try{
                    Thread.sleep(1);
                }
                catch(Exception e){

                }
                return n*2;
               
            }).mapToInt(n->n).sum();
            
        long endtSeq=System.currentTimeMillis();

        long startPara=System.currentTimeMillis();
        int result2 = nums.parallelStream()
        .map(n->{
            try{
                Thread.sleep(1);
            }
            catch(Exception e){
                
            }
            return n*2 ;
        }).mapToInt(n->n).sum();

        long endPara=System.currentTimeMillis();

        System.out.println(result+ " = "+result2);

        System.out.println("normal stream "+(endtSeq-startSeq));
        System.out.println("Parallel stream "+(endPara-startPara));


       
        

    }

}
