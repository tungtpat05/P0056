/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import constants.SalaryStatus;

/**
 * Created by Tungtpat05 on Jun 11, 2025.
 */
public class SalaryHistory {

    private SalaryStatus status;
    private String date;

    //Default constructor
    public SalaryHistory() {
    }

    //Parameter constructor
    public SalaryHistory(SalaryStatus status, String date) {
        this.status = status;
        this.date = date;
    }

    //Setter & Getter
    public SalaryStatus getStatus() {
        return status;
    }

    public void setStatus(SalaryStatus status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
