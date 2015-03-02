package za.ac.cput.assingment4;

/**
 * Created by student on 2015/02/26.
 */
public class RugbyPlayerEncapsulation {

    private String name;
    private String surname;
    private int jerseyNumber;
    private float salary;



    public RugbyPlayerEncapsulation()
    {

    }

    public RugbyPlayerEncapsulation(String name,String surname,int jerseyNumber,float salary)
    {
         this.name = name;
        this.surname = surname;
        this.jerseyNumber = jerseyNumber;
        this.salary = salary;

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


    public void setJerseyNumber(int jerseyNumber)
    {
        this.jerseyNumber = jerseyNumber;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }
}
