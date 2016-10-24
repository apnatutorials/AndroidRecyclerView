package com.apnatutorials.androidrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView tvCustomer;
    public ImageView ivCustomerImage;

    public MyViewHolder(View view) {
        super(view);
        tvCustomer = (TextView) view.findViewById(R.id.tvCustomer);
        ivCustomerImage = (ImageView) view.findViewById(R.id.ivCustomerImage);
    }
}
