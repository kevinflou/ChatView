package com.shrikanthravi.chatview.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.shrikanthravi.chatview.R;

import java.util.List;

public class StopAskedAdapter extends RecyclerView.Adapter<StopAskedAdapter.StopAskedViewHolder> {

    private List<LigneDeservie> ligneDeservieList;
    private Context context;
    private RecyclerView recyclerView;

    public StopAskedAdapter(List<LigneDeservie> verticalList, Context context, RecyclerView recyclerView) {
        this.ligneDeservieList = verticalList;
        this.context = context;
        this.recyclerView = recyclerView;
    }

    @Override
    public StopAskedAdapter.StopAskedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ligne_deservie_cell, parent, false);
        return new StopAskedAdapter.StopAskedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StopAskedAdapter.StopAskedViewHolder holder, int position) {
        holder.numeroLigneTV.setText(ligneDeservieList.get(position).getShort_name());
        holder.longNameTV.setText(ligneDeservieList.get(position).getLong_name());
    }

    @Override
    public int getItemCount() {
        return ligneDeservieList.size();
    }

    protected class StopAskedViewHolder extends RecyclerView.ViewHolder {
        public TextView numeroLigneTV,longNameTV;
        public ImageView typeLigneIV;

        public StopAskedViewHolder(View view) {
            super(view);
            numeroLigneTV = view.findViewById(R.id.numeroLigneTV);
            longNameTV = view.findViewById(R.id.longNameTV);
            typeLigneIV = view.findViewById(R.id.typeLigneIV);
        }
    }
}