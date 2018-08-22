package com.example.superskiers.cardviewsimple;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context mContext;
    List<CrossPolo> viewAngles;
    private static final String TAG = "MyAdapter";

    //Constructor to handle the data the RecyclerView displays
    public MyAdapter(Context context, List<CrossPolo> viewAngles) {
        this.mContext = context;
        this.viewAngles = viewAngles;
    }

    //This method is called when the custom ViewHolder needs to be initialized.
    //We specify the layout that each item should use and inflate the layout.
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.items, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    //onBindViewHolder will specify the contents of each item.
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        //angles will position and set each item whether it be TextView or ImageView
        final CrossPolo angles = viewAngles.get(position);

        holder.mTextView.setText(angles.getTextAngle());
        holder.mTextView2.setText(angles.getmTextViewDescription());
        holder.mImageView.setImageResource(angles.getImage());

        holder.listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //views is used to get which item was clicked on
                CrossPolo views = viewAngles.get(position);

                Log.d(TAG, "listView item clicked" + position);
                //Intent used to fill the activity_profile with views from MainActivity
                Intent intent = new Intent(mContext, ProfileActivity.class);
                intent.putExtra("textAngle", views.getTextAngle());
                intent.putExtra("textDescription", views.getmTextViewDescription());
                intent.putExtra("image", views.getImage());
                mContext.startActivity(intent);

            }
        });
    }

    //getItemCount returns the number of items present in the data
    //Our data is in the form of a list so we only need to call the size method
    @Override
    public int getItemCount() {
        return viewAngles.size();
    }

    //This method finds and holds the views
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;
        TextView mTextView2;
        LinearLayout listView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.mImageView = itemView.findViewById(R.id.image_view);
            this.mTextView = itemView.findViewById(R.id.text_view);
            this.mTextView2 = itemView.findViewById(R.id.text_view2);
            this.listView = itemView.findViewById(R.id.listed_items);
        }
    }
}