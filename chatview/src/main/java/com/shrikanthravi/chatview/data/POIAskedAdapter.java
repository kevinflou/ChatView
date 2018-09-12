package com.shrikanthravi.chatview.data;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.shrikanthravi.chatview.R;

import java.util.List;

public class POIAskedAdapter extends RecyclerView.Adapter<POIAskedAdapter.POIAskedViewHolder> {
    private List<POIAsked> listPOI;
    private Context context;
    private RecyclerView recyclerView;

    public POIAskedAdapter(List<POIAsked> verticalList, Context context) {
        this.listPOI = verticalList;
        this.context = context;
        this.recyclerView = recyclerView;
    }

    @Override
    public POIAskedAdapter.POIAskedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.poi_cell, parent, false);
        return new POIAskedAdapter.POIAskedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(POIAskedAdapter.POIAskedViewHolder holder, int position) {
        final POIAsked poiAsked = listPOI.get(position);

        holder.nomPOITV.setText(poiAsked.getName_poi());
        holder.categoryPOITV.setText(poiAsked.getCategory_poi());
        holder.markAndAvisTV.setText(poiAsked.getRating_poi() + " ("+poiAsked.getNb_avis_poi()+")");
        holder.addressTV.setText(poiAsked.getAdress_poi());
        holder.distanceTV.setText(poiAsked.getDistance_poi());
        holder.ratingPOI.setRating(Float.valueOf(poiAsked.getRating_poi()));
        holder.moreInfosButton.setOnClickListener(poiAsked.getOnClickListener());
    }

    @Override
    public int getItemCount() {
        return listPOI.size();
    }

    protected class POIAskedViewHolder extends RecyclerView.ViewHolder {
        public TextView nomPOITV,categoryPOITV,markAndAvisTV,addressTV,distanceTV;
        public RatingBar ratingPOI;
        public Button moreInfosButton;

        public POIAskedViewHolder(View view) {
            super(view);
            nomPOITV = view.findViewById(R.id.nomPOITV);
            categoryPOITV = view.findViewById(R.id.categoryPOITV);
            markAndAvisTV = view.findViewById(R.id.markAndAvisTV);
            addressTV = view.findViewById(R.id.addressTV);
            distanceTV = view.findViewById(R.id.distanceTV);
            ratingPOI = view.findViewById(R.id.ratingPOI);
            moreInfosButton = view.findViewById(R.id.moreInfosButton);
        }
    }
}
