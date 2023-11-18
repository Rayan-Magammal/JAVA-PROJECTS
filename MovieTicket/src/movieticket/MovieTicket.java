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
public class MovieTicket {
    private String customerName;
    public String customerType;
    public String PhoneNumber;
    public String bookingDay;
    public String bookMovie;
    public int NoOfTicket;
    public String bookTime;
    public String numOfSeats;
    public double payemtPerTicket,totalPayment;

    public MovieTicket(String customerName, String customerType, String PhoneNumber, String bookingDay, String bookMovie, int NoOfTicket, String bookTime, String numOfSeats, double payemtPerTicket, double totalPayment) {
        this.customerName = customerName;
        this.customerType = customerType;
        this.PhoneNumber = PhoneNumber;
        this.bookingDay = bookingDay;
        this.bookMovie = bookMovie;
        this.NoOfTicket = NoOfTicket;
        this.bookTime = bookTime;
        this.numOfSeats = numOfSeats;
        this.payemtPerTicket = payemtPerTicket;
        this.totalPayment = totalPayment;
    }
    
public String toString()
{
    String output=null;
    output=("Customer Name\tCustomer Type\tPhone Number\tBooking Day\tMovie\tNumber Of Ticket\tTime\tNumber of seats\tPayment per Ticket\tTotal Payment\n"+customerName+"\t"+"\t"+customerType+"\t"+PhoneNumber+"\t"+bookingDay+"\t"+bookMovie+"\t"+NoOfTicket+"\t"+"\t"+bookTime+"\t"+numOfSeats+"\t"+"\t"+payemtPerTicket+"\t"+"\t"+totalPayment);
    return output;             
}    
 public String toStringForFile()
{    
    String output;
    output=(customerName+"\t"+"\t"+customerType+"\t"+PhoneNumber+"\t"+bookingDay+"\t"+bookMovie+"\t"+NoOfTicket+"\t"+bookTime+"\t"+numOfSeats+"\t"+payemtPerTicket+"\t"+totalPayment);
    
return String.format("%-15s%-15s%-15s%-25s%-15s%-25d%-15s%-15s%-20.2f%-20.2f%n",customerName,customerType,PhoneNumber,bookingDay,bookMovie,NoOfTicket,bookTime,numOfSeats,payemtPerTicket,totalPayment);

    
}   
    

    
    
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getCustomerPhoneNumber() {
        return PhoneNumber;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public String getBookMovie() {
        return bookMovie;
    }

    public String getBookTime() {
        return bookTime;
    }

    public String getNumOfSeats() {
        return numOfSeats;
    }

    public double getPayemtPerTicket() {
        return payemtPerTicket;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

 
    
    
}
