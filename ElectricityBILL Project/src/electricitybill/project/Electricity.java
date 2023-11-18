/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitybill.project;

/**
 *
 * @author rayan
 */
public class Electricity {
    private String name,address,date;
    private int accountNO;
    private double arrears,pmr,cmr,totalUnit,currentCharge,totalBill;

    public Electricity(int accountNO,String name, String address, String date,  double arrears, double pmr, double cmr,double totalUnit,double currentCharge,double totalBill) {
        this.accountNO = accountNO;
        this.name = name;
        this.address = address;
        this.date = date;
        this.arrears = arrears;
        this.pmr = pmr;
        this.cmr = cmr;
        this.totalUnit = totalUnit;
        this.currentCharge=currentCharge;
        this.totalBill = totalBill;
    }

    public String toString()
{
    String output=null;
    output=("Acoount Number\tOwner Name\tDate\tAddress\tArrears\tPMR\tCMR\tTotal Unit\tCurrent Charge\tTotal Bill\n"+accountNO+"\t"+"\t"+name+"\t"+date+"\t"+address+"\t"+arrears+"\t"+pmr+"\t"+cmr+"\t"+totalUnit+"\t"+currentCharge+"\t"+totalBill);
    return
           output;             
}    
    
 public String toStringForFile()
{    
    String output;
    output=(accountNO+"\t"+"\t"+name+"\t"+date+"\t"+address+"\t"+arrears+"\t"+pmr+"\t"+cmr+"\t"+totalUnit+"\t"+currentCharge+"\t"+totalBill);
    
return String.format("%-15s%-15s%-15s%-25s%-10.2f%-10.2f%-10.2f%-15.2f%-15.2f%-15.2f%n",accountNO,name,date,address,arrears,pmr,cmr,totalUnit,currentCharge,totalBill);

    
}

    public String getName() {
        return name;
    }

    public String getAdrees() {
        return address;
    }

    

    public String getDate() {
        return date;
    }

   

    public int getAcountNo() {
        return accountNO;
    }

    
    public double getArrears() {
        return arrears;
    }

    

    public double getPmr() {
        return pmr;
    }

   

    public double getCmr() {
        return cmr;
    }

  

    public double getTotalUnit() {
        return totalUnit;
    }

    
    public double getTotalBill() {
        return totalBill;
    }

  
    
    public double getCurrentCharge() {
        return currentCharge;
    }

   
    
    
    
}
