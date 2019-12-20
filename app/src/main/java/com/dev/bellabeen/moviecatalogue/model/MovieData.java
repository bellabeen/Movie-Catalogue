package com.dev.bellabeen.moviecatalogue.model;

import java.util.ArrayList;

public class MovieData {
    public static String[][] data = new String[][]{
            {"Avengers: Infinity War (2018)", "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg", "Released", "English", "Adventure, Action, Science Fiction", "2h 29m", "$300,000,000.00", "$2,046,239,637.00"},
            {"Bohemian Rhapsody (2018)", "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg", "Released", "English", "Drama, Music", "2h 15m", "$52,000,000.00", "$894,027,543.00"},
            {"Bumblebee (2018)", "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fw02ONlDhrYjTSZV8XO6hhU3ds3.jpg", "Released", "English", "Action, Adventure, Science Fiction", "1h 54m", "$135,000,000.00", "$465,895,025.00"},
            {"Deadpool 2 (2018)", "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg", "Released", "English", "Action, Comedy, Adventure", "2h 1 m", "$110,000,000.00", "$741,547,413.00"},
            {"Fantastic Beasts: The Crimes of Grindelwald (2018)", "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg", "Released", "English", "Adventure, Fantasy, Family", "2h 14m", "$200,000,000.00", "$653,355,901.00"},
            {"Incredibles 2 (2018)", "Elastigirl springs into action to save the day, while Mr. Incredible faces his greatest challenge yet – taking care of the problems of his three children.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/9lFKBtaVIhP7E2Pk0IY1CwTKTMZ.jpg", "Released", "English", "Action, Adventure, Animaation Family", "1h 58m", "$200,000,000.00", "$1,241,891,456.00"},
            {"It Chapter Two (2019)", "27 years after overcoming the malevolent supernatural entity Pennywise, the former members of the Losers' Club, who have grown up and moved away from Derry, are brought back together by a devastating phone call.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/zfE0R94v1E8cuKAerbskfD3VfUt.jpg", "Released", "English", "Horror, Drama, Fantasy", "2h 49m", "$79,000,000.00", "$472,093,228.00"},
            {"Joker (2019)", "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg", "Released", "English", "Crime, Thriller, Drama", "2h 2m", "$55,000,000.00", "$1,059,735,374.00"},
            {"Mission: Impossible - Fallout (2018)", "When an IMF mission ends badly, the world is faced with dire consequences. As Ethan Hunt takes it upon himself to fulfill his original briefing, the CIA begin to question his loyalty and his motives. The IMF team find themselves in a race against time, hunted by assassins while trying to prevent a global catastrophe.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/AkJQpZp9WoNdj7pLYSj1L0RcMMN.jpg", "Released", "English", "Action, Adventure", "2h 28m", "$178,000,000.00", "$791,017,452.00"},
            {"Spider-Man: Into the Spider-Verse (2018)", "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg", "Released", "English", "Action, Adventure, Animation, Science Fiction, Comedy", "1h 57m", "$90,000,000.00", "$375,450,417.00"}
    };

    public static ArrayList<Movie> getListData(){
        ArrayList<Movie> list = new ArrayList<Movie>();
        for (String[] aData : data){
            Movie movie = new Movie();
            movie.setTitle(aData[0]);
            movie.setOverview(aData[1]);
            movie.setPoster(aData[2]);
            movie.setStatus(aData[3]);
            movie.setOriginal_language(aData[4]);
            movie.setGenre(aData[5]);
            movie.setRuntime(aData[6]);
            movie.setBudget(aData[7]);
            movie.setRevenue(aData[8]);

            list.add(movie);

        }
        return list;
    }
}
