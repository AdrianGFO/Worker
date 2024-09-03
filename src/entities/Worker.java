package entities;

import entities.Enums.WorkerLevel;
import entities.HourContract;

public class Worker {
    private String name; 
    private WorkerLevel level;
    private Double baseSalary;

    public Worker(String name, Double baseSalary){
        this.name = name;
        this.level = WorkerLevel.JUNIOR;
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

    public void addContract(HourContract contract){
        
    }



    @Override
    public String toString() {
        return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + "]";
    }
    
}
//oi

