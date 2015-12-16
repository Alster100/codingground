public class Customer
{
    String customerName;
    double totalSales;
    
    public Customer(String Name, double Sales)
    {
        customerName = Name; 
        totalSales = Sales;
    }
    
    public String getName()
    {
        return customerName;
    }
    
    public double getSale()
    {
        return totalSales;
    }
    
    public void addSale(double sale)
    {
        totalSales += sale;
    }
    
    
    
    
    
    
}