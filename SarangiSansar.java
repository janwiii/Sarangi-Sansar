//import the required java packages
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public class SarangiSansar implements ActionListener
{
    //variables for various components of gui
    private JFrame jf;
    private JLabel ss, snr, sales, rental, insname1, insname2, id, price, charge, days, cname1, phone1, pan1, cname2, phone2, pan2, discount, rentDate, returnDate, sellDate;
    private JTextField insnametf1, insnametf2, idtf, pricetf, chargetf, daystf, cnametf1, phonetf1, pantf1, cnametf2, phonetf2, pantf2, discountf;
    private JComboBox sellDay, sellMonth, sellYear, rentDay, rentMonth, rentYear, returnDay, returnMonth, returnYear;
    private JButton addRent, rent, addSell, sell, Return, display1, display2, clear;
    
    //creating an arraylist named instruments to store instrument names
    ArrayList<Instrument> instruments = new ArrayList<Instrument>();
    
    /** constructor for the SarangiSansar class */
    //gui will be created here
    public SarangiSansar()
    {
        jf = new JFrame("Sarangi Sansar"); //main frame of the gui
        
        //colors for the gui
        Color bg = new Color(235, 233, 243);
        Color button = new Color(166, 181, 226);
        
        /** Part 1: Construction of GUI */
        /*
         * 1) Creating a swing component
         * 2) Providing size and position to the components using setBounds()
         * #) (optional) adding font to the component
         * #) (for buttons) adding bg color to the buttons
         * 3) Adding the components in JFrame
         */
        ss = new JLabel("Sarangi Sansar");
        ss.setBounds(490, 16, 250, 45);
        ss.setFont(new Font("Helvetica", Font.PLAIN, 30));
        jf.add(ss);
        
        snr = new JLabel("Sales and Rental");
        snr.setBounds(507, 54, 180, 34);
        snr.setFont(new Font("Helvetica", Font.PLAIN, 22));
        jf.add(snr);
        
        rental = new JLabel("Rental");
        rental.setBounds(48, 101, 143, 31);
        rental.setFont(new Font("Helvetica", Font.BOLD, 22));
        jf.add(rental);
        
        insname1 = new JLabel("Instrument Name");
        insname1.setBounds(48, 134, 248, 28);
        insname1.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(insname1);
        
        insnametf1 = new JTextField();
        insnametf1.setBounds(48, 163, 287, 25);
        insnametf1.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(insnametf1);
        
        charge = new JLabel("Charge per day");
        charge.setBounds(446, 134, 237, 28);
        charge.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(charge);
        
        chargetf = new JTextField();
        chargetf.setBounds(446, 163, 300, 25);
        chargetf.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(chargetf);
        
        addRent = new JButton("Add");
        addRent.setBounds(48, 197, 120, 26);
        addRent.setFont(new Font("Serif", Font.PLAIN, 16));
        addRent.setBackground(button);
        jf.add(addRent);
        
        cname1 = new JLabel("Customer Name");
        cname1.setBounds(48, 231, 215, 28);
        cname1.setFont(new Font("Serif", Font.PLAIN, 18));
        jf.add(cname1);
        
        cnametf1 = new JTextField();
        cnametf1.setBounds(48, 260, 287, 25);
        cnametf1.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(cnametf1);
        
        phone1 = new JLabel("Customer Phone no.");
        phone1.setBounds(446, 231, 273, 28);
        phone1.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(phone1);
        
        phonetf1 = new JTextField();
        phonetf1.setBounds(446, 260, 300, 25);
        phonetf1.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(phonetf1);
                
        pan1 = new JLabel("Customer PAN no.");
        pan1.setBounds(871, 231, 266, 28);
        pan1.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(pan1);
        
        pantf1 = new JTextField();
        pantf1.setBounds(871, 260, 301, 25);
        pantf1.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(pantf1);
        
        rentDate = new JLabel("Rent Date");
        rentDate.setBounds(48, 293, 160, 28);
        rentDate.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(rentDate);
        
        // defining variables for combobox
        String year[] = {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008"};
        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug"};
        String day[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        
        rentDay = new JComboBox<String>(day);
        rentDay.setBounds(48, 327, 40, 22);
        jf.add(rentDay);
        
        rentMonth = new JComboBox<String>(month);
        rentMonth.setBounds(105, 327, 50, 22);
        jf.add(rentMonth);
        
        rentYear = new JComboBox<String>(year);
        rentYear.setBounds(173, 327, 60, 22);
        jf.add(rentYear);
        
        returnDate = new JLabel("Return Date");
        returnDate.setBounds(446, 293, 192, 28);
        returnDate.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(returnDate);
        
        returnDay = new JComboBox<String>(day);
        returnDay.setBounds(446, 327, 40, 22);
        jf.add(returnDay);
        
        returnMonth = new JComboBox<String>(month);
        returnMonth.setBounds(503, 327, 50, 22);
        jf.add(returnMonth);
        
        returnYear = new JComboBox<String>(year);
        returnYear.setBounds(571, 327, 60, 22);
        jf.add(returnYear);
        
        days = new JLabel("No of Renting days");
        days.setBounds(871, 293, 181, 28);
        days.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(days);
        
        daystf = new JTextField();
        daystf.setBounds(871, 327, 301, 25);
        daystf.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(daystf);
        
        rent = new JButton("Rent");
        rent.setBounds(48, 366, 120, 26);
        rent.setFont(new Font("Serif", Font.PLAIN, 16));
        rent.setBackground(button);
        jf.add(rent);
        
        Return = new JButton("Return");
        Return.setBounds(198, 366, 120, 26);
        Return.setFont(new Font("Serif", Font.PLAIN, 16));
        Return.setBackground(button);
        jf.add(Return);
        
        display1 = new JButton("Display");
        display1.setBounds(1052, 401, 120, 26);
        display1.setFont(new Font("Serif", Font.PLAIN, 16));
        display1.setBackground(button);
        jf.add(display1);
        
        sales = new JLabel("Sales");
        sales.setBounds(48, 426, 70, 31);
        sales.setFont(new Font("Helvetica", Font.BOLD, 22));
        jf.add(sales);
        
        insname2 = new JLabel("Instrument Name");
        insname2.setBounds(48, 460, 248, 28);
        insname2.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(insname2);
        
        insnametf2 = new JTextField();
        insnametf2.setBounds(48, 489, 287, 25);
        insnametf2.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(insnametf2);
        
        price = new JLabel("Price");
        price.setBounds(446, 460, 144, 28);
        price.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(price);
        
        pricetf = new JTextField();
        pricetf.setBounds(446, 489, 301, 25);
        pricetf.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(pricetf);
        
        addSell = new JButton("Add");
        addSell.setBounds(48, 525, 120, 26);
        addSell.setFont(new Font("Serif", Font.PLAIN, 16));
        addSell.setBackground(button);
        jf.add(addSell);
        
        cname2 = new JLabel("Customer Name");
        cname2.setBounds(48, 558, 215, 28);
        cname2.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(cname2);
        
        cnametf2 = new JTextField();
        cnametf2.setBounds(48, 588, 287, 25);
        cnametf2.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(cnametf2);
        
        phone2 = new JLabel("Customer Phone no.");
        phone2.setBounds(446, 558, 301, 28);
        phone2.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(phone2);
        
        phonetf2 = new JTextField();
        phonetf2.setBounds(446, 588, 301, 25);
        phonetf2.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(phonetf2);
        
        pan2 = new JLabel("Customer PAN no.");
        pan2.setBounds(871, 558, 266, 28);
        pan2.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(pan2);
        
        pantf2 = new JTextField();
        pantf2.setBounds(871, 588, 301, 25);
        pantf2.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(pantf2);
        
        sellDate = new JLabel("Sell Date");
        sellDate.setBounds(48, 624, 160, 28);
        sellDate.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(sellDate);
        
        sellDay = new JComboBox<String>(day);
        sellDay.setBounds(48, 655, 40, 22);
        jf.add(sellDay);
        
        sellMonth = new JComboBox<String>(month);
        sellMonth.setBounds(105, 655, 50, 22);
        jf.add(sellMonth);
        
        sellYear = new JComboBox<String>(year);
        sellYear.setBounds(173, 655, 60, 22);
        jf.add(sellYear);
        
        discount = new JLabel("Discount Percentage");
        discount.setBounds(446, 624, 168, 28);
        discount.setFont(new Font("Serif", Font.PLAIN, 20));
        jf.add(discount);
        
        discountf = new JTextField();
        discountf.setBounds(446, 655, 301, 25);
        discountf.setFont(new Font("Serif", Font.PLAIN, 16));
        jf.add(discountf);
        
        sell = new JButton("Sell");
        sell.setBounds(48, 689, 120, 26);
        sell.setFont(new Font("Serif", Font.PLAIN, 16));
        sell.setBackground(button);
        jf.add(sell);
        
        display2 = new JButton("Display");
        display2.setBounds(909, 726, 120, 26);
        display2.setFont(new Font("Serif", Font.PLAIN, 16));
        display2.setBackground(button);
        jf.add(display2);
        
        clear = new JButton("Clear");
        clear.setBounds(1052, 726, 120, 26);
        clear.setFont(new Font("Serif", Font.PLAIN, 16));
        clear.setBackground(button);
        jf.add(clear);
        /** Part 1 ends here */
        
        jf.setLayout(null); // the layout of the JFrame is set to null in order to avoid auto placements of components
        jf.setVisible(true); // for the visibility of JFrame
        jf.setSize(1225, 816); // setting the size of JFrame (width, height)
        jf.getContentPane().setBackground(bg); // setting bg color to the frame
        
        // adding functionalities ot the buttons
        addRent.addActionListener(this);
        rent.addActionListener(this);
        addSell.addActionListener(this);
        sell.addActionListener(this);
        Return.addActionListener(this);
        display1.addActionListener(this);
        display2.addActionListener(this);
        clear.addActionListener(this);
    }
    
    /** this method is basically an actionPerformed interface
     * it notifies the actionListener whenever a button is clicked
     * here, each button has been modified into a method
     * so when a button is clicked, respective method is invoked
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == addRent){
            addRent(); // applied to "Add" button for add to rent
        }
        
        else if(e.getSource() == rent){
            rent(); // appilied to "Rent" button for renting instrument
        }
        
        else if(e.getSource() == addSell){
            addSell(); // applied to "Add" button for add to sell
        }
        
        else if(e.getSource() == sell){
            sell(); // applied to "Sell" button for selling instrument
        }
        
        else if(e.getSource() == Return){
            Return(); // applied to "Return" button for returning an instrument
        }
        
        else if(e.getSource() == display1){
            display1(); // applied to "Display" button to display the rented instrument
        }
        
        else if(e.getSource() == display2){
            display2(); // applied to "Display" button to display the sold instrument
        }
        
        else if(e.getSource() == clear){
            clear(); // applied to "Clear" button to clear all textfields
        }
    }
    
    // a method that adds the instruments to the arraylist for rent
    public void addRent(){
        boolean isAdded = false;
        
        // checking if there are any empty fields    
        if(insnametf1.getText().isEmpty() || chargetf.getText().isEmpty()){
            // if any of the textfields are empty, a dialog box is shown with the message below
            JOptionPane.showMessageDialog(jf, "Please fill up all the entries.", "Empty fields!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // using try and catch to find exceptions
            try{
                String Instrument_Name  = insnametf1.getText();
                float chargePerDay      = Float.parseFloat(chargetf.getText()); // converting the string variable to float
                
                // checking if the arraylist is empty
                if(instruments.isEmpty()){
                    // creating an object of the InstrumentToRent class 
                    InstrumentToRent rentIns = new InstrumentToRent(Instrument_Name, chargePerDay);
                    // adding the object to the arraylist
                    instruments.add(rentIns);
                    // displaying the succession
                    JOptionPane.showMessageDialog(jf, "The instrument has been successfully added to rent.");
                }
                else{
                    // using for each loop to iterate through the instruments arraylist
                    for(Instrument i : instruments){
                        // checking if the object is an instance of InstrumentToRent class or not
                        if(i instanceof InstrumentToRent){
                            if(i.getInstrumentName().equals(insnametf1.getText())){
                                isAdded = true;
                                break;
                            }
                        }
                    }
                    
                    // if the instrument is not added to the arraylist
                    if(isAdded == false){
                        // creating an object of the InstrumentToRent class 
                        InstrumentToRent rentIns = new InstrumentToRent(Instrument_Name, chargePerDay);
                        // adding the object to the arraylist
                        instruments.add(rentIns);
                        // displaying the succession
                        JOptionPane.showMessageDialog(jf, "The instrument has been successfully added to rent.");
                    }
                    else{
                        JOptionPane.showMessageDialog(jf, "The instrument has already been added to rent."); // if the instrument has already been added to the arraylist
                    }
                }
            }
            /** NumberFormaatException is caught if wrong data is entered in a textfield
             * i.e. if we enter a string value to a float textfield
             */
            catch(NumberFormatException g){
                JOptionPane.showMessageDialog(jf, "Please enter corrrect info.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void addSell(){
        boolean isAddedtoSell = false;
        
        //checking if there are nay empty fields
        if(insnametf2.getText().isEmpty() || pricetf.getText().isEmpty()){
            JOptionPane.showMessageDialog(jf, "Please fill up all the entries.", "Empty fields!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                String Instrument_Name  = insnametf2.getText();
                float price             = Float.parseFloat(pricetf.getText());//converting string into float number
                
                /** checking if the arraylist is empty or not
                 * if it is empty then an object of InstrumentToSell class is created
                 * the object is added to the arraylist
                 */
                if(insnametf2.getText().isEmpty()){
                    InstrumentToSell sellIns = new InstrumentToSell(Instrument_Name, price);
                    instruments.add(sellIns);
                    JOptionPane.showMessageDialog(jf, "The instrument has been successfully added to sell.");
                }
                else{
                    // using for each loop to iterate through the instruments arraylist
                    for(Instrument i : instruments){
                        // checking if the object is an instance of InstrumentToSell class or not
                        if(i instanceof InstrumentToSell){
                            if(i.getInstrumentName().equals(insnametf2.getText())){
                                isAddedtoSell = true;
                                break;
                            }
                        }
                    }
                    if(isAddedtoSell == false){
                        InstrumentToSell sellIns = new InstrumentToSell(Instrument_Name, price);
                        instruments.add(sellIns);
                        JOptionPane.showMessageDialog(jf, "The instrument has been successfully added to sell.");
                    }
                    else{
                        JOptionPane.showMessageDialog(jf, "The instrument has already been added to sell.");
                    }
                }
            }
            catch(NumberFormatException g){
                JOptionPane.showMessageDialog(jf, "Please enter corrrect info.", "Error", JOptionPane.ERROR_MESSAGE);
            }                
        }
    }
    
    public void rent(){
        boolean isRented = false;
        
        //checking if there are nay empty fields
        if(cnametf1.getText().isEmpty() || phonetf1.getText().isEmpty() || pantf1.getText().isEmpty() || daystf.getText().isEmpty()){
            JOptionPane.showMessageDialog(jf, "Please fill up all the entries.", "Empty fields!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                String Instrument_Name    = insnametf1.getText();
                float chargePerDay        = Float.parseFloat(chargetf.getText());
                String Customer_Name      = cnametf1.getText();
                String Customer_MobileNo  = phonetf1.getText();
                int Customer_PAN_No       = Integer.parseInt(pantf1.getText());
                String dateOfRent         = rentDay.getSelectedItem() + " " + (String)rentMonth.getSelectedItem() + ", " + rentYear.getSelectedItem();
                String dateOfReturn       = returnDay.getSelectedItem() + " " + (String)returnMonth.getSelectedItem() + ", " + returnYear.getSelectedItem();
                int noOfDays              = Integer.parseInt(daystf.getText());
                
                if(instruments.isEmpty()){
                    JOptionPane.showMessageDialog(jf, "The instrument is not available for rent.");
                }
                else{
                    // using for each loop to iterate through the instruments arraylist
                    for(Instrument i : instruments){
                        // checking if the object is an instance of InstrumentToRent class or not
                        if(i instanceof InstrumentToRent){
                            InstrumentToRent ir = (InstrumentToRent) i; //downcasting                          
                            if(ir.getInstrumentName().equals(Instrument_Name)){
                                if(ir.getIsRented() == false){
                                    JOptionPane.showMessageDialog(jf, "The instrument has successlly been rented.");
                                }
                                else{
                                    JOptionPane.showMessageDialog(jf, "The instrument is already rented.");
                                }
                                
                                ir.rent_instrument(Customer_Name, Customer_MobileNo, Customer_PAN_No, dateOfRent, dateOfReturn, noOfDays);
                                System.out.println("");
                                isRented = true;
                                break;
                            }
                        }
                    } 
                }                    
            }
            catch(NumberFormatException g){
                JOptionPane.showMessageDialog(jf, "Please enter corrrect info.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void sell(){
        boolean isSold = false;
        
        //checking if there are nay empty fields
        if(cnametf2.getText().isEmpty() || phonetf2.getText().isEmpty() || pantf2.getText().isEmpty() || pricetf.getText() == "" || discountf.getText() == "" || 
        sellDay.getSelectedItem() == "" || sellMonth.getSelectedItem() == "" || sellYear.getSelectedItem() == "" ){
            JOptionPane.showMessageDialog(jf, "Please fill up all the entries.", "Empty fields!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                String Instrument_Name    = insnametf2.getText();
                float price               = Float.parseFloat(pricetf.getText());
                String Customer_Name      = cnametf2.getText();
                String Customer_MobileNo  = phonetf2.getText();
                int Customer_PAN_No       = Integer.parseInt(pantf2.getText());
                String sellDate           = sellDay.getSelectedItem().toString() + " " + sellMonth.getSelectedItem().toString() + "," + sellYear.getSelectedItem().toString();
                int discountPercent       = Integer.parseInt(discountf.getText());
                
                if(instruments.isEmpty()){
                    JOptionPane.showMessageDialog(jf, "The instrument is not available for sell.");
                }
                else{
                    // using for each loop to iterate through the instruments arraylist
                    for(Instrument i : instruments){
                        // checking if the object is an instance of InstrumentToSell class or not
                        if(i instanceof InstrumentToSell){
                            InstrumentToSell is = (InstrumentToSell) i; //downcasting                            
                            if(is.getInstrumentName().equals(Instrument_Name)){
                                if(is.getIsSold() == false){
                                    JOptionPane.showMessageDialog(jf, "The instrument has successlly been sold.");
                                }
                                else{
                                    JOptionPane.showMessageDialog(jf, "The instrument is already sold.");
                                }
                                is.sell_instrument(Customer_Name, Customer_MobileNo, Customer_PAN_No, sellDate, discountPercent); // calling the sell_instrumemnt() mothof of InstrumentToSell class
                                System.out.println("");
                                isSold = true;
                                break;
                            }
                        }
                    }
                }                   
            }
            catch(NumberFormatException g){
                JOptionPane.showMessageDialog(jf, "Please enter corrrect info.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void Return(){
        boolean isReturned = false;
        
        //checking if there are any empty fields
        if(insnametf1.getText().isEmpty()){
            JOptionPane.showMessageDialog(jf, "Please fill up all the entries.");
        }
        else{
            try{
                String Instrument_Name = insnametf1.getText();
                
                if(instruments.isEmpty() || isReturned == true){
                    JOptionPane.showMessageDialog(jf, "The instruments has not been rented.");
                }
                else{
                    // using for each loop to iterate through the instruments arraylist
                    for(Instrument i : instruments){
                        // checking if the object is an instance of InstrumentToRent class or not
                        if(i instanceof InstrumentToRent){
                            InstrumentToRent ir = (InstrumentToRent) i; //downcasting
                            
                            if(ir.getInstrumentName().equals(Instrument_Name)){
                                if(ir.getIsRented() == true){
                                    JOptionPane.showMessageDialog(jf, "The instrument has successlly been returned. \n" + "Instrument Name: " + insnametf1.getText()+"\n" +
                                    "Charge Per Day: " + chargetf.getText());
                                }
                                else{
                                    JOptionPane.showMessageDialog(jf, "The instrument is already returned and is available for rent.");
                                }
                                ir.return_instrument();// calling the return_instrumemnt() mothof of InstrumentToRent class
                                System.out.println("");
                                isReturned = true;
                                break;
                            }
                        }
                    }
                }
            }
            catch(NumberFormatException g){
                JOptionPane.showMessageDialog(jf, "Please enter corrrect info.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // a methods that is invoked by the display button and displays the info of the rented instrument
    public void display1(){
        // if there are no elements in the arraylist, then a dialog box appears saying "no instruments to display"
        if(instruments.size() == 0){
            JOptionPane.showMessageDialog(jf, "No instruments to display", "Empty fields!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // if there are elements then we iterate through the arraylist using for each loop
            for(Instrument i : instruments){
                if(i instanceof InstrumentToRent){
                    InstrumentToRent ir = (InstrumentToRent) i; // downcasting
                    ir.display(); // calling the display method of InstrumentToRent class
                    System.out.println("");
                }
            }
        }
    }
    
    // a methods that is invoked by the display button and displays the info of the sold instrument
    public void display2(){
        // if there are no elements in the arraylist, then a dialog box appears saying "no instruments to display"
        if(instruments.size() == 0 ){
            JOptionPane.showMessageDialog(jf, "No instruments to display.", "Empty fields!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            // if there are elements then we iterate through the arraylist using for each loop
            for(Instrument i : instruments){
                if(i instanceof InstrumentToSell){
                    InstrumentToSell is = (InstrumentToSell) i; // downcasting 
                    is.display(); // calling the display method of InstrumentToSell class
                    System.out.println("");
                }
            }
        }
    }
    
    // a method to clear all of the textfields
    public void clear(){
        try{
            // all of the textfields are set to empty and comboboxes are set to index 0
            insnametf1.setText("");
            insnametf2.setText("");
            pricetf.setText("");
            chargetf.setText("");
            daystf.setText("");
            rentDay.setSelectedIndex(0);
            rentMonth.setSelectedIndex(0);
            rentYear.setSelectedIndex(0);
            returnDay.setSelectedIndex(0);
            returnMonth.setSelectedIndex(0);
            returnYear.setSelectedIndex(0);
            cnametf1.setText("");
            phonetf1.setText("");
            pantf1.setText("");
            cnametf2.setText("");
            phonetf2.setText("");
            pantf2.setText("");
            sellDay.setSelectedIndex(0);
            sellMonth.setSelectedIndex(0);
            sellYear.setSelectedIndex(0);
            discountf.setText("");
        }
        catch(NullPointerException n){
            System.out.println("NullPointerException: " + n);
        }
    }
    
    // main method
    public static void main(String [] args)
    {
        SarangiSansar obj = new SarangiSansar(); // creating obj of the SarangiSansar class
    }
}