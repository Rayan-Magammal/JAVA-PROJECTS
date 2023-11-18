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
public class Calculation {
    
     private double arrears,pmr,cmr;

    public Calculation(double arrears, double pmr, double cmr) {
        
        this.arrears = arrears;
        this.pmr = pmr;
        this.cmr = cmr;
        
    }

    public double totalUnit(double cmr,double pmr){
        double totalUnit = cmr - pmr;
        return totalUnit;
    }
    
   public double CurrentCahrge(double totalUnit){
      double CurrentCahrge;
       
        if (totalUnit <= 200) {
            CurrentCahrge = 200*0.218;
        }else if (totalUnit > 200 && totalUnit <= 300) {
            CurrentCahrge = (200*0.218)+( 100 *0.334);
        }else if (totalUnit > 300 && totalUnit <= 600) {
            CurrentCahrge = (200*0.218) + (100*0.334)+(300 *0.516);
        }else if (totalUnit > 600 && totalUnit <= 900) {
            CurrentCahrge = (200*0.218)+ (100*0.334)+ (300*0.516) +( (totalUnit-600) *0.546);
        }else{
            CurrentCahrge = (200*0.218) + (100*0.334) + (300*0.516) + (300*0.546) + ( (totalUnit-900) *0.571);
        }
    return CurrentCahrge;

}
   
   public double totalBill(double arrears,double CurrentCahrge){
       double totalBill=arrears+CurrentCahrge;
       return totalBill;
   }
   
}

