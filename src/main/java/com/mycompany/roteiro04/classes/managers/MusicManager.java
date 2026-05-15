package com.mycompany.roteiro04.classes.managers;


import Classes.Music;
import java.util.List;

public class MusicManager {
    private List<Music> musics;
    
    public void addMusic(String title){
        musics.add(title);
        
    }
    
}

