public class Ticket_Machine
{
    private int price;
    private int balance;
    private int total;
    
    public Ticket_Machine (int ticketcost)
    {
        price = ticketcost;
        balance = 0;
        total = 0;
        
    }
    
    public int getPrice()
    {
            return price;
    }
    
    public int getBalance()
    {
            return balance;
    }
    
    public void insertMoney(int amount)
    {
        if(amount > 0){
            balance = balance + amount;
    } 
     else {
        System.out.println("Use a positive amount: " + amount);
    }
    }
    
    public void printTicket() {
        if(balance >= price){
            System.out.println("#########################################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("#" + price + "cents.");
            System.out.println("#########################################");
            System.out.println();
        
            total = total + balance;
        
            balance = 0;
        }
        else {
            System.out.println("You must insert at least: " + 
            (price - balance) + "more cents");
        }
    }
}
