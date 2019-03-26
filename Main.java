/*
Project: Lab9/10Fox
Purpose Details: Pizza Shop
Course: IST 242
Author: Michaela Fox
Date Developed: 3/13/2019
Last Date Changed: 3/26/2019
Revision: 6
*/

package edu.psu.ist;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //chars
        final char MENU_CODE = 'm';
        final char ORDER_CODE = 'o';
        final char CUST_CODE = 'c';
        final char TRANS_CODE = 't';
        final char EXIT_CODE = 'e';
        final String USER_ACTION = "Type 'c' for customer, 'e' to exit, 'm' for menu, 'o' to order, or 't' for transaction.";
        final char prompt;
        char user_action;
        final String user_option;

        //array lists
        ArrayList<Customer> customer_list = new ArrayList<>();
        ArrayList<Menu> menu_list = new ArrayList<>();
        ArrayList<Order> order_list = new ArrayList<>();
        ArrayList<Transaction> transaction_list = new ArrayList<>();


        //creating n adding items to menu
        Menu menu1 = new Menu ("Plain", 5);
        Menu menu2 = new Menu ("Pepperoni", 6);
        Menu menu3 = new Menu ("Cheese", 6);
        menu_list.add(menu1);
        menu_list.add(menu2);
        menu_list.add(menu3);

        //adding to other lists
        //customer_list.add(cust1);
        //order_list.add(order1);
        //transaction_list.add(trans1);


        //user_action = getAction(USER_ACTION);

        //user selection
        while (user_action != EXIT_CODE)
        {
            switch(user_action)
            {
                case CUST_CODE : Customer.list_cust(customer_list);
                    break;
                case MENU_CODE : Menu.list_menu(menu_list);
                    break;
                case ORDER_CODE : Order.list_orders(order_list);
                    break;
                case TRANS_CODE :  Transaction.list_trans(transaction_list);
                    break;
            }
        }
        //user_action = getAction(USER_ACTION);


        //user input
        public static char getAction(String prompt)
        {
            Scanner scnr = new Scanner(System.in);
            String option = "";
            System.out.println(prompt);
            user_option = scnr.nextLine().toLowerCase();
            return user_option;
        }
    }
}
