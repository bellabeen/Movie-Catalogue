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
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.dev.bellabeen.moviecatalogue.R;
import com.dev.bellabeen.moviecatalogue.adapter.MovieAdapter;
import com.dev.bellabeen.moviecatalogue.model.Movie;
import com.dev.bellabeen.moviecatalogue.model.MovieData;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {

    private RecyclerView rvCategory;
    private MovieAdapter adapter;
    private MovieData movieData;
    private ProgressBar progressBar;

    public MoviesFragment(){

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container,false);

        progressBar = view.findViewById(R.id.progressBar);
        rvCategory = view.findViewById(R.id.rv_movie);
        rvCategory.setHasFixedSize(true);

        movieData = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MovieData.class);
        rvCategory.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new MovieAdapter() {
            @Override
            public void onItemClicked(Movie data) {

            }
        };


        adapter.notifyDataSetChanged();
        rvCategory.setAdapter(adapter);
        movieData.setListMovie();
        showLoading(true);

        adapter.setOnItemClickCallback(new MovieAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Movie data) {
                showSelectedMovie(data);
            }
        });

        movieData.getListMovie().observe(this, new Observer<ArrayList<Movie>>() {
            @Override
            public void onChanged(ArrayList<Movie> moviesItems) {
                if (moviesItems != null){
                    adapter.setData(moviesItems);
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

    private void showSelectedMovie(Movie movie){
        Intent detailMovie = new Intent(getContext(), MovieDetail.class);
        detailMovie.putExtra(MovieDetail.EXTRA_MOVIE,movie);
        startActivity(detailMovie);
    }


//    private RecyclerView rvCategory;
//    private MovieAdapter adapter;
//    private MovieData movieData;
//    private ProgressBar progressBar;
////    private ArrayList<Movie> list = new ArrayList<Movie>();
//
//
//
//    public MoviesFragment() {
//        // Required empty public constructor
//    }
//
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_movies, container, false);
//
//        progressBar = view.findViewById(R.id.progressBar);
//        rvCategory = view.findViewById(R.id.rv_category);
//        rvCategory.setHasFixedSize(true);
//
//        movieData = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MovieData.class);
//        rvCategory.setLayoutManager(new LinearLayoutManager(getContext()));
//        adapter = new MovieAdapter();
//        adapter.notifyDataSetChanged();
//        rvCategory.setAdapter(adapter);
//        movieData.setListMovie();
//        showLoading(true);
//        //list.addAll(getListMovies());
//        //showRecyclerList();
//
//
//        adapter.setOnItemClickCallback(new MovieAdapter() {
//            @Override
//            public void onItemClicked(Movie data) {
//                showSelectedMovie(data);
//            }
//        });
//
//        MovieData.getListMovie().observe(this, new Observer<ArrayList<Movie>>() {
//            @Override
//            public void onChanged(ArrayList<Movie> movieItems) {
//                if (movieItems != null) {
//                    adapter.setData(movieItems);
//                    showLoading(false);
//                }
//            }
//        });
//        return view;
//    }
//
//    private void showLoading(Boolean state) {
//        if (state) {
//            progressBar.setVisibility(View.VISIBLE);
//        } else {
//            progressBar.setVisibility(View.GONE);
//        }
//    }
//
//    private void showSelectedMovie(Movie movie) {
//        Intent detailMovie = new Intent(getContext(), MovieDetail.class);
//        detailMovie.putExtra(MovieDetail.EXTRA_MOVIE, movie);
//        startActivity(detailMovie);
//    }
//
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_movies,container,false);
//
//        TextView tvTitle, tvGenre, tvOverview, tvStatus, tvOriginal_Language, tvRuntime, tvBudget, tvRevenue, tvType, tvCreator;
//        //    TextView title, genre, overview, status, original_language, runtime, budget, revenue, type, creator;
//
//
//        rvCategory = view.findViewById(R.id.rv_category);
//        rvCategory.setHasFixedSize(true);
//
//        list.addAll(MovieData.getListData());
//        showRecyclerList();
//        return view;
//    }
//
//        private void showRecyclerList(){
//        rvCategory.setLayoutManager(new LinearLayoutManager(this.getContext()));
//        MovieAdapter movieAdapter = new MovieAdapter(this.getContext());
//        movieAdapter.setListMovie(list);
//        rvCategory.setAdapter(movieAdapter);
//    }

}
