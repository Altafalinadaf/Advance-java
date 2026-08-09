package arrayexamplesprogram;
public class JaggedArrays {
    public static void main(String[] args) {
        System.out.println("Example for the Jagged Array");
        int n[][]=new int[4][]; // this arrays is called as jagged array
        n[0]=new int[4];
        n[1]=new int[2];
        n[2]=new int[3];
        n[3]=new int[5];

        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                n[i][j]=(int)(Math.random()*10);

            }

        }
        for(int m[]:n){
            for(int i:m){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
