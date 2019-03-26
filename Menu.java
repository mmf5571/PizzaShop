package edu.psu.ist;
import java.util.ArrayList;

public class Menu
{
    private String menu_item;
    private int price;


    //constructor method
    public Menu (String menu_item, int price)
    {
        this.menu_item = menu_item;
        this.price = price;
    }


    //getters n setters
    //menu
    public String getMenuItem()
    {
        return menu_item;
    }
    public void setMenuItem(String menu_item)
    {
        this.menu_item = menu_item;
    }

    //price
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }


    //loop to print menu
    public static void list_menu (ArrayList<Menu> menu_list)
    {
        for (Menu menu: menu_list)
        {
            System.out.println(menu.getMenuItem());
        }
    }
}
