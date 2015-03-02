package za.ac.cput.assingment4.Composition;

/**
 * Created by student on 2015/02/27.
 */
public class JobComposition {

    private String title;
    private long salary;
    private int id;


    // setters

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setSalary(long salary)
    {
        this.salary = salary;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    // getters


    public String getTitle()
    {
        return title;
    }

    public long getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

}
