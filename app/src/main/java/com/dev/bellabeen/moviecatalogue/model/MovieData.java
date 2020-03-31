package com.dev.bellabeen.moviecatalogue.model;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MovieData extends ViewModel {
    private static final String API_KEY = "c49905b44c6b290a1922a3adccd90f94";
    private static final String API_POSTER = "https://image.tmdb.org/t/p/w500/";
    private MutableLiveData<ArrayList<Movie>> listMovie = new MutableLiveData<>();

    public MutableLiveData<ArrayList<Movie>> getListMovie(){
        return listMovie;
    }

    public void setListMovie(){
        AsyncHttpClient client = new AsyncHttpClient();
        final ArrayList<Movie> listItems = new ArrayList<>();
//        https://api.themoviedb.org/3/movie/popular?api_key=c49905b44c6b290a1922a3adccd90f94&language=en-US


        String url = " https://api.themoviedb.org/3/discover/movie?api_key=c49905b44c6b290a1922a3adccd90f94&language=en-US";
        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    String result = new String(responseBody);
                    JSONObject responseObject = new JSONObject(result);
                    JSONArray list = responseObject.getJSONArray("results");
                    for (int i = 0; i < list.length(); i++) {
                        JSONObject results = list.getJSONObject(i);
                        Movie movieItems = new Movie();

                        movieItems.setJudul(results.getString("title"));
                        movieItems.setTanggal(results.getString("release_date"));
                        movieItems.setRating(results.getString("vote_average"));
                        movieItems.setDeskripsi(results.getString("overview"));
                        movieItems.setPoster(API_POSTER +(results.getString("poster_path")));

                        listItems.add(movieItems);
                    }
                    listMovie.postValue(listItems);
                } catch (Exception e) {
                    Log.d("Exception", e.getMessage());
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", error.getMessage());
            }
        });
    }
}
