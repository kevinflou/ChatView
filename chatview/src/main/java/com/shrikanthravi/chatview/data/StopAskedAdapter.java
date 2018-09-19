package com.shrikanthravi.chatview.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.shrikanthravi.chatview.R;

import java.util.List;

import jp.wasabeef.recyclerview.animators.ScaleInBottomAnimator;

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
        //StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false){
            @Override
            public boolean canScrollHorizontally() {
                return true;
            }

            @Override
            public boolean canScrollVertically() {
                return true;
            }
        };
        holder.lignesDeserviesRV.setLayoutManager(layoutManager);
        LignesDeserviesAdapter lda = new LignesDeserviesAdapter(stopAsk.getList_lignes(),context);
        holder.lignesDeserviesRV.setAdapter(lda);
        //holder.lignesDeserviesRV.setNestedScrollingEnabled(false);
        //holder.lignesDeserviesRV.requestDisallowInterceptTouchEvent(true);
        //holder.lignesDeserviesRV.getParent().requestDisallowInterceptTouchEvent(true);
        //holder.lignesDeserviesRV.setHasFixedSize(true);
        holder.moreInfosStopButton.setOnClickListener(stopAsk.getOnClickListener());

        //holder.nestedScrollView.setNestedScrollingEnabled(true);
    }

    @Override
    public int getItemCount() {
        return listStops.size();
    }

    protected class StopAskedViewHolder extends RecyclerView.ViewHolder {
        public TextView stopNameTV,distanceToPointTV;
        public ImageView handicapSupportedIV;
        public RecyclerView lignesDeserviesRV;
        public Button moreInfosStopButton;
        public NestedScrollView nestedScrollView;

        public StopAskedViewHolder(View view) {
            super(view);
            stopNameTV = view.findViewById(R.id.stopNameTV);
            distanceToPointTV = view.findViewById(R.id.distanceToPointTV);
            handicapSupportedIV = view.findViewById(R.id.handicapSupportedIV);
            lignesDeserviesRV = view.findViewById(R.id.lignesDeserviesRV);
            moreInfosStopButton = view.findViewById(R.id.moreInfosStopButton);
            nestedScrollView = view.findViewById(R.id.nestedScrollView);
        }
    }
}