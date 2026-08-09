package assignmentcode;

// - Extends Employee

class Employee{
    private String name;
    private double salary;
    
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    
    public void getDetails(){
        System.out.println("Name: "+ getName() + ", Salary: "+getSalary());
    }
}


class Manager extends Employee{
    private String department;
    Manager(String name, double salary, String department){
        super(name,salary);
        this.department=department;
        
    }
    
    public void getDetails(){
        System.out.println("Name: "+getName() + ", Salary: "+getSalary()+ ", Department: "+department);
    }
    
    
}

public class EmployeeExample {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        // TODO: Print their details using getDetails()
        Employee emp=new Employee("Alice",50000.0);
        Employee man=new Manager("Bob",80000.0,"IT");
        emp.getDetails();
        man.getDetails();
    }

}
