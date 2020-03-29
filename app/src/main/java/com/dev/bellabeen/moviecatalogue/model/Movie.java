package com.dev.bellabeen.moviecatalogue.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String judul;
    private String tanggal;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    private String rating;
    private String status;
    private String bahasa;
    private String durasi;
    private String deskripsi;
    private String poster;


//    private String title;
//    private String overview;
//    private String poster;
//    private String status;
//    private String original_language;
//    private String genre;
//    private String runtime;
//    private String budget;
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getOverview() {
//        return overview;
//    }
//
//    public void setOverview(String overview) {
//        this.overview = overview;
//    }
//
//    public String getPoster() {
//        return poster;
//    }
//
//    public void setPoster(String poster) {
//        this.poster = poster;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getOriginal_language() {
//        return original_language;
//    }
//
//    public void setOriginal_language(String original_language) {
//        this.original_language = original_language;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public String getRuntime() {
//        return runtime;
//    }
//
//    public void setRuntime(String runtime) {
//        this.runtime = runtime;
//    }
//
//    public String getBudget() {
//        return budget;
//    }
//
//    public void setBudget(String budget) {
//        this.budget = budget;
//    }
//
//    public String getRevenue() {
//        return revenue;
//    }
//
//    public void setRevenue(String revenue) {
//        this.revenue = revenue;
//    }
//
//    private String revenue;
//
//    public Movie(){
//
//    }
//
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(this.title);
//        dest.writeString(this.overview);
//        dest.writeString(this.poster);
//        dest.writeString(this.status);
//        dest.writeString(this.original_language);
//        dest.writeString(this.genre);
//        dest.writeString(this.runtime);
//        dest.writeString(this.budget);
//        dest.writeString(this.revenue);
//    }
//
//    protected Movie(Parcel in) {
//        this.title = in.readString();
//        this.overview = in.readString();
//        this.poster = in.readString();
//        this.status = in.readString();
//        this.original_language = in.readString();
//        this.genre = in.readString();
//        this.runtime = in.readString();
//        this.budget = in.readString();
//        this.revenue = in.readString();
//    }
//
//    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
//        @Override
//        public Movie createFromParcel(Parcel source) {
//            return new Movie(source);
//        }
//
//        @Override
//        public Movie[] newArray(int size) {
//            return new Movie[size];
//        }
//    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.tanggal);
        dest.writeString(this.rating);
        dest.writeString(this.status);
        dest.writeString(this.bahasa);
        dest.writeString(this.durasi);
        dest.writeString(this.deskripsi);
        dest.writeString(this.poster);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.judul = in.readString();
        this.tanggal = in.readString();
        this.rating = in.readString();
        this.status = in.readString();
        this.bahasa = in.readString();
        this.durasi = in.readString();
        this.deskripsi = in.readString();
        this.poster = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
