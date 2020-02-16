package com.dev.bellabeen.moviecatalogue.model;

import java.util.ArrayList;

public class TvShowsData {
    public static String[][] data = new String[][]{
            {"9-1-1 (2018)", "Explore the high-pressure experiences of police officers, paramedics and firefighters who are thrust into the most frightening, shocking and heart-stopping situations. These emergency responders must try to balance saving those who are at their most vulnerable with solving the problems in their own lives.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/htX1x0gq8Y5bN9vtGzERf9nbOTK.jpg", "Returning Series", "English",
                    "Action & Adventure, Crime, Drama", "45m", "Scripted", "Ryan Murphy & Brad Falchuk"},
            {"FBI (2018)", "The elite unit of the New York office of the FBI brings to bear all their talents, intellect and technical expertise on major cases in order to keep New York and the country safe.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/nKulwcleWvL9Aoa9VLIT0TQpHqC.jpg", "Returning Series", "English",
                    "Crime, Drama", "43m", "Scripted", "Dick Wolf"},
            {"Lost in Space (2018)", "After crash-landing on an alien planet, the Robinson family fights against all odds to survive and escape. But they're surrounded by hidden dangers.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/83mK4CnvRPFSqcyO3s3lq6aDy1x.jpg", "Returning Series", "English",
                    "Sci-Fi, Action & Adventure, Drama", "56m", "Scripted", "Matt Sazama & Burk Sharpless"},
            {"Legacies (2018)", "n a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/rb64COqdpRRfWOc6gWTfC7WxzXP.jpg", "Returning Series", "English",
                    "Drama, Sci-Fi & Fantasy", "43m", "Scripted", "Julie Plec"},
            {"Manifest (2018)", "After landing from a turbulent but routine flight, the crew and passengers of Montego Air Flight 828 discover five years have passed in what seemed like a few hours. As their new realities become clear, a deeper mystery unfolds and some of the returned passengers soon realize they may be meant for something greater than they ever thought possible.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/1xeiUxShzNn8TNdMqy3Hvo9o2R.jpg", "Returning Series", "English",
                    "Drama, Mystery", "42m", "Scripted", "Robert Zemeckis, Jack Rapke & Jeff Rake"},
            {"Station 19 (2018)", "A group of heroic firefighters at Seattle Fire Station 19—from captain to newest recruit—risk their lives and hearts both in the line of duty and off the clock. These brave men and women are like family, literally and figuratively, and together they put their own lives in jeopardy as first responders to save the lives of others.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/apvr0s7sLvlPgNGtfuvM5EOJJMO.jpg", "Returning Series", "English",
                    "Drama", "43m", "Scripted", "Stacy McKee"},
            {"Tom Clancy's Jack Ryan (2018)", "When CIA analyst Jack Ryan stumbles upon a suspicious series of bank transfers his search for answers pulls him from the safety of his desk job and catapults him into a deadly game of cat and mouse throughout Europe and the Middle East, with a rising terrorist figurehead preparing for a massive attack against the US and her allies.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/1raUrQr8Y2tSYjTDbk8wfWGKTmX.jpg", "Returning Series", "English",
                    "Action & Adventure, Drama, War & Politics", "60m", "Scripted", "Graham Roland & Carlton Cuse"},
            {"Yellowstone (2018)", "Follow the violent world of the Dutton family, who controls the largest contiguous ranch in the United States. Led by their patriarch John Dutton, the family defends their property against constant attack by land developers, an Indian reservation, and America’s first National Park.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/3ePlESS6eyUj9W7yPEbzhwWaiFo.jpg", "Returning Series", "English",
                    "Drama, Western", "42m", "Scripted", "John Linson & Taylor Sheridan"},

            {"YOU (2018)", "When a brilliant bookstore manager crosses paths with an aspiring writer, he uses the internet and social media to gather the most intimate of details and get close to her. A charming and awkward crush quickly becomes obsession as he quietly and strategically removes every obstacle - and person - in his way.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/9qZUrhcFVI9MNznVJxdfcrmifof.jpg", "Returning Series", "English",
                    "Crime, Drama", "46m", "Scripted", "Greg Berlanti & Sera Gamble"},

            {"The Resident (2018)", "A tough, brilliant senior resident guides an idealistic young doctor through his first day, pulling back the curtain on what really happens, both good and bad, in modern-day medicine.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/k1Df8EkXpsEogBj1FXbLfn2mm4i.jpg", "Returning Series", "English",
                    "Drama", "42m", "Scripted", "Amy Holden Jones, Roshan Sethi & Hayley Schore"}
    };


    public static ArrayList<TvShows> getListData(){
        ArrayList<TvShows> list = new ArrayList<TvShows>();
        for (String[] aData : data){
            TvShows tvShows = new TvShows();
            tvShows.setTitle(aData[0]);
            tvShows.setOverview(aData[1]);
            tvShows.setPoster(aData[2]);
            tvShows.setStatus(aData[3]);
            tvShows.setOriginal_language(aData[4]);
            tvShows.setGenre(aData[5]);
            tvShows.setRuntime(aData[6]);
            tvShows.setType(aData[7]);
            tvShows.setCreator(aData[8]);

            list.add(tvShows);

        }
        return list;
    }
}
