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

    public static final String EXTRA_MOVIE = "extra_tvshow";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

// set Textview
        TextView tvJudul = findViewById(R.id.tv_judul);
        TextView tvRilis = findViewById(R.id.tv_rilis);
        TextView tvRating = findViewById(R.id.tv_rating);
        //TextView tvStatus = findViewById(R.id.status);
        //TextView tvBahasa = findViewById(R.id.bahasa);
        //TextView tvDurasi = findViewById(R.id.durasi);
        TextView tvDeskripsi = findViewById(R.id.tv_deskripsi);
        ImageView imgPoster = findViewById(R.id.img_photo);

        //get data Intent dari Activity
        Intent intent = getIntent();
        Movie movie = intent.getParcelableExtra(EXTRA_MOVIE);
        if (movie != null) {
            String judul = movie.getJudul();
            String rilis = movie.getTanggal();
            String rating = movie.getRating();
            //String status = movie.getStatus();
            //String bahasa = movie.getBahasa();
            //String durasi = movie.getDurasi();
            String deskripsi = movie.getDeskripsi();

            // set Data
            tvJudul.setText(judul);
            tvRilis.setText(rilis);
            tvRating.setText(rating);
            //tvStatus.setText(status);
            //tvBahasa.setText(bahasa);
            //tvDurasi.setText(durasi);
            tvDeskripsi.setText(deskripsi);

            Glide.with(this).load(movie.getPoster()).into(imgPoster);

        }
    }
//    ImageView imgPoster;
//    TextView tvTitle, tvGenre, tvOverview, tvStatus, tvOriginal_Language, tvRuntime, tvBudget, tvRevenue;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_movie_detail);
//
//
//        tvTitle = findViewById(R.id.textView);
//        tvGenre = findViewById(R.id.textView2);
//        tvOverview= findViewById(R.id.textView8);
//        tvStatus = findViewById(R.id.textView3);
//        tvOriginal_Language = findViewById(R.id.textView5);
//        tvRuntime = findViewById(R.id.textView6);
//        tvBudget = findViewById(R.id.textView4);
//        tvRevenue = findViewById(R.id.textView7);
////        tvType = findViewById(R.id.textView9);
////        tvCreator = findViewById(R.id.textView10);
//
//
//
//
//        //get data Intent dari Activity
//        Intent intent = getIntent();
//        Movie movie = intent.getParcelableExtra("Model");
//        String title = movie.getTitle();
//        String genre = movie.getGenre();
//        String overview = movie.getOverview();
//        String status = movie.getStatus();
//        String original_language = movie.getOriginal_language();
//        String runtime = movie.getRuntime();
//        String budget = movie.getBudget();
//        String revenue = movie.getRevenue();
//
//
//
//        //set id data
//        tvTitle = findViewById(R.id.tv_title);
//        tvGenre = findViewById(R.id.tv_genre);
//        tvOverview = findViewById(R.id.tv_overview);
//        tvStatus = findViewById(R.id.tv_status);
//        tvOriginal_Language = findViewById(R.id.tv_original_language);
//        tvRuntime = findViewById(R.id.tv_runtime);
//        tvBudget = findViewById(R.id.tv_budget);
//        tvRevenue = findViewById(R.id.tv_revenue);
//        imgPoster = findViewById(R.id.img_poster);
//
//
//        //setText Data
//        tvTitle.setText(title);
//        tvGenre.setText(genre);
//        tvOverview.setText(overview);
//        tvStatus.setText(status);
//        tvOriginal_Language.setText(original_language);
//        tvRuntime.setText(runtime);
//        tvBudget.setText(budget);
//        tvRevenue.setText(revenue);
//
//        Glide.with(this)
//                .load(movie.getPoster())
//                .into(imgPoster);
//
//    }
}
