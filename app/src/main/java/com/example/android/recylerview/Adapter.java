package com.example.android.recylerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<modelClass> userList;
    public Adapter(List<modelClass>userList){


        this.userList=userList;
    }





    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdesign,parent,false);
        return new ViewHolder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int image = userList.get(position).getCardView();
        String name = userList.get(position).getNameView();
        String message = userList.get(position).getMessageView();
        String time = userList.get(position).getTimeView();

        holder.setData(image,name ,message,time);






    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView cardView;
        private TextView nameView;
        private TextView messageView;
        private TextView timeView;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            cardView=itemView.findViewById(R.id.imageView1);
            nameView=itemView.findViewById(R.id.nameView);
            messageView=itemView.findViewById(R.id.messageView);
            timeView=itemView.findViewById(R.id.timeView);





        }

        public void setData(int image, String name, String message, String time) {


            cardView.setImageResource(image);
            nameView.setText(name);
            messageView.setText(message);
            timeView.setText(time);







        }
    }
}
