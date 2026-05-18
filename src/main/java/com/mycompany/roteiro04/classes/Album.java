
package com.mycompany.roteiro04.classes;

import com.mycompany.roteiro04.classes.managers.MusicManager;
import java.util.Objects;


public class Album {
    private String title;
    private String release;
    private String musicGenre;
    private String recordLabel;
    private MusicManager musicsInAlbum;

    public Album(String title, String release, String musicGenre, String recordLabel, MusicManager musicsInAlbum) {
        this.title = title;
        this.release = release;
        this.musicGenre = musicGenre;
        this.recordLabel = recordLabel;
        this.musicsInAlbum = musicsInAlbum;
    }

    public Album() {
        this.title = "";
        this.release = "";
        this.musicGenre = "";
        this.recordLabel = "";
        this.musicsInAlbum = new MusicManager();
    }
    
    public void add(Music m){
        musicsInAlbum.add(m);
    }
    
    public boolean remove(Music m){
        return musicsInAlbum.remove(m);
    }
    
    public boolean remove(String title){
        return musicsInAlbum.remove(title);
    }
    
    public Music search(String title){
        return musicsInAlbum.search(title);
    }
    
    public Music search(Music music){
        return musicsInAlbum.search(music);
    }
    
    @Override
    public String toString() {
        return "Album{" + "title=" + title + ", release=" + release + ", musicGenre=" + musicGenre + ", recordLabel=" + recordLabel + ", musicsInAlbum=" + musicsInAlbum + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.title);
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
        final Album other = (Album) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.release, other.release)) {
            return false;
        }
        if (!Objects.equals(this.musicGenre, other.musicGenre)) {
            return false;
        }
        if (!Objects.equals(this.recordLabel, other.recordLabel)) {
            return false;
        }
        return Objects.equals(this.musicsInAlbum, other.musicsInAlbum);
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }

    public MusicManager getMusicsInAlbum() {
        return musicsInAlbum;
    }

    public void setMusicsInAlbum(MusicManager musicsInAlbum) {
        this.musicsInAlbum = musicsInAlbum;
    }
    
    
    
    
}
