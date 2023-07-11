public class InstrumentToSell extends Instrument
{
    //initializing the variables
    private float price;
    private String sellDate;
    private float discountPercent;
    private boolean isSold;
    
    /**constructor for InstrumentToSell subclass*/
    public InstrumentToSell(String Instrument_Name, float Price)
    {
        super(Instrument_Name);
        this.price           = Price;
        this.sellDate        = "";
        this.discountPercent = 0;
        this.isSold          = false;
    }
    
    //creating accessor(getter) method for all variables
    public float getPrice()
    {
        return this.price;
    }
    
    public String getSellDate()
    {
        return this.sellDate;
    }
    
    public float getDiscountPercent()
    {
        return this.discountPercent;
    }
    
    public boolean getIsSold()
    {
        return this.isSold;
    }
    
    //setting setter(mutator) method for all variables
    public void setPrice(float price)
    {
        if(this.isSold == false) {
            this.price = price;
        }
        else{
            System.out.println("The item has already been sold. Price cannot be changed.");
        }
    }
    
    public void setSellDate(String sellDate)
    {
        this.sellDate = sellDate;
    }
    
    public void setDiscountPercent(float discountPercent)
    {
        this.discountPercent = discountPercent;
    }
    
    public void setIsSold(boolean isSold)
    {
        this.isSold = isSold;
    }
    
    /**method to sell the instruments*/
    /*
      This is a method to sell the instruments which accepts five parameters.
      If the instrument is already sold then a message is shown with customers details.
      If not then the required actions are performed as shown below.
     */
    public void sell_instrument(String Customer_Name, String Customer_MobileNo, int Customer_PAN_No, String sellDate, int discountPercent)
    {
        if(this.isSold == true) {
            System.out.println("The instrument has already been sold out.");
            System.out.println("Customer Name: " + getCustomerName());
            System.out.println("Customer Mobile No.: " + getCustomerMobileNo());
            System.out.println("Customer PAN No.: " + getCustomerPANNo());
        }
        
        else{
            super.setCustomerName(Customer_Name);
            super.setCustomerMobileNo(Customer_MobileNo);
            super.setCustomerPANNo(Customer_PAN_No);
            this.sellDate = sellDate;
            this.discountPercent = discountPercent;
            this.isSold = true;
            price = this.price - (discountPercent/100) * this.price; //discount amount=(discount%/100) * price 
        }
    }
    
    /**method to display the results*/
    /*
      This is the display method of the subclass InsrumentToSell which has the same signature as the display method of super class Instrument.
      A call is made to the display method of super class to display Instrument_ID and Instrument_Name.
      If the instrument is already sold then customer details and sold date are displayed.
     */
    public void display()
    {
        super.display();//calling the display method of Instrument class to display the Instrument ID and Instrument Name
        
        System.out.println("Price of the Instrument: " + price);//price is displayed
        
        if(this.isSold == true) {
            System.out.println("Sold Date: " + this.sellDate);
        }
    }
}