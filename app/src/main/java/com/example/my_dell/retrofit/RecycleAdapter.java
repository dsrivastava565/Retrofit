package com.example.my_dell.retrofit;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {

private List<Datum> contacts;
public RecycleAdapter(List<Datum> contacts)
{
    this.contacts=contacts;
}
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_element,parent,false);


    return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Name.setText(contacts.get(position).getName());
        holder.Username.setText(contacts.get(position).getUsername());
        holder.Password.setText(contacts.get(position).getPassword());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView Name,Username,Password;
        public MyViewHolder(View itemView) {
            super(itemView);
       Name=(TextView)itemView.findViewById(R.id.Name);
       Username=(TextView)itemView.findViewById(R.id.Username);
       Password = (TextView)itemView.findViewById(R.id.Password);


        }
    }
}




