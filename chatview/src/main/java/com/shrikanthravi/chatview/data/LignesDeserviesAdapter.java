package com.shrikanthravi.chatview.data;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.shrikanthravi.chatview.R;

import java.util.List;

public class LignesDeserviesAdapter extends RecyclerView.Adapter<LignesDeserviesAdapter.LignesDeserviesViewHolder>  {
    private List<LigneDeservie> listLignesDeservies;
    private Context context;

    public LignesDeserviesAdapter(List<LigneDeservie> listStops, Context context) {
        this.listLignesDeservies = listStops;
        this.context = context;
    }

    @Override
    public LignesDeserviesAdapter.LignesDeserviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ligne_deservie_cell, parent, false);
        return new LignesDeserviesAdapter.LignesDeserviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LignesDeserviesAdapter.LignesDeserviesViewHolder holder, int position) {
        LigneDeservie ld = listLignesDeservies.get(position);
        if(ld.getType().equals("0")) {
            holder.typeLigneIV.setImageDrawable(context.getDrawable(R.drawable.bus_map));
        }else{
            holder.typeLigneIV.setImageDrawable(context.getDrawable(R.drawable.tram_map));
        }

        holder.numeroLigneTV.setText(ld.getShort_name());
        holder.longNameTV.setText(ld.getLong_name());
        holder.bgLigneNumber.setBackgroundColor(Color.parseColor(ld.getColor_ligne()));
    }

    @Override
    public int getItemCount() {
        return listLignesDeservies.size();
    }

    protected class LignesDeserviesViewHolder extends RecyclerView.ViewHolder {
        public ImageView typeLigneIV;
        public FrameLayout bgLigneNumber;
        public TextView numeroLigneTV,longNameTV;

        public LignesDeserviesViewHolder(View view) {
            super(view);
            typeLigneIV = view.findViewById(R.id.typeLigneIV);
            numeroLigneTV = view.findViewById(R.id.numeroLigneTV);
            longNameTV = view.findViewById(R.id.longNameTV);
            bgLigneNumber = view.findViewById(R.id.bgLigneNumber);
        }
    }
}
