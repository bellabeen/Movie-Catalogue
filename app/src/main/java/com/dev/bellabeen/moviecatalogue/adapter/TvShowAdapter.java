package com.dev.bellabeen.moviecatalogue.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dev.bellabeen.moviecatalogue.R;
import com.dev.bellabeen.moviecatalogue.model.Movie;
import com.dev.bellabeen.moviecatalogue.model.TvShows;
import com.dev.bellabeen.moviecatalogue.ui.MovieDetail;
import com.dev.bellabeen.moviecatalogue.ui.TvShowDetail;

import java.util.ArrayList;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.ListViewHolder> {
    private OnItemClickCallback onItemClickCallback;
    private ArrayList<TvShows> mData = new ArrayList<>();

    public void setData(ArrayList<TvShows> items) {
        mData.clear();
        mData.addAll(items);
        notifyDataSetChanged();
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_tvshow, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        holder.bind(mData.get(position));

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        private TextView tvJudul, tvRilis, tvRating, tvDeskripsi;
        private ImageView imgPhoto;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tv_judul);
            tvRilis = itemView.findViewById(R.id.tv_rilis);
            tvRating = itemView.findViewById(R.id.tv_rating);
            tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi);
            imgPhoto = itemView.findViewById(R.id.img_poster);
        }

        void bind(TvShows tvShows) {

            tvJudul.setText(tvShows.getJudul());
            tvRilis.setText(tvShows.getTanggal());
            Glide.with(itemView.getContext()).load(tvShows.getPoster()).into(imgPhoto);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickCallback.onItemClicked(mData.get(getAdapterPosition()));
                }
            });
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(TvShows data);
    }
}
