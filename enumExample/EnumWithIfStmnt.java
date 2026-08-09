package enumExample;


enum Status2{
    Running, Failed, Pending, Success
}



public class EnumWithIfStmnt {
    public static void main(String[] args) {
        Status2 s2=Status2.Failed;

        if(s2==Status2.Pending)
            System.out.println("Its pending");
        else if(s2==Status2.Running)
            System.out.println("Please wait");
        else if(s2==Status2.Success)
            System.out.println("complete ");
        else
            System.out.println("Failed");
        
    }

}
