package com.apnatutorials.androidrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CustomerAdapter extends RecyclerView.Adapter<MyViewHolder> {
    ArrayList<Customer> customers;
    Context ctx;

    public CustomerAdapter(Context context, ArrayList<Customer> data) {
        this.customers = data;
        this.ctx = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ctx)
                .inflate(R.layout.customer_row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Customer c = customers.get(position);
        holder.tvCustomer.setText(c.getFirstName() + " " + c.getLastName());
        holder.ivCustomerImage.setImageResource(c.getProfilePic());
    }

    @Override
    public int getItemCount() {
        return this.customers.size();
    }

    public Customer getItem(int position) {
        return customers.get(position);
    }
}
