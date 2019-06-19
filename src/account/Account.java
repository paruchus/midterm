/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Sivagama
 */
public class Account 
{

    
        private double balance;
        private double interestRate=0.23;
        private String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            balance=initialBalance;
            user=givenUser;
            
            if(balance<50)
            {
                System.out.println("Account cannot be created");
            }
            else
            
                System.out.println("Account is created");
        }
            //Note that the initial balance must be greater than 50.       


     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=getBalance()+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=getBalance()-amount;

        }
        
     /**The getter for the balance
     * @return the balance
     */
        public double getBalance() 
        {
        return balance;
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            return interestRate;
        }
        
        public double finalBalance(double bal,double interest)
        {
            bal = bal+ (bal*interest);
            return bal;
        }

        

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
    
    
}//class end