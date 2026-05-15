package com.mycompany.roteiro04.classes.managers;

import com.mycompany.roteiro04.classes.Album;
import java.util.ArrayList;
import java.util.List;

public class AlbumManager {
     private List<Album> albums;

    public AlbumManager() {
        this.albums = new ArrayList<>();
    }
    
    public void add(Album a){
        albums.add(a);
    }
    
    public boolean remove(Album a){
        return albums.remove(a);
    }
                                                                                                                                                                         
    public boolean remove(String title){
        for(Album a: albums){
            if(a.getTitle() == null ? title == null : a.getTitle().equals(title)){
                albums.remove(a);
                return true;
            }
        }
        return false;
    }
    
    public Album search(String title){
        for(Album a: albums){
            if(a.getTitle() == null ? title == null : a.getTitle().equals(title)){
                return a;
            }
        }
        return null;
    }
    
    public Album search(Album album){
        for(Album a: albums){
            if(a.equals(album)){
                return a;
            }
        }
        return null;
    }
    
}
