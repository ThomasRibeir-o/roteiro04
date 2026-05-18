package com.mycompany.roteiro04.classes;

import com.mycompany.roteiro04.classes.managers.AlbumManager;
import java.util.Objects;

public class Artist {
    private String name;
    private String artistCountry;
    private String date;
    private String biography;
    private AlbumManager artistAlbums;

    public Artist() {
        this.name = "";
        this.artistCountry = "";
        this.date = "";
        this.biography = "";
        this.artistAlbums = new AlbumManager();
    }
    
    public Artist(String name, String artistCountry, String date, String biography, AlbumManager artistAlbums) {
        this.name = name;
        this.artistCountry = artistCountry;
        this.date = date;
        this.biography = biography;
        this.artistAlbums = artistAlbums;
    }

    
    public void add(Album a){
        artistAlbums.add(a);
    }
    
    public boolean remove(Album a){
        return artistAlbums.remove(a);
    }
                                                                                                                                                                         
    public boolean remove(String title){
        return artistAlbums.remove(title);
    }
    
    public Album search(String title){       
        return artistAlbums.search(title);
    }
    
    public Album search(Album album){
        return artistAlbums.search(album);
    }
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.artistCountry);
        hash = 97 * hash + Objects.hashCode(this.date);
        hash = 97 * hash + Objects.hashCode(this.biography);
        hash = 97 * hash + Objects.hashCode(this.artistAlbums);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Artist other = (Artist) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.artistCountry, other.artistCountry)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.biography, other.biography)) {
            return false;
        }
        return Objects.equals(this.artistAlbums, other.artistAlbums);
    }

        @Override
    public String toString() {
        return "Artist{" + "name=" + name + ", artistCountry=" + artistCountry + ", date=" + date + ", biography=" + biography + ", artistAlbums=" + artistAlbums + '}';
    }
    
    public String getName() {
        return name;
    }

    public String getArtistCountry() {
        return artistCountry;
    }

    public String getDate() {
        return date;
    }

    public String getBiography() {
        return biography;
    }

    public AlbumManager getArtistAlbums() {
        return artistAlbums;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtistCountry(String artistCountry) {
        this.artistCountry = artistCountry;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setArtistAlbums(AlbumManager artistAlbums) {
        this.artistAlbums = artistAlbums;
    }
    
}
