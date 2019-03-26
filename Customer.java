package edu.psu.ist;
import java.util.ArrayList;

public class Customer
{
    private int customer_id;
    private String customer_name;


    //constructor method
    public Customer (int customer_id, String customer_name)

    {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
    }

    public Customer()
    {
        //blank on purpose
    }

    //list_cust method
    public static void list_cust(ArrayList<Customer> customer_list)
    {

    }

    //getters and setters
    //customer id
    public int getCustomerID()
    {
        return customer_id;
    }
    public void setCustomerID(int customer_id)
    {
        this.customer_id = customer_id;
    }

    //customer name
    public String getCustomerName()
    {
        return customer_name;
    }
    public void setCustomerName(String customer_name)
    {
        this.customer_name = customer_name;
    }
}
