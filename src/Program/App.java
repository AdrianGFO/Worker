package Program;

import entities.*;
import entities.Enums.WorkerLevel;
import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import java.text.SimpleDateFormat;


public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
        System.out.println("Enter worker data: \nDepartment: ");
        String dep = sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Level: ");
        String workerLevel = sc.nextLine();

        System.out.println("Base salary: ");
        Double salario_base = sc.nextDouble();

        Worker worker = new Worker(nome, WorkerLevel.valueOf(workerLevel), salario_base, new Department(dep));

        System.out.println("Quantos contratos o trabalhador vai ter: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Enter contract #" + (i + 1) + " data: ");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por Horas: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        
        sc.close();
    }
}
