package com.moodybugs.saim.hospitalappointment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by sam on 12/7/16.
 */

public class VersityAdapter extends RecyclerView.Adapter<VersityAdapter.versityViewHolder> {

    ArrayList<Contact> adapterList = new ArrayList<>();
    MainActivity mainActivity;
    Context mContext;

    public VersityAdapter(ArrayList<Contact> adapterList, Context mContext) {
        this.adapterList = adapterList;
        this.mContext = mContext;
        this.mainActivity = (MainActivity) mContext;
    }

    @Override
    public versityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        versityViewHolder versityViewHolder = new versityViewHolder(view, mainActivity);
        return versityViewHolder;
    }

    @Override
    public void onBindViewHolder(versityViewHolder holder, int position) {

        holder.txtName.setText(adapterList.get(position).getid());
        holder.txtCountry.setText(adapterList.get(position).gettitle());
        holder.txtWebpage.setText(adapterList.get(position).getthumbnailUrl());

        Context context = holder.imageViewRc.getContext();
        String url = "http://www.geonames.org/flags/x/" + adapterList.get(position).getthumbnailUrl().toLowerCase().toString() + ".gif";
        Picasso.with(context).load(url).into(holder.imageViewRc);

    }

    @Override
    public int getItemCount() {
        return adapterList.size();
    }

    public class versityViewHolder extends RecyclerView.ViewHolder{

        TextView txtName, txtCountry, txtWebpage;
        ImageView imageViewRc;
        MainActivity MainActivity;

        public versityViewHolder(View itemView, MainActivity mainActivity) {

            super(itemView);

            txtName = (TextView) itemView.findViewById(R.id.txtName);
            txtCountry = (TextView) itemView.findViewById(R.id.txtCountry);
            txtWebpage = (TextView) itemView.findViewById(R.id.txtWebpage);
            imageViewRc = (ImageView) itemView.findViewById(R.id.imageViewRe);

            this.MainActivity = mainActivity;
        }
    }
}
