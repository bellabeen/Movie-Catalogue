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

public class TvShowsData extends ViewModel {

    private static final String API_KEY = "c49905b44c6b290a1922a3adccd90f94";
    private static final String API_POSTER = "https://image.tmdb.org/t/p/w500/";
    private MutableLiveData<ArrayList<TvShows>> listTvShow = new MutableLiveData<>();

    public MutableLiveData<ArrayList<TvShows>> getListTvShow(){
        return listTvShow;
    }

    public void setListTvShow() {
        AsyncHttpClient client = new AsyncHttpClient();
        final ArrayList<TvShows> listItemTvShows = new ArrayList<>();
        String url = "https://api.themoviedb.org/3/discover/tv?api_key=dba7100ddaff47a7f37e8d8e6622d6a0&language=en-US" + API_KEY;
        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    String result = new String(responseBody);
                    JSONObject responseObject = new JSONObject(result);
                    JSONArray list = responseObject.getJSONArray("results");
                    for (int i = 0; i < list.length(); i++){
                        JSONObject resultsTVShow = list.getJSONObject(i);
                        TvShows tvshowItems = new TvShows();

                        tvshowItems.setJudul(resultsTVShow.getString("name"));
                        tvshowItems.setTanggal(resultsTVShow.getString("first_air_date"));
                        tvshowItems.setRating(resultsTVShow.getString("vote_average"));
                        tvshowItems.setDeskripsi(resultsTVShow.getString("overview"));

                        listItemTvShows.add(tvshowItems);
                    }
                    listTvShow.postValue(listItemTvShows);
                } catch (Exception e){
                    Log.d("Exception",e.getMessage());
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.d("onFailure", error.getMessage());
            }
        });
    }
}
