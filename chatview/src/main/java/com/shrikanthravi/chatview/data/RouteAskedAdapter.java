package com.shrikanthravi.chatview.data;

import android.content.Context;
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
                .inflate(R.layout.left_route_layout, parent, false);
        return new RouteAskedAdapter.RouteAskedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RouteAskedAdapter.RouteAskedViewHolder holder, int position) {
        RouteAsked routeAsked = listRoutes.get(position);
        holder.ligneNameTV.setText(routeAsked.getShort_name_route() + " - " + routeAsked.getLong_name_route());
        holder.distanceToLigneTV.setText("TODO m");
        holder.pictoTV.setText(routeAsked.getType_route());

        holder.moreInfosLigneButton.setOnClickListener(routeAsked.getOnClickListener());
    }

    @Override
    public int getItemCount() {
        return listRoutes.size();
    }

    protected class RouteAskedViewHolder extends RecyclerView.ViewHolder {
        public TextView ligneNameTV,distanceToLigneTV,pictoTV;
        public RecyclerView timeTablesRV;
        public NestedScrollView scrollViewRV;
        public Button moreInfosLigneButton;

        public RouteAskedViewHolder(View view) {
            super(view);
            ligneNameTV = view.findViewById(R.id.ligneNameTV);
            distanceToLigneTV = view.findViewById(R.id.distanceToLigneTV);
            pictoTV = view.findViewById(R.id.pictoTV);
            timeTablesRV = view.findViewById(R.id.timetablesRV);
            moreInfosLigneButton = view.findViewById(R.id.moreInfosLigneButton);
            scrollViewRV = view.findViewById(R.id.scrollViewRV);
        }
    }
}