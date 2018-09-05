package com.shrikanthravi.chatview.data;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.shrikanthravi.chatview.R;

import java.util.List;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder> {

    private List<CarouselCell> CarouselCellList;
    private Context context;
    private RecyclerView recyclerView;

    public CarouselAdapter(List<CarouselCell> verticalList, Context context, RecyclerView recyclerView) {
        this.CarouselCellList = verticalList;
        this.context = context;
        this.recyclerView = recyclerView;
    }

    @Override
    public CarouselAdapter.CarouselViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.carousel_cell, parent, false);
        return new CarouselAdapter.CarouselViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarouselAdapter.CarouselViewHolder holder, int position) {
        holder.titleCell.setText(CarouselCellList.get(position).getTitle_carousel());
        holder.subtitleCell.setText(CarouselCellList.get(position).getSubtitle_carousel());

    }

    @Override
    public int getItemCount() {
        return CarouselCellList.size();
    }

    protected class CarouselViewHolder extends RecyclerView.ViewHolder {
        public TextView titleCell,subtitleCell;

        public CarouselViewHolder(View view) {
            super(view);
            titleCell = view.findViewById(R.id.titleCell);
            subtitleCell = view.findViewById(R.id.subtitleCell);
        }
    }
}