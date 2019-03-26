package edu.psu.ist;

import java.util.ArrayList;

public class Transaction
{
    private int transaction_id;


    //constructor method
    public Transaction (int transaction_id)
    {
        this.transaction_id = transaction_id;
    }


    //list_trans method
    public static void list_trans(ArrayList<Transaction> transaction_list)
    {

    }


    //getters n setters
    public int getTransaction_id()
    {
        return transaction_id;
    }
    public void setTransaction_id(int transaction_id)
    {
        this.transaction_id = transaction_id;
    }
}

