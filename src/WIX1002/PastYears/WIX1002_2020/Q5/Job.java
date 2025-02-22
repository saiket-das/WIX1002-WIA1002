package WIX1002.PastYears.WIX1002_2020.Q5;

public class Job {
    String jobName;
    int numberOfTasks;
    int memory;

    public Job(String jobName, int numberOfTasks, int memory) {
        this.jobName = jobName;
        this.numberOfTasks = numberOfTasks;
        this.memory = memory;
    }

    // Getter methods
    public String getJobName() {
        return this.jobName;
    }

    public int getNumberOfTasks() {
        return this.numberOfTasks;
    }

    public int getMemory() {
        return this.memory;
    }
}
