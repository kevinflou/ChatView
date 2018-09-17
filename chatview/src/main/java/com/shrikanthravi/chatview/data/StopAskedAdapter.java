package com.shrikanthravi.chatview.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.shrikanthravi.chatview.R;

import java.util.List;

public class StopAskedAdapter extends RecyclerView.Adapter<StopAskedAdapter.StopAskedViewHolder> {

    private List<StopAsked> listStops;
    private Context context;

    public StopAskedAdapter(List<StopAsked> listStops, Context context) {
        this.listStops = listStops;
        this.context = context;
    }

    @Override
    public StopAskedAdapter.StopAskedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.left_stop_layout, parent, false);
        return new StopAskedAdapter.StopAskedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StopAskedAdapter.StopAskedViewHolder holder, int position) {
        StopAsked stopAsk = listStops.get(position);

        holder.stopNameTV.setText(stopAsk.getName_arret());
        holder.distanceToPointTV.setText(stopAsk.getDistance());
        if(stopAsk.getHandicap() == 0){
            holder.handicapSupportedIV.setVisibility(View.GONE);
        }
        //holder.numeroLigneTV.setText(ligneDeservieList.get(position).getShort_name());
        //holder.longNameTV.setText(ligneDeservieList.get(position).getLong_name());
        //holder.bgLigneNumber.setBackgroundColor(Color.parseColor(ligneDeservieList.get(position).getColor_ligne()));
    }

    @Override
    public int getItemCount() {
        return listStops.size();
    }

    protected class StopAskedViewHolder extends RecyclerView.ViewHolder {
        public TextView stopNameTV,distanceToPointTV;
        public ImageView handicapSupportedIV;
        public RecyclerView lignesDeserviesRV;

        public StopAskedViewHolder(View view) {
            super(view);
            stopNameTV = view.findViewById(R.id.stopNameTV);
            distanceToPointTV = view.findViewById(R.id.distanceToPointTV);
            handicapSupportedIV = view.findViewById(R.id.handicapSupportedIV);
            lignesDeserviesRV = view.findViewById(R.id.lignesDeserviesRV);
        }
    }
}