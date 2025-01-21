package past_years.WIX1002_2020.Q5;

public class Q5 {
    public static void main(String[] args) {

        CloudPackage[] cloudPackages = {
                new CloudPackage("P2-15", 4, 15, 1.24),
                new CloudPackage("P2-30", 6, 30, 2.11),
                new CloudPackage("R5-20", 4, 20, 1.38),
                new CloudPackage("R6-20", 6, 20, 1.88)
        };

        Job[] jobs = {
                new Job("J1", 252, 20),
                new Job("J2", 108, 10),
                new Job("J3", 72, 25),
        };

        double totalCost = 0.0;
        for (Job job : jobs) {
            double cost = (double) job.numberOfTasks;
            String packageName = "";
            for (CloudPackage cloudPackage : cloudPackages) {
                if (job.memory <= cloudPackage.memory) {
                    if (cloudPackage.executeJob(job.numberOfTasks) < cost) {
                        cost = cloudPackage.executeJob(job.numberOfTasks);
                        packageName = cloudPackage.getPackageName();
                    }
                }
            }
            System.out.println(
                    "Job Name: " + job.getJobName() + " Memory = " + job.getMemory() + " Number Of Task = "
                            + job.getNumberOfTasks());
            System.out.println(
                    "Cloud Package: " + packageName + " Total Cost = " + Math.round(cost * 100.00) / 100.00 + "\n");
            totalCost += cost;
        }

        System.out.println("Total cost = " + totalCost);

    }

    // Cloud package
    public static class CloudPackage extends Cloud {
        String packageName;

        public CloudPackage(String packageName, int numberOfCore, int memory, double pricePerHour) {
            super(numberOfCore, memory, pricePerHour);
            this.packageName = packageName;
        }

        // Getter methods
        public String getPackageName() {
            return this.packageName;
        }

        public int getNumberOfCore() {
            return this.numberOfCore;
        }

        public int getMemory() {
            return this.memory;
        }

        public double executeJob(int numberOftask) {
            double cost = (double) ((numberOftask * this.pricePerHour) / this.numberOfCore);
            return cost;
        }
    }
}
