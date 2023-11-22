package org.example;

import java.util.ArrayList;

public class Serie extends Media{
    String release;
    ArrayList<String> category;
    ArrayList<String> Seasons;
    public Serie(String title, ArrayList<String> category, String release, double rating, ArrayList<String> Seasons) {
        super(title, rating);
        this.release = release;
        this.category=category;
        this.Seasons=Seasons;
    }


@Override
    public ArrayList<String> getCategory() {
        return new ArrayList<>(category);
    }


    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", release='" + release + '\'' +
                ", category=" + getCategory() +
                ", rating=" + rating +
                ", seasons=" + Seasons +
                '}';
    }


}
