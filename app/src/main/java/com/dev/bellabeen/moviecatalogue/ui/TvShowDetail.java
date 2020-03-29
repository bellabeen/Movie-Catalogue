package com.dev.bellabeen.moviecatalogue.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.dev.bellabeen.moviecatalogue.R;
import com.dev.bellabeen.moviecatalogue.model.Movie;
import com.dev.bellabeen.moviecatalogue.model.TvShows;

public class TvShowDetail extends AppCompatActivity {


    public static final String EXTRA_TVSHOW = "extra_tvshow";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvshow_detail);

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
        TvShows tvshow = intent.getParcelableExtra(EXTRA_TVSHOW);
        if (tvshow != null) {
            String judul = tvshow.getJudul();
            String rilis = tvshow.getTanggal();
            String rating = tvshow.getRating();
            //String status = movie.getStatus();
            //String bahasa = movie.getBahasa();
            //String durasi = movie.getDurasi();
            String deskripsi = tvshow.getDeskripsi();

            // set Data
            tvJudul.setText(judul);
            tvRilis.setText(rilis);
            tvRating.setText(rating);
            //tvStatus.setText(status);
            //tvBahasa.setText(bahasa);
            //tvDurasi.setText(durasi);
            tvDeskripsi.setText(deskripsi);

            Glide.with(this).load(tvshow.getPoster()).into(imgPoster);

        }
    }
//
//    ImageView imgPoster;
//    TextView tvTitle, tvOverview, tvStatus, tvOriginal_Language, tvGenre, tvRuntime, tvType, tvCreator;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tvshow_detail);
//
//
//        tvTitle = findViewById(R.id.textView);
//        tvGenre = findViewById(R.id.textView2);
//        tvOverview= findViewById(R.id.textView8);
//        tvStatus = findViewById(R.id.textView3);
//        tvOriginal_Language = findViewById(R.id.textView5);
//        tvRuntime = findViewById(R.id.textView6);
//        tvType = findViewById(R.id.textView9);
//        tvCreator = findViewById(R.id.textView10);
//
//
////        tvTitle.setText(getResources().getString(R.string.title));
////        tvGenre.setText(getResources().getString(R.string.genre));
////        tvOverview.setText(getResources().getString(R.string.overview));
////        tvStatus.setText(getResources().getString(R.string.status));
////        tvOriginal_Language.setText(getResources().getString(R.string.language));
////        tvRuntime.setText(getResources().getString(R.string.runtime));
////        tvType.setText(getResources().getString(R.string.type));
////        tvCreator.setText(getResources().getString(R.string.creator));
//
//
//        //get data Intent dari Activity
//        Intent intent = getIntent();
//        TvShows tvShows = intent.getParcelableExtra("Model");
//        String title = tvShows.getTitle();
//        String overview = tvShows.getOverview();
//        String status = tvShows.getStatus();
//        String original_language = tvShows.getOriginal_language();
//        String genre = tvShows.getGenre();
//        String runtime = tvShows.getRuntime();
//        String type = tvShows.getType();
//        String creator = tvShows.getCreator();
//
//
//        //set id data
//        tvTitle = findViewById(R.id.tv_title);
//        tvOverview = findViewById(R.id.tv_overview);
//        tvStatus = findViewById(R.id.tv_status);
//        tvOriginal_Language = findViewById(R.id.tv_original_language);
//        tvGenre = findViewById(R.id.tv_genre);
//        tvRuntime = findViewById(R.id.tv_runtime);
//        tvType = findViewById(R.id.tv_type);
//        tvCreator = findViewById(R.id.tv_creator);
//        imgPoster = findViewById(R.id.img_poster);
//
//
//        //setText Data
//        tvTitle.setText(title);
//        tvOverview.setText(overview);
//        tvStatus.setText(status);
//        tvOriginal_Language.setText(original_language);
//        tvGenre.setText(genre);
//        tvRuntime.setText(runtime);
//        tvType.setText(type);
//        tvCreator.setText(creator);
//
//        Glide.with(this)
//                .load(tvShows.getPoster())
//                .into(imgPoster);
//
//    }
}
