package com.dev.bellabeen.moviecatalogue.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dev.bellabeen.moviecatalogue.R;

public class MovieDetail extends AppCompatActivity {
    ImageView imgPoster;
    TextView tvTitle, tvGenre, tvOverview, tvStatus, tvOriginal_Language, tvRuntime, tvBudget, tvRevenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        //get data Intent dari Activity
        final String dtTitle = getIntent().getExtras().getString("iTitle");
        final String dtGenre = getIntent().getExtras().getString("iGenre");
        final String dtPoster = getIntent().getExtras().getString("iPoster");
        final String dtOverview = getIntent().getExtras().getString("iOverview");
        final String dtStatus = getIntent().getExtras().getString("iStatus");
        final String dtOriginal_Language = getIntent().getExtras().getString("iOriginal_Language");
        final String dtRuntime = getIntent().getExtras().getString("iRuntime");
        final String dtBudget = getIntent().getExtras().getString("iBudget");
        final String dtRevenue = getIntent().getExtras().getString("iRevenue");


        //set id data
        imgPoster = findViewById(R.id.img_poster);
        tvTitle = findViewById(R.id.tv_title);
        tvGenre = findViewById(R.id.tv_genre);
        tvOverview = findViewById(R.id.tv_overview);
        tvStatus = findViewById(R.id.tv_status);
        tvOriginal_Language = findViewById(R.id.tv_original_language);
        tvRuntime = findViewById(R.id.tv_runtime);
        tvBudget = findViewById(R.id.tv_budget);
        tvRevenue = findViewById(R.id.tv_revenue);

        //setText Data
        tvTitle.setText(dtTitle);
        tvGenre.setText(dtGenre);
        tvOverview.setText(dtOverview);
        tvStatus.setText(dtStatus);
        tvOriginal_Language.setText(dtOriginal_Language);
        tvRuntime.setText(dtRuntime);
        tvBudget.setText(dtBudget);
        tvRevenue.setText(dtRevenue);

        //set Load Gambar
        Glide.with(this)
                .load(dtPoster)
                .into(imgPoster);

    }
}
