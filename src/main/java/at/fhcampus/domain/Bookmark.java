package at.fhcampus.domain;

import java.util.ArrayList;
import java.util.Objects;

public class Bookmark {

    private String url;

    private ArrayList<String> tags=new ArrayList<String>();

    private int rating;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Bookmark(String url) {
        this.url = url;
    }

    public Bookmark(String url, String tag) {
        this.url = url;
        this.tags.add(tag);


    }

    @Override
    public String toString() {
        return "Bookmark{" +
                "url='" + url + '\'' +
                ", tags=" + tags +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookmark bookmark = (Bookmark) o;
        return rating == bookmark.rating && Objects.equals(url, bookmark.url) && Objects.equals(tags, bookmark.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, tags, rating);
    }
}