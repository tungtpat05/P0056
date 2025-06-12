/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.SalaryHistory;
import model.Worker;
import utils.GetLocalDate;

/**
 *Created by Tungtpat05 on Jun 11, 2025.
 */
public class WorkerService {
    private List<Worker> workerList = new ArrayList<>();
    private Map<String, List<SalaryHistory>> salaryHistoryMap = new HashMap<>();

    //Setter & Getter
    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }
    
    
    //Up Salary
    public void upSalary(String id, double adjustedMoney) {
        for (Worker worker : workerList) {
            if(worker.getId().equalsIgnoreCase(id)) {
                
                //Up salary
                worker.setSalary(worker.getSalary() + adjustedMoney);
                
                //Initial new salary history
                SalaryHistory salaryHistory = new SalaryHistory(constants.SalaryStatus.UP, GetLocalDate.getDate());
                
                //Create a new arraylist if the id does not exist in MAP, if it exists, do nothing.
                salaryHistoryMap.putIfAbsent(id, new ArrayList<>());
                
                //Add a new history to ArrayList
                salaryHistoryMap.get(id).add(salaryHistory);
            }
        }
    }
    
    //Down Salary
    public void downSalary(String id, double adjustedMoney) {
        for (Worker worker : workerList) {
            if(worker.getId().equalsIgnoreCase(id)) {
                
                //Down salary
                //Missing case amount <0
                //Missing case amount <0
                //Missing case amount <0
                worker.setSalary(worker.getSalary() - adjustedMoney); 
                
                //Initial new salary history
                SalaryHistory salaryHistory = new SalaryHistory(constants.SalaryStatus.DOWN, GetLocalDate.getDate());
                
                //Create a new arraylist if the id does not exist in MAP, if it exists, do nothing.
                salaryHistoryMap.putIfAbsent(id, new ArrayList<>());
                
                //Add a new history to ArrayList
                salaryHistoryMap.get(id).add(salaryHistory);
            }
        }
    }
    
    
}
