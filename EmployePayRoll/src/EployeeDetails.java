import java.util.ArrayList;
import java.util.*;
import com.employee.*;
public class EployeeDetails {
    public static void main(String[] args) {
        ArrayList<Employee> employee=new ArrayList<Employee>();
        while(true){
            System.out.println("Enter 1 for insert employee details.");
            System.out.println("Enter 2 for displays employee details.");
            System.out.println("Enter 3 for exit.");
            Scanner in=new Scanner(System.in);
            int ch=in.nextInt();
            if(ch==1){
                System.out.println("Enter Employee Id: ");
                int id=in.nextInt();
                System.out.println("Enter Employee Name: ");
                String name=in.next();
                System.out.println("Enter Employee salary: ");
                double salary=in.nextDouble();
                System.out.println("Enter Employee salary deduction: ");
                double salaryDeduction=in.nextDouble();
                Employee em=new Employee(id,name,salary,salaryDeduction);
                employee.add(em);
            }else if(ch==2){
                Paystub display=new Paystub();
                for(Employee emp:employee){
                    display.displaypaystub(emp);
                }
            }else{
                break;
            }
        }
        System.out.println("**Thanks for visit**");
    }

}
