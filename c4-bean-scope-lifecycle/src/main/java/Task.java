import java.util.Random;

public class Task {
    private String taskName;
    private Integer taskId = 0;
    private Integer executionTime;
    private int numberOfTasks = 0;

    public Task() {
        numberOfTasks++;
        System.out.println("Current number of instances/task is: " + numberOfTasks);
    }

    public void run() throws InterruptedException {
        Thread.sleep(executionTime);
    }

    public Integer generateId() {
        return taskId++;
    }

    public void setNumberOfTasks() {
        this.numberOfTasks++;
    }

    public int getNumberOfTasks(){
        return numberOfTasks;
    }

    private void init() {
        System.out.println("This method is called at initialization");
        generateId();
        this.taskName = "Task" + taskId;

        Random random = new Random();
        this.executionTime = random.ints(1,20).findFirst().getAsInt();
    }

    private void destroy() {
        System.out.println("The task destroyed is " + taskName);
        System.out.println("number of task before destruction is: " + numberOfTasks);
        numberOfTasks--;
        System.out.println("number of task After destruction is: " + numberOfTasks);
    }
}
