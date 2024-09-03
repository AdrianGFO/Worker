package Program;

import entities.Worker;
import entities.Enums.WorkerLevel;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        
        

        Scanner sc = new Scanner(System.in);

        ArrayList<Object> WorkerComplete = new ArrayList<>();
        ArrayList<Object> Contract = new ArrayList<>();
        
        int decisao, count = 1;

        
        for(int i = 0; i < count; i++){
        System.out.print("Enter worker data: \nNome: ");
        String nome = sc.nextLine();

        System.out.println("Base salarial: ");
        Double salario_base = sc.nextDouble();


        
        Worker empregado = new Worker(nome, salario_base);
        
        WorkerComplete.add(empregado);
        

        System.out.println("Continuar? (1-Sim  2-Não)");
        decisao = sc.nextInt();
        sc.nextLine();

        if(decisao == 1){
            count ++;
            }
        }
        
        System.out.println(WorkerComplete);
        
    
    }
}
