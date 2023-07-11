public class InstrumentToRent extends Instrument
{
    //initializing the variables
    private float chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    
    /**constructor for InstrumentToRent subclass*/
    public InstrumentToRent(String Instrument_Name, float chargePerDay)
    {
        super(Instrument_Name); //calling super class with one parameter
        this.chargePerDay = chargePerDay;
        this.dateOfRent   = "";
        this.dateOfReturn = "";
        this.noOfDays     = 0;
        this.isRented     = false;
    }
    
    //creating getter(accessor) method for all variables
    public float getChargePerDay()
    {
        return this.chargePerDay;
    }
    
    public String getDateOfRent()
    {
        return this.dateOfRent;
    }
    
    public String getDateOfReturn()
    {
        return this.dateOfReturn;
    }
    
    public int getNoOfDays()
    {
        return this.noOfDays;
    }
    
    public boolean getIsRented()
    {
        return this.isRented;
    }
        
    //setting setter(mutator) method for all variables
    public void setChargePerDay(float chargePerDay)
    {
        this.chargePerDay = chargePerDay;
    }
    
    public void setDateOfRent(String dateOfRent)
    {
        this.dateOfRent = dateOfRent;
    }
    
    public void setDateOfReturn(String dateOfReturn)
    {
        this.dateOfReturn = dateOfReturn;
    }
    
    public void setNoOfDays(int noOfDays)
    {
        this.noOfDays = noOfDays;
    }
    
    public void setIsRented(boolean isRented)
    {
        this.isRented = isRented;
    }
        
    /**method to rent out the instrument to a customer*/
    /*
      This method accepts six parameters.
      If the instrument is not available in the store an appropriate message is shown as shown below.
      If the instrument is available, then a call is made to the super class using respective parameters.
    */
    public void rent_instrument(String Customer_Name, String Customer_MobileNo, int Customer_PAN_No, String dateOfRent, String dateOfReturn, int noOfDays)
    {
        if(isRented == true) {
            System.out.println("The instrument is not currently available. It is already rented.");
            System.out.println("Customer Name: " + getCustomerName());
            System.out.println("Customer Mobile No.: " + getCustomerMobileNo());
            System.out.println("Return Date: " + dateOfReturn);
        }
        else {
            super.setCustomerName(Customer_Name);
            super.setCustomerMobileNo(Customer_MobileNo);
            super.setCustomerPANNo(Customer_PAN_No);
            this.dateOfRent = dateOfRent;
            this.dateOfReturn = dateOfReturn;
            this.noOfDays = noOfDays;
            this.isRented = true;
            float totalCharge = noOfDays * chargePerDay;
            System.out.println("Customer Name: "+ this.getCustomerName());
            System.out.println("Customer phone number: "+ this.getCustomerMobileNo());
            System.out.println("Customer PAN number: "+ this.getCustomerPANNo());
            System.out.println("Instrument rent date: "+ this.dateOfRent);
            System.out.println("Instrument return date: "+ this.dateOfReturn);
            System.out.println("Instrument rented days: "+ this.noOfDays);
            System.out.println("Total Charge: " + totalCharge);
        }
    }
        
    /**method to return the instruments*/
    /*
      This is a method to return the instruments.
      If the instrument is not available for rent i.e isRented is true, then a suitable message is shown.
      If the instrument is available for rent i.e isRented is false, then required actions are performed as shown below.
     */
    public void return_instrument()
    {
        if(isRented == false) {
            System.out.println("The instrument is available for rent.");
        }
        
        else{
            super.setCustomerName("");
            super.setCustomerMobileNo("");
            super.setCustomerPANNo(0);
            this.dateOfReturn = "";
            this.dateOfRent = "";
            this.noOfDays = 0;
            this.isRented = false;
        }
    }
    
        
    /**method to display the details*/
    /*
      This is the display method of the subclass InstrumentToRent which has the same signature as the display method of super class Instrument.
      A call is made to the display method of super class to display Instrument_ID and Instrument_Name.
       If the instrument is already rented then customer details, renting date and return date are displayed.
     */
    public void display()
    {
        super.display();//calling the display method of Instrument class to display the Instrument ID and Instrument Name
        
        if(isRented == true) {
            System.out.println("Renting Date: " + this.dateOfRent);
            System.out.println("Return Date: " + this.dateOfReturn);
        }
    }
}