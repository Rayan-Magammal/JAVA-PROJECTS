/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticket;

/**
 *
 * @author rayan
 */
public class Calculation {
    private String bookingDay,customerType;
    private int noOfTicket;

    public Calculation(String bookingDay, String customerType, int noOfTicket) {
        this.bookingDay = bookingDay;
        this.customerType = customerType;
        this.noOfTicket = noOfTicket;
    }
    
    public double PaymentPerticket(String bookingDay,String customerType) {
        double paymentPerTicket;
    if (bookingDay.equalsIgnoreCase("Saturday") || bookingDay.equalsIgnoreCase("Sunday"))
    {
        if (customerType.equalsIgnoreCase("Student")){
            paymentPerTicket = 15.00 -(15*0.15);
        }
        else{
             paymentPerTicket = 15.00;
        }
    }
    else{
        if (customerType.equalsIgnoreCase("Student")){
            paymentPerTicket = 10.00 -(10*0.15);}
        else{
             paymentPerTicket = 10.00;
        }
    }
     return paymentPerTicket;
}
    
    public double totalPaymen(double paymentPerTicket){
        double totalPayment=noOfTicket*paymentPerTicket;
        return totalPayment;
        
    }
    
}
