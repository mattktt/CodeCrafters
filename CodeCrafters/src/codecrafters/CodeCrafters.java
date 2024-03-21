
package codecrafters;

import java.util.Scanner;

public class CodeCrafters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Singleton
        TaskList taskList = TaskList.getInstance();
        
        //Observer
        TaskListView taskListView = new TaskListView(taskList);
        
        //Factory and Command
        Command taskCommand = CommandFactory.createTaskCommand(taskList);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Visualizar tarefas");
            System.out.println("4. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Digite a tarefa:");
                    String task = scanner.nextLine();
                    taskCommand.add(task);
                    break;
                case 2:
                    System.out.println("Digite o índice da tarefa a ser removida:");
                    int index = scanner.nextInt();
                    taskCommand.remove(index);
                    break;
                case 3:
                    taskListView.displayTasks();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
