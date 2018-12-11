package com.shrikanthravi.chatview.data;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.shrikanthravi.chatview.R;

import java.util.List;

public class RouteAskedAdapter extends RecyclerView.Adapter<RouteAskedAdapter.RouteAskedViewHolder> {

    private List<RouteAsked> listRoutes;
    private Context context;

    public RouteAskedAdapter(List<RouteAsked> listRoutes, Context context) {
        this.listRoutes = listRoutes;
        this.context = context;
    }

    @Override
    public RouteAskedAdapter.RouteAskedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.left_route_layout_v2, parent, false);
        return new RouteAskedAdapter.RouteAskedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RouteAskedAdapter.RouteAskedViewHolder holder, int position) {
        RouteAsked routeAsked = listRoutes.get(position);
        holder.ligneNameTV.setText(routeAsked.getLong_name_route());
        holder.lineNbr.setBackgroundColor(Color.parseColor("#"+routeAsked.getColor()));
        holder.lineNbr.setText(routeAsked.getShort_name_route());
        if(routeAsked.getType_route().equals("3")){
            holder.typeImageView.setImageDrawable(context.getResources().getDrawable(R.drawable.picto_bus_black));
        }else{
            holder.typeImageView.setImageDrawable(context.getResources().getDrawable(R.drawable.tram));
        }

        holder.moreInfosLigneButton.setOnClickListener(routeAsked.getOnClickListener());
    }

    @Override
    public int getItemCount() {
        return listRoutes.size();
    }

    protected class RouteAskedViewHolder extends RecyclerView.ViewHolder {
        public TextView ligneNameTV,lineNbr;
        public ImageView typeImageView;
        public Button moreInfosLigneButton;

        public RouteAskedViewHolder(View view) {
            super(view);
            ligneNameTV = view.findViewById(R.id.ligneNameTV);
            lineNbr = view.findViewById(R.id.lineNbr);
            typeImageView = view.findViewById(R.id.typeImageView);
            moreInfosLigneButton = view.findViewById(R.id.moreInfosLigneButton);
        }
    }
}