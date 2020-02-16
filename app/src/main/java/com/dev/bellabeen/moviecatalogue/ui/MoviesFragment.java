package com.dev.bellabeen.moviecatalogue.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
    private ArrayList<Movie> list = new ArrayList<Movie>();



    public MoviesFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies,container,false);

        TextView tvTitle, tvGenre, tvOverview, tvStatus, tvOriginal_Language, tvRuntime, tvBudget, tvRevenue, tvType, tvCreator;
        //    TextView title, genre, overview, status, original_language, runtime, budget, revenue, type, creator;


//        tvTitle = view.findViewById(R.id.tv_title);
//        tvGenre = view.findViewById(R.id.tv_genre);
//
//
//        tvTitle.setText(getResources().getString(R.string.title));
//        tvGenre.setText(getResources().getString(R.string.genre));

        rvCategory = view.findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showRecyclerList();
        return view;
    }

        private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this.getContext()));
        MovieAdapter movieAdapter = new MovieAdapter(this.getContext());
        movieAdapter.setListMovie(list);
        rvCategory.setAdapter(movieAdapter);
    }

}
