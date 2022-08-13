import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class atm{
    public static void main(String[] args){
        System.out.println("Enter Your Pin");
        int pin = 1234;
        int balance = 10000;

        int Addamount = 0;
        int Withdrawlamount = 0;

        Scanner scan = new Scanner(System.in);

        int pin1 = scan.nextInt();

       

        if(pin1==pin){
            System.out.println("Enter Your name");
            String Name = scan.next();
            System.out.println(" Welcome  " + Name);
        }

        while(true){
            System.out.println("Press 1 to check Your Balance") ;
            System.out.println("Press 2 to Add Amount") ;
            System.out.println("Press 3 to Withdrawlamount") ;
            System.out.println("Press 4 to Take Reciept") ;
            System.out.println("Press 5 to EXIT") ;

            int option = scan.nextInt();

            switch(option)
            {
             case 1:
             System.out.println("Your Current Balance : " + balance) ;
             break;

             case 2:
             System.out.println("How much did you want to add amount in your account") ;
             Addamount=scan.nextInt();
             System.out.println("Successfully Credited") ;
             balance = Addamount + balance;
             break;

             case 3:
             System.out.println("How much did you want to withdrawl");
             Withdrawlamount = scan.nextInt();
               
              if(Withdrawlamount>balance){
                System.out.println("Insufficient balance ");

              }

              else {
                System.out.println("Successfully Withdrawl");
                balance = balance - Withdrawlamount;
              }
              break;
        

                case 4:
                System.out.println("All in one in Atm");
                System.out.println("Successfully deposited" + Addamount);
                System.out.println("Successfully Withdrawl" + Withdrawlamount);
                System.out.println("Avaliable Balance" + balance);
                System.out.println("Thanks for use the ATM");
                break;

                default:
                System.out.println("Press number below 5");
                break;



              }

              if(option==5){
                System.out.println("Thankyou");
                break;

}
            
            
    }
        
    
        }
        
}
