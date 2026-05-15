package com.mycompany.roteiro04.classes.managers;


import com.mycompany.roteiro04.classes.Music;
import java.util.ArrayList;
import java.util.List;

public class MusicManager {
    private List<Music> musics;

    public MusicManager() {
        this.musics = new ArrayList<>();
    }
    
    public void add(Music m){
        musics.add(m);
    }
    
    public boolean remove(Music m){
        return musics.remove(m);
    }
                                                                                                                                                                         
    public boolean remove(String tittle){
        for(Music m: musics){
            if(m.getTitle() == null ? tittle == null : m.getTitle().equals(tittle)){
                musics.remove(m);
                return true;
            }
        }
        return false;
    }
    
    public Music search(String title){
        for(Music m: musics){
            if(m.getTitle() == null ? title == null : m.getTitle().equals(title)){
                return m;
            }
        }
        return null;
    }
    
    public Music search(Music music){
        for(Music m: musics){
            if(m.equals(music)){
                return m;
            }
        }
        return null;
    }
    
    
    
}

