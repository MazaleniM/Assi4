package za.ac.cput.assingment4;

/**
 * Created by student on 2015/02/26.
 */
public class EmployeeInheritance {


    private String empName;
    private String empSurname;
    private int empNo;
    private float empSalary;


    public EmployeeInheritance()
    {

    }


    public EmployeeInheritance(String n,String s,int en,float es)
    {
        empName = n;
        empSurname = s;
        empNo  = en;
        empSalary = es;
    }

    public void setName(String n)
    {
        empName = n;
    }

    public String getName()
    {
        return empName;
    }

}
