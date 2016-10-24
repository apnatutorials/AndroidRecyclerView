package com.apnatutorials.androidrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CustomerAdapter adapter = null;
    ArrayList<Customer> customers = null;
    RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        customers = new ArrayList<>();
        customers = populateCustomerData(customers);
        adapter = new CustomerAdapter(this, customers);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        myRecyclerView.setLayoutManager(llm);
        //  myRecyclerView.addItemDecoration(new VerticalSpacingDecoration(10));
        myRecyclerView.setAdapter(adapter);

        myRecyclerView.addOnItemTouchListener(new RecyclerViewOnItemClickListener(this, myRecyclerView, new RecyclerViewOnItemClickListener.RecyclerTouchListener() {
            @Override
            public void onClickItem(View v, int position) {
                Customer c = adapter.getItem(position);
                Toast.makeText(MainActivity.this, "You clicked : " + c.getFirstName() + " " + c.getLastName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClickItem(View v, int position) {

            }
        }));

    }

    private ArrayList<Customer> populateCustomerData(ArrayList<Customer> customers) {
        customers.add(new Customer("Balendra", "Singh", 1, R.drawable.c1));
        customers.add(new Customer("Bipin", "Arora", 2, R.drawable.c2));
        customers.add(new Customer("Babulal", "Marandi", 3, R.drawable.c3));


        customers.add(new Customer("Aishwarya", "Rai", 8, R.drawable.c8));
        customers.add(new Customer("Asin", "Kaif", 9, R.drawable.c9));
        customers.add(new Customer("Arshi", "Khan", 10, R.drawable.c10));

        return customers;
    }
}
