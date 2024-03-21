package codecrafters;

import java.util.ArrayList;
import java.util.List;

class TaskList {
    private static TaskList instance;
    private List<TaskObserver> observers = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();
    
    private String operacaoAtual;

    private TaskList() {}

    public static TaskList getInstance() {
        if (instance == null) {
            instance = new TaskList();
        }
        return instance;
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void addTask(String task) {
        tasks.add(task);
        operacaoAtual = "Adicionar: " + task;
        notifyObservers();
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            operacaoAtual = "Remover - " + index;
            tasks.remove(index);
            notifyObservers();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

    private void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(operacaoAtual);
        }
    }
}

