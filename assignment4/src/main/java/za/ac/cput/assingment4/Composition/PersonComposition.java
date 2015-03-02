package za.ac.cput.assingment4.Composition;

/**
 * Created by student on 2015/02/27.
 */
public class PersonComposition {

    private JobComposition  job;

    public PersonComposition()
    {
        job = new JobComposition();

        job.setSalary(35000L);

    }

    public long getSalary()
    {
        return job.getSalary();
    }


}
