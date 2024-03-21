package codecrafters;

public class CommandFactory {
    public static Command createTaskCommand(TaskList taskList) {
        return new TaskCommand(taskList);
    }
}