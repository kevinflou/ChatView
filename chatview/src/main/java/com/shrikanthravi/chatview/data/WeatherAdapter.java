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
import com.squareup.picasso.Picasso;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    private List<HourWeather> HourWeatherList;
    private Context context;
    private RecyclerView recyclerView;

    public WeatherAdapter(List<HourWeather> verticalList, Context context, RecyclerView recyclerView) {
        this.HourWeatherList = verticalList;
        this.context = context;
        this.recyclerView = recyclerView;
    }

    @Override
    public WeatherAdapter.WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.weather_cell, parent, false);
        return new WeatherAdapter.WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeatherAdapter.WeatherViewHolder holder, int position) {
        Picasso.with(context).load(HourWeatherList.get(position).getIcon()).into(holder.iconHourIV);
        holder.tempHourTV.setText(HourWeatherList.get(position).getTMP2m());
        holder.hourofhourTV.setText(HourWeatherList.get(position).getHour());
        holder.itemView.setOnClickListener(HourWeatherList.get(position).getClickListener());
    }

    @Override
    public int getItemCount() {
        return HourWeatherList.size();
    }

    protected class WeatherViewHolder extends RecyclerView.ViewHolder {
        public TextView tempHourTV,hourofhourTV;
        public ImageView iconHourIV;

        public WeatherViewHolder(View view) {
            super(view);
            tempHourTV = view.findViewById(R.id.tempHourTV);
            hourofhourTV = view.findViewById(R.id.hourofhourTV);
            iconHourIV = view.findViewById(R.id.iconHourIV);
        }
    }
}
