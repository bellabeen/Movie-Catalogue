package com.dev.bellabeen.moviecatalogue.ui;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.dev.bellabeen.moviecatalogue.R;
import com.dev.bellabeen.moviecatalogue.adapter.MovieAdapter;
import com.dev.bellabeen.moviecatalogue.adapter.TvShowAdapter;
import com.dev.bellabeen.moviecatalogue.model.Movie;
import com.dev.bellabeen.moviecatalogue.model.MovieData;
import com.dev.bellabeen.moviecatalogue.model.TvShows;
import com.dev.bellabeen.moviecatalogue.model.TvShowsData;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {

    private RecyclerView rvCategory;
    private TvShowAdapter adapter;
    private TvShowsData tvShowsData;
    private ProgressBar progressBar;

    public TvShowFragment(){

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tv_show, container,false);

        progressBar = view.findViewById(R.id.progressBar);
        rvCategory = view.findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        tvShowsData = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(TvShowsData.class);
        rvCategory.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TvShowAdapter();


        adapter.notifyDataSetChanged();
        rvCategory.setAdapter(adapter);
        tvShowsData.setListTvShow();
        showLoading(true);

        adapter.setOnItemClickCallback(new TvShowAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(TvShows data) {
                showSelectedTvShow(data);
            }
        });

        tvShowsData.getListTvShow().observe(this, new Observer<ArrayList<TvShows>>() {
            @Override
            public void onChanged(ArrayList<TvShows> tvshowItems) {
                if (tvshowItems != null){
                    adapter.setData(tvshowItems);
                    showLoading(false);
                }
            }
        });
        return view;


    }

    private void showLoading(Boolean state) {
        if (state) {
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.GONE);
        }
    }

    private void showSelectedTvShow(TvShows tvshow){
        Intent detailTvShow = new Intent(getContext(), TvShowDetail.class);
        detailTvShow.putExtra(TvShowDetail.EXTRA_TVSHOW,tvshow);
        startActivity(detailTvShow);
    }
//    private RecyclerView rvCategory;
//    private ArrayList<TvShows> list = new ArrayList<TvShows>();
//
//
//    public TvShowFragment() {
//        // Required empty public constructor
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_tv_show,container,false);
//
//        TextView tvTitle, tvGenre, tvOverview, tvStatus, tvOriginal_Language, tvRuntime, tvBudget, tvRevenue, tvType, tvCreator;
//        //    TextView title, genre, overview, status, original_language, runtime, budget, revenue, type, creator;
//
//
////        tvTitle = view.findViewById(R.id.tv_title);
////        tvGenre = view.findViewById(R.id.tv_genre);
////
////
////        tvTitle.setText(getResources().getString(R.string.title));
////        tvGenre.setText(getResources().getString(R.string.genre));
//
//        rvCategory = view.findViewById(R.id.rv_category);
//        rvCategory.setHasFixedSize(true);
//
//        list.addAll(TvShowsData.getListData());
//        showRecyclerList();
//        return view;
//    }
//
//        private void showRecyclerList(){
//        rvCategory.setLayoutManager(new LinearLayoutManager(this.getContext()));
//        TvShowAdapter tvShowAdapter = new TvShowAdapter(this.getContext());
//        tvShowAdapter.setListTvShow(list);
//        rvCategory.setAdapter(tvShowAdapter);
//    }

}
