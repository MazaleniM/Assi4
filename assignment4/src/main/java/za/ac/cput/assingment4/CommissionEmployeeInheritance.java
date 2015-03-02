package za.ac.cput.assingment4;

/**
 * Created by student on 2015/02/26.
 */
public class CommissionEmployeeInheritance extends EmployeeInheritance {

    private  float commissionSalary;

    public CommissionEmployeeInheritance()
    {

    }

    public CommissionEmployeeInheritance(String empName,String empSurname,int empNo,float empSalary,float cs)
    {
        super(empName,empSurname,empNo,empSalary);
        commissionSalary = cs;
    }
}
