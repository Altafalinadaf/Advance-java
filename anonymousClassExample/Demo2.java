package anonymousClassExample;

interface PrintData{
    void printData(int data);
}

public class Demo2 {
    public static void main(String[] args) {
        PrintData p=new PrintData() {
            public void printData(int data){
                System.out.println("Show data ");
            }
        };

        p.printData(10);
        
    }

}
