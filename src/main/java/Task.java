public class Task {
    public boolean isDone;
    public String name;

    // constructor
    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    public Task setDone() {
        Task doneTask = new Task(this.name);
        doneTask.isDone = true;
        return doneTask;
    }

    public String getStatusIcon() {
        return (this.isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }
}
