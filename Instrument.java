public class Instrument
{
    //initializing the variables
    private static int Instrument_ID;
    private String Instrument_Name;
    private String Customer_Name;
    private String Customer_MobileNo;
    private int Customer_PAN_No;
    
    /**constructor for Instrument super class*/
    public Instrument(String Instrument_Name)
    {
        int ID = 0;
        ID++;
        Instrument_ID          = ID; //Instrument ID is auto incremented
        this.Instrument_Name   = Instrument_Name; 
        this.Customer_Name     = ""; //Empty string
        this.Customer_MobileNo = ""; //Empty string
        this.Customer_PAN_No   = 0; //PAN No initialized as 0
    }
    
    //creating getter(accessor) method of all variables
    public int getInstrumentID()
    {
        return Instrument_ID;
    }
    
    public String getInstrumentName()
    {
        return this.Instrument_Name;
    }
    
    public String getCustomerName()
    {
        return this.Customer_Name;
    }
    
    public String getCustomerMobileNo()
    {
        return this.Customer_MobileNo;
    }
    
    public int getCustomerPANNo()
    {
        return this.Customer_PAN_No;
    }
    
    //Setting setter(mutator) methods for all variables
    public void setInstrumentID(int Instrument_ID)
    {
        Instrument.Instrument_ID = Instrument_ID;
    }
    
    public void setInstrumentName(String Instrument_Name)
    {
        this.Instrument_Name = Instrument_Name;
    }
    
    public void setCustomerName(String Customer_Name)
    {
        this.Customer_Name = Customer_Name;
    }
    
    public void setCustomerMobileNo(String Customer_MobileNo)
    {
        this.Customer_MobileNo = Customer_MobileNo;
    }
    
    public void setCustomerPANNo(int Customer_PAN_No)
    {
        this.Customer_PAN_No = Customer_PAN_No;
    }
    
    /**method to display the details*/ 
    /*
      This is the display method of the super class.
      It displays the Instrument_ID and Instrument_Name.
      It also displays Customer_Name, Customer_MobileNo and Customer_PAN_No if they are not empty or zero.
     */
    public void display() //display method
    {
        System.out.println("Instrument ID: " + Instrument_ID);
        System.out.println("Instrument Name: " + Instrument_Name);
        
        //checking if Customer_Name string is empty or not ot display the result
        if(!Customer_Name.equals("")) {
            System.out.println("Customer Name: " + Customer_Name);
        }
        
        //checking if the Customer_MobileNo string is empty or not to display the result
        if(!Customer_MobileNo.equals("")) {
            System.out.println("Customer Mobile No.: " + Customer_MobileNo);
        }
        
        //checking if the Customer_PAN_No is zero or not to display the details
        if(Customer_PAN_No != 0) {
            System.out.println("Customer PAN No: " + Customer_PAN_No);
        }
    }
}