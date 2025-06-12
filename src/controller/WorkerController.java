/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller;

import java.util.ArrayList;
import java.util.List;
import model.Worker;
import service.WorkerService;
import workerDTO.WorkerDTO;

/**
 *Created by Tungtpat05 on Jun 11, 2025.
 */
public class WorkerController {
    private List<Worker> workerList = new ArrayList<>();
    private WorkerDTO workerDTO = new WorkerDTO();
    private WorkerService workerService = new WorkerService();
    
    //Take input info from DTO
    public void setInputInfo(WorkerDTO workerDTO) {
        this.workerDTO = workerDTO;
    }
    
    //Check existed ID
    private boolean isExistedID() {
        for (Worker worker : workerList) {
            if(worker.getId().equalsIgnoreCase(workerDTO.getId())) {
                //Found ID
                return true;
            }
        }
        //Not found ID
        return false;
    }
    
    //Add a new worker
    public boolean addWorker() {
        if(!isExistedID()) {
            //Add a new worker
            workerList.add(new Worker(workerDTO.getId(), workerDTO.getName(), workerDTO.getAge(), workerDTO.getSalary(), workerDTO.getWorkLocation()));
            return true;
        }
        
        return false;
    }
    
    
}
