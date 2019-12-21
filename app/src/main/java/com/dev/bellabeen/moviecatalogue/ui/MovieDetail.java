package com.dev.bellabeen.moviecatalogue.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dev.bellabeen.moviecatalogue.R;
import com.dev.bellabeen.moviecatalogue.model.Movie;

import java.util.ArrayList;

public class MovieDetail extends AppCompatActivity {
    ImageView imgPoster;
    String title, genre, overview, status, original_language, runtime, budget, revenue, poster;
    TextView tvTitle, tvGenre, tvOverview, tvStatus, tvOriginal_Language, tvRuntime, tvBudget, tvRevenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);


        //get data Intent dari Activity
        Intent intent = getIntent();
        Movie movie = intent.getParcelableExtra("Model");
        String title = movie.getTitle();
        String genre = movie.getGenre();
        String overview = movie.getOverview();
        String status = movie.getStatus();
        String original_language = movie.getOriginal_language();
        String runtime = movie.getRuntime();
        String budget = movie.getBudget();
        String revenue = movie.getRevenue();



        //set id data
        tvTitle = findViewById(R.id.tv_title);
        tvGenre = findViewById(R.id.tv_genre);
        tvOverview = findViewById(R.id.tv_overview);
        tvStatus = findViewById(R.id.tv_status);
        tvOriginal_Language = findViewById(R.id.tv_original_language);
        tvRuntime = findViewById(R.id.tv_runtime);
        tvBudget = findViewById(R.id.tv_budget);
        tvRevenue = findViewById(R.id.tv_revenue);
        imgPoster = findViewById(R.id.img_poster);


        //setText Data
        tvTitle.setText(title);
        tvGenre.setText(genre);
        tvOverview.setText(overview);
        tvStatus.setText(status);
        tvOriginal_Language.setText(original_language);
        tvRuntime.setText(runtime);
        tvBudget.setText(budget);
        tvRevenue.setText(revenue);

        Glide.with(this)
                .load(movie.getPoster())
                .into(imgPoster);

    }
}
