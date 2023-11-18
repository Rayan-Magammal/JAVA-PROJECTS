import java.util.Scanner;
public class Project {
//static variables, arrays declaration
public static Scanner sc = new Scanner(System.in);
public static String ComputerName[] = new String[50];
public static int computerQuantity[] = new int[50];
public static String custType[] = new String[50];
public static String orderType[] = new String[50];
public static double payment[] = new double [50];
public static int orderNo = 0, choice;
public static double sum=0.0;

//this method displays the main menu
public static void displayMenu()
{
   System.out.println("MAIN MENU"); 
   System.out.println("1. ORDER A COMPUTER");
   System.out.println("2. UPDATE A COMPUTER");
   System.out.println("3. DELETE A COMPUTER");
   System.out.println("4. SEARCH FOR A COMPUTER");
   System.out.println("5. VIEW ALL COMPUTER");
   System.out.println("6. EXIT");
   System.out.print("PLEASE CHOOSE ONE OF THE ABOVE OPTIONS:");
   choice= sc.nextInt();
}//displayMenu
 
 //this method adds computer orders into the arrays

public static void orderMeal()
{
   char choiceAdd;
   System.out.println("=============================================");
   System.out.println(" <<<<<<<<<<<<ORDER A COMPUTER>>>>>>>>>>>>");
   System.out.println("=============================================");
   //this do..while loop will repeat until the user chooses 'N'
   do {
   //read input about customer's information and save the information in appropriate array
   System.out.print("COMPUTER MENU\n1-DELL                   RM 4500.00\n2-HP                 RM 3000.00\n3-LENOVO                 RM 2000.00\n4-MACBOOK                RM 25000.00\n"+
   "Please type computer's name that you want to order:");
   ComputerName [orderNo] =sc.next()+sc.nextLine();
   System.out.print("Enter order's quantity: ");
   computerQuantity [orderNo] =sc.nextInt();
   System.out.print("Enter customer's type [GOLDEN/REGULAR]: ");
   custType [orderNo] =sc.next()+sc.nextLine();
   System.out.print("Enter order type [CASH/CREDIT CARD]: "); 
   orderType[orderNo] =sc.next()+sc.nextLine();

   calculatePayment (orderNo); //call method calculatePayment to calculate the totatal payment
   System.out.println();
   System.out.printf("Total Payment of this computer is RM %.2f%n" ,payment [orderNo]);//access 
   sum+=payment [orderNo];
   System.out.println("COMPUTER HAS BEEN ORDERED SUCCESSFULLY!!!\n");
   System.out.println("------------------------------------------");
   System.out.print("DO YOU WANT TO ADD ANOTHER ORDER (Y/N): "); 
   choiceAdd =sc.next().charAt(0); 
   System.out.println("------------------------------------------");
   orderNo++; //add current order number
   }while ((choiceAdd=='y')||(choiceAdd== 'Y'));
}//addRecord

//this method updates records in the arrays either phone number/no.of stay/room type
public static void updateRecord()
{
  int chooseUpdate, flag = 0;
  String orderUpdate;
  System.out.println("==========================================");
  System.out.println(" <<<<<<<<<<<UPDATE A RECORD>>>>>>>>>>>>");
  System.out.println("===========================================");
  System.out.print("1-DELL\n2-HP\n3-LENOVO\n4-MACBOOK \nEnter the COMPUTER name that you would like to update:"); 
  orderUpdate= sc.next()+sc.nextLine();

  for (int i = 0; i < orderNo; i++)
  {
    if(ComputerName[i].equals(orderUpdate))
    {
      System.out.println("You want to update information of "+ ComputerName[i]+" COMPUTER"); 
      System.out.print("Choose which information you would like to update: [1- Order Type] | 2- Quantity | 3-Customer Type]:"); 
      chooseUpdate=sc.nextInt();
      //update the record according to customer's choice

      if (chooseUpdate ==1)
       {
        System.out.print("Enter new Order Type[CASH/CREDIT CARD]: ");
        orderType[i] =sc.next()+sc.nextLine();
       }
      else if (chooseUpdate == 2) 
      {
       System.out.print("Enter new quantity of computer: "); 
       computerQuantity[i] =sc.nextInt();
       calculatePayment(i);//call method calculatePayment to recalculate total payment

      }
     else
     {
      System.out.print("Enter new customer type [GOLDEN/REGULAR]: "); 
      custType[i]=sc.next()+ sc.nextLine(); 
      calculatePayment(i);//call method calculatePayment to recalculate total payment
     }


    flag = 1;
    break;
   }//if
  }//for
  
  sum=0.0;// For loop for recalculating the total payment for all computer
    for (int i = 0; i <= orderNo; i++)
    {
       sum+=payment [i];
       }

  if(flag==0)
   System.out.println("THE ORDER DOES NOT EXIST IN THE RECORD!");
  else
    System.out.println("ORDER HAS BEEN UPDATED SUCCESSFULLY!\n");
}//updateRecord
 
public static void deleteOrder()
{
 boolean delete = false;
 int i,j=0;
 String computerDelete; 
 System.out.println("========================================");
 System.out.println(" <<<<<<<<<<DELETE A ORDER>>>>>>>>>>>");
 System.out.println("========================================");
 System.out.print("Enter the computer's name  that you would like to delete:");
 computerDelete = sc.next()+sc.nextLine(); 
 for (i=0; i < orderNo; i++)
 {
  if (computerDelete.equals(ComputerName[i])) 
  {
   for(j=i;j< ComputerName.length-1;j++){
    ComputerName[j]= ComputerName[j+1]; 
    computerQuantity[j]= computerQuantity[j+1]; 
    custType[j]=custType[j+1]; 
    orderType[j]=orderType[j+1]; 
    payment[j]=payment[j+1];    

   }
    orderNo--;
    delete = true; 
    break;
  }//if
 }//for    
 
   //empty the order in the last index
   ComputerName[j] = "";
   computerQuantity [j] = 0;
   custType[j] = "";
   orderType[j] = "";
   payment [j] = 0.0;
   
  sum=0.0;// For loop for recalculating the total payment for all computers
    for ( i = 0; i <= orderNo; i++)
    {
       sum+=payment [i];
       }


  if (delete == false)
      System.out.println("THE COMPUTER DOES NOT EXIST IN THE VIEW!!!"); 
  else System.out.println("ORDER HAS BEEN DELETED SUCCESSFULLY!!!\n");
}//deleteRecord

//This method displays all records available in the arrays 
public static void viewOrder()
 {
     double amount;
     //this method display all ordes availbale in the arrays
     System.out.println("---------------------------------------------------------------------------");
     System.out.printf("%-15s%-15s%-15s%15s%10s\n","Computer Name","Cust Type","Order Type","Computer Quantity","Payment");
     System.out.println("---------------------------------------------------------------------------");
     

     
     //to peint the label for the display table 
     for(int i = 0; i< orderNo; i++)
     {

      System.out.printf("%-16s%-15s%-20s%-13d%-10.2f\n",ComputerName[i],custType[i],orderType[i],computerQuantity [i],payment [i]);
     }
      System.out.println("---------------------------------------------------------------------------");
      System.out.println("***************************************************************************");

      System.out.println("<<<<<<<<<<<<THE TOTAL PAYMENT OF ALL COMPUTERS OREDERED IS>>>>>>>>>>>>>>>>>>>>>>");
      System.out.printf("                            RM% .2f%n",sum);   
      System.out.println("***************************************************************************");
           
       }//viewRecord

//this method display record of a customer based on customer's computer name
public static void searchOrder()
{
  int flag = 0;
  String computerSearch;
  System.out.print("Enter the computer's name that you would like to search:");
  computerSearch = sc.next()+sc.nextLine();
  
  //to traverse along the array and search the record
   for(int i = 0; i< orderNo; i++)
   {
    if(ComputerName[i].equals(computerSearch))
    {
     System.out.println("\nThe following is the computer's information: ");
     System.out.println("---------------------------------------------------------------------------");
     System.out.printf("%-15s%-15s%-15s%15s%10s\n","Computer Name","Cust Type","Order Type","Computer Quantity","Payment");
     System.out.println("---------------------------------------------------------------------------");
     System.out.printf("%-16s%-15s%-20s%-13d%-10.2f\n",ComputerName[i],custType[i],orderType[i],computerQuantity [i],payment [i]);
     System.out.println("---------------------------------------------------------------------------");
     flag = 1;
     break;
     }
   } //for
  
   if(flag==0)
    System.out.println("THE ORDER DOES NOT EXIST IN THE RECORD!!!");
}//searchRecord

public static void calculatePayment(int index)
{
 double computerPrice, actualCharge;

 if(ComputerName[index].equals("DELL"))
    computerPrice=4500; 
 else if(ComputerName[index].equals("HP"))
    computerPrice=3000;
 else if(ComputerName[index].equals("LENOVO"))
    computerPrice=2000;
 else
    computerPrice=25;
 if(custType[index].equals("GOLDEN")) 
 {
   actualCharge=computerPrice*computerQuantity[index]; 
   payment[index] =actualCharge-(50.0/100*actualCharge);}
 else
 {
   actualCharge=computerPrice*computerQuantity[index];
   payment[index]=actualCharge-(10.0/100*actualCharge);
 }
 
}//calculatePayment
  
public static void main (String [] args) {
  //display welcoming message
  System.out.println("======================================================");
  System.out.println("<<<<<<<<<WELCOME TO NAR BURGER RESTAURANT>>>>>>>>>");
  System.out.println("======================================================");
 
  //this do..while loop will repeat until user chooses 6
  do{
   displayMenu(); //method call to display main menu  
   
   //this switch will call appropriate method as chosen by user
  switch(choice)
  {
   case 1 : orderMeal(); break;
   case 2 : updateRecord(); break;
   case 3 : deleteOrder(); break;
   case 4 : searchOrder(); break;
   case 5 : viewOrder(); break;
   } //switch
  } while(choice !=6);
  
  System.out.println("=========================================");
  System.out.println("<<<<<<<YOU CHOOSE TO EXIT. THANK YOU>>>>>");
  System.out.println("=========================================");
 } //class
} //main