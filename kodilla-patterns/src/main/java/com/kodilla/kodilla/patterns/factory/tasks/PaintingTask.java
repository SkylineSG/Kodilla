package com.kodilla.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isExecuted = false;

    public PaintingTask(final String taskName,final String color,final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
