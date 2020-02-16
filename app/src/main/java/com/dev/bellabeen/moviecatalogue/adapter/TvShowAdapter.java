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

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.CategoryViewHolder> {

    public TvShowAdapter(Context context){
        this.context = context;
    }

    private Context context;

    public ArrayList<TvShows> getListTvShow(){
        return listtvshow;
    }

    public void setListTvShow(ArrayList<TvShows> listTvShow){
        this.listtvshow = listTvShow;
    }

    private ArrayList<TvShows> listtvshow;


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_tvshow, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }


    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {

        final String title = getListTvShow().get(position).getTitle();
        final String poster = getListTvShow().get(position).getPoster();
        final String genre = getListTvShow().get(position).getGenre();


        categoryViewHolder.tvTitle.setText(title);
        categoryViewHolder.tvGenre.setText(genre);

        Glide.with(context)
                .load(poster)
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPoster);


        categoryViewHolder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TvShowDetail.class);
                intent.putExtra("Model", listtvshow.get(position));
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return getListTvShow().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relative;
        TextView tvTitle, tvGenre, tvOverview;
        ImageView imgPoster;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            relative = itemView.findViewById(R.id.relative);
            tvTitle = itemView.findViewById(R.id.tv_title);
            imgPoster = itemView.findViewById(R.id.img_poster);
            tvGenre = itemView.findViewById(R.id.tv_genre);
            tvOverview = itemView.findViewById(R.id.tv_overview);
        }
    }
}
