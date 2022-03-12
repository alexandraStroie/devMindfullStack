package com.devmind;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Task {
    private String taskName;
    private Integer taskId = 0;
    private Integer executionTime;
    private int numberOfTasks;

    public Task() {
        System.out.printf("Sleep for %d seconds%n", this.executionTime);
        numberOfTasks++;
        System.out.println("Current number of instances/task is: " + numberOfTasks);
    }

    public void run() throws InterruptedException {
        Thread.sleep(this.executionTime);
    }

    public Integer generateId() {
        return taskId;
    }

    public void setNumberOfTasks() {
        this.numberOfTasks++;
    }

    public int getNumberOfTasks(){
        return numberOfTasks;
    }

    private void init() {
        if(Objects.isNull(numberOfTasks)) {
            numberOfTasks = 0;
        }
        numberOfTasks++;
        System.out.println("This method is called at initialization");
        this.taskId = generateId();
        this.taskName = "com.devmind.Task" + taskId;

        Random random = new Random();
        this.executionTime = random.nextInt(1, 21);

        System.out.printf("method init is called for %s, bean id is %d%n", this.taskName, this.taskId);
    }

    private void destroy() {
        System.out.println("The task destroyed is " + taskName);
        System.out.println("number of task before destruction is: " + numberOfTasks);
        numberOfTasks--;
        System.out.println("number of task After destruction is: " + numberOfTasks);
    }
}
