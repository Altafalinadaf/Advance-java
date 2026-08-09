package enumExample;


enum Status3{
    Running, Pending, Failed, Sucess
}
public class EnumWithSwitch {
    public static void main(String[] args) {
        Status3 s=Status3.Failed;
        
        switch(s){
            case Running:
                System.out.println("Its runnig");
                break;
            case Failed:
                System.out.println("Its failed");
                break;
            case Pending:
                System.out.println("its Pending");
                break;
            case Sucess:
                System.out.println("Its done");
                break;
            default:
                System.out.println("Not matched");


        }
    }

}
