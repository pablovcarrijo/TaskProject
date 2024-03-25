package applicatio;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Task;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Map<Integer, Task> map = new LinkedHashMap<>();
		
		int proxId = 1;
		
		System.out.println("1 - Add a task");
		System.out.println("2 - List pading tasks");
		System.out.println("3 - Mark task completed");
		System.out.println("4 - Remove task");
		System.out.println("5 - Exit");
		int opc;
		System.out.println();
		
		do {
			
			System.out.print("Choose an option: ");
			opc = sc.nextInt();
			
			switch(opc) {
			case 1:
				System.out.print("Title: ");
				sc.nextLine();
				String title = sc.nextLine();
				
				System.out.print("Description: ");
				String description = sc.nextLine();
				
				map.put(proxId++, new Task(title, description));
				
				System.out.println("Tarefas adicionadas com sucesso!");
				System.out.println();
				break;
			
			case 2:
				System.out.println("Tarefas pedentes: ");
				for(Integer mp : map.keySet()) {
					System.out.println("Id: " + mp + map.get(mp).toString());
				}
				System.out.println();
				break;
				
			case 3:
				System.out.print("ID da tarefa a ser marcada como concluida: ");
				int taskConcluded = sc.nextInt();
				Task concludedTask = map.get(taskConcluded);
				if(concludedTask != null) {
					concludedTask.setConcluded();
					map.remove(taskConcluded);
					System.out.println("Tarefa concluida!");
				}
				else {
					System.out.println("Task not found");
				}
				System.out.println();
				break;
				
			case 4:
				System.out.print("Id da tarefa a ser removida: ");
				int removeId = sc.nextInt();
				if(map.remove(removeId) != null) {
					System.out.println("Task removed");
				}
				else if(map.remove(removeId) == null){
					System.out.println("Task not found");
				}
				System.out.println();
				break;
				
			case 5:
				System.out.println();
				System.out.println("Exited");
				break;
				
			default:
				System.out.println("Invalid number");
				break;
			}
			
		}
		while(opc != 5);
		
		sc.close();
	}
	
}
