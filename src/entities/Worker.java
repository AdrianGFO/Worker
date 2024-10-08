package entities;

import entities.Enums.WorkerLevel;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

import entities.HourContract;

public class Worker { 
    private String name; 
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();
    
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.department = department;
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;    
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLevel(WorkerLevel level){
        this.level = level;
    }

    public WorkerLevel getLevel(){
        return this.level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    public void addContract(HourContract contract){
        contracts.add(contract);

    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
         
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for(HourContract c : contracts){
            cal.setTime(c.getDate());
           int c_year = cal.get(Calendar.YEAR);
           int c_month = 1 + cal.get(Calendar.MONTH);

            if(c_year == year && c_month == month){
                sum += c.totalValue();
        }
    }
        return sum;
        }


    @Override
    public String toString() {
        return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + "]";
    }
    
}


