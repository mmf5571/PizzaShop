package edu.psu.ist;
import java.util.ArrayList;

public class Order
{
    private int order_id;
    private Customer cust;

    private ArrayList<Menu> menu_list;

    public Order (int order_id)
    {
        this.order_id = order_id;
    }

    //list_ orders method
    public static void list_orders(ArrayList<Order> order_list)
    {

    }


    //getters and setters
    public int getOrderID ()
    {
        return order_id;
    }

    public void setOrderID (int order_id)
    {
        this.order_id = order_id;
    }
}
