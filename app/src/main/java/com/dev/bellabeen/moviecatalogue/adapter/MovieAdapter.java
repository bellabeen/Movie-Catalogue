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
import com.dev.bellabeen.moviecatalogue.model.Movie;
import com.dev.bellabeen.moviecatalogue.ui.MovieDetail;
import com.dev.bellabeen.moviecatalogue.R;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.CategoryViewHolder> {

    public MovieAdapter(Context context){
        this.context = context;
    }

    private Context context;

    public ArrayList<Movie> getListMovie(){
        return listmovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie){
        this.listmovie = listMovie;
    }

    private ArrayList<Movie> listmovie;


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_movie, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }


    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {

        final String title = getListMovie().get(position).getTitle();
        final String poster = getListMovie().get(position).getPoster();
        final String genre = getListMovie().get(position).getGenre();


        categoryViewHolder.tvTitle.setText(title);
        categoryViewHolder.tvGenre.setText(genre);

        Glide.with(context)
                .load(poster)
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPoster);


        categoryViewHolder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MovieDetail.class);
                intent.putExtra("Model", listmovie.get(position));
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relative;
        TextView tvTitle, tvGenre, tvOverview, tvStatus, tvOriginal_Language, tvRuntime, tvBudget, tvRevenue;
        ImageView imgPoster;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            relative = itemView.findViewById(R.id.relative);
            tvTitle = itemView.findViewById(R.id.tv_title);
            imgPoster = itemView.findViewById(R.id.img_poster);
            tvGenre = itemView.findViewById(R.id.tv_genre);
            tvOverview = itemView.findViewById(R.id.tv_overview);
//            tvStatus = itemView.findViewById(R.id.tv_status);
//            tvOriginal_Language = itemView.findViewById(R.id.tv_original_language);
//            tvRuntime = itemView.findViewById(R.id.tv_runtime);
//            tvBudget = itemView.findViewById(R.id.tv_budget);
//            tvRevenue = itemView.findViewById(R.id.tv_revenue);
        }
    }
}
