public class Inheritance3 {
    public static void main(String []arg) {
        Plumber p1 = new Plumber("Jason",101,25000);
        p1.printPlumberDetails();
        System.out.println("-------------------------------------------");
        Developer d1 = new Developer("Ramesh",102,125000);
        //d1.printEmployeeDetails();
        d1.printJobDescription();
    }
}

class Employee {
    private String name;
    private int id;
    private int salary;
    Employee(String name,int id,int salary) {
        System.out.println("Employee Class Constructor initializing...");
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void printEmployeeDetails() {
        System.out.println("Employee Name : "+name);
        System.out.println("Employee ID : "+id);
        System.out.println("Salary : "+salary);

    }
}

class Plumber extends Employee {
    Plumber(String name,int id,int salary) {
        super(name,id,salary);
        System.out.println("Plumber Class Constructor initializing...");
    }
    public void printPlumberDetails() {
        super.printEmployeeDetails();
        System.out.println("Job Type: Plumbing");
    }
}
class Developer extends Employee {
    Developer(String name,int id,int salary) {
        super(name,id,salary);
        System.out.println("Developer Class Constructor initializing...");
    }
    public void printJobDescription() {
        super.printEmployeeDetails();
        System.out.println("Job Type: Developer");
    }
}





