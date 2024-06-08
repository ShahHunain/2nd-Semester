public class Person{
    private Job job;

    public Person(Job job){
        this.job=job;
        job.setSalary(100000.99);
        System.out.println("Salary: "+job.getSalary());
    }

    public Job getJob() {
        return job;
    }
}