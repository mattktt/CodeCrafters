/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codecrafters;

/**
 *
 * @author Kateto
 */
public class TaskCommand implements Command {
    private TaskList taskList;

    public TaskCommand(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public void add(String taskName) {
        taskList.addTask(taskName);
    }

    @Override
    public void remove(int index) {
        taskList.removeTask(index);
    }

    @Override
    public void show(int index) {
    }

 

}
