package codecrafters;

import java.util.List;

class TaskListView implements TaskObserver {
    private TaskList taskList;

    public TaskListView(TaskList taskList) {
        this.taskList = taskList;
        this.taskList.addObserver(this);
    }

    @Override
    public void update(String operacao) {
        displayModification(operacao);
    }

    public void displayTasks() {
        List<String> tasks = taskList.getTasks();
        System.out.println("Tarefas:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }
    
    public void displayModification(String operacao){
        System.out.println("Operação realizada: " + operacao);
    }
}

