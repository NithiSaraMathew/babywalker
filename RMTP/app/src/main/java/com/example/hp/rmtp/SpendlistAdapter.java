package com.example.hp.rmtp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SpendlistAdapter extends BaseAdapter  {

    private static LayoutInflater inflater = null;
    public Resources res;
  
    ListRow tempValues = null;
    int i = 0, j = 0;
    ProgressDialog progress;
    Object p;
    View view;
    /***********
     * Declare Used Variables
     *********/
    private Activity activity;
    private ArrayList<ListRow> data;
    private Context context;

    public SpendlistAdapter(Context context) {
        this.context = context;

    }


    /*************
     * SpendAdapter Constructor
     *****************/
    public SpendlistAdapter(Activity a, ArrayList<ListRow> d) {

        /********** Take passed values **********/
        activity = a;
        data = d;

        /*********** Layout inflator to call external xml layout () ***********/
        inflater = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    /********
     * What is the size of Passed Arraylist Size
     ************/
    public int getCount() {

        if (data.size() <= 0)
            return 1;
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

   

    /******
     * Depends upon data size called for each row , Create each ListView row
     *****/
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos;
        pos = position;
        View vi = convertView;
        final ViewHolder holder;

        if (convertView == null) {

            /****** Inflate tabitem.xml file for each row ( Defined below ) *******/
            vi = inflater.inflate(R.layout.list_item, null);
            /****** View Holder Object to contain tabitem.xml file elements ******/

            holder = new ViewHolder();

            holder.name = (TextView) vi.findViewById(R.id.name);
            holder.type = (TextView) vi.findViewById(R.id.date);

            vi.setTag(holder);
        } else
            holder = (ViewHolder) vi.getTag();


        if (data.size() <= 0) {
            //holder.tv2.setText("No Data");


            // holder.imei_no.setVisibility(View.GONE);
        } else {
            j = j + 1;
            /***** Get each Model object from Arraylist ********/


                 holder.name.setText(data.get(pos).getTitle());
                 holder.type.setText(data.get(pos).getSubTitle());

            //Picasso.with(context).load(data.get(pos).getImgurl()).resize(100,100).into(holder.thumbnail);


        }
        return vi;
    }

    /*********
     * Create a holder Class to contain inflated xml file elements
     *********/
    public static class ViewHolder {
        public ImageView thumbnail;
        public TextView name,type,restname,price;

    }

   
}