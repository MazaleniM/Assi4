package za.ac.cput.assingment4;
import za.ac.cput.assingment4.Employee;

/**
 * Created by student on 2015/02/26.
 */
public class CommissionEmployee extends Employee{

    private  float commissionSalary;

    public CommissionEmployee()
    {

    }

    public CommissionEmployee(String empName,String empSurname,int empNo,float empSalary,float cs)
    {
             super(empName,empSurname,empNo,empSalary);
            commissionSalary = cs;
    }
}
