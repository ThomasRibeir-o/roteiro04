package com.mycompany.roteiro04.classes;

import java.util.Objects;

public class Music {
   private String title;
   private String duration;
   
    public Music(){
       this.title = "";
       this.duration = "";
    }
         
    public Music(String title, String duration){
       this.title = title;
       this.duration = duration;
    }
   
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.title);
        hash = 41 * hash + Objects.hashCode(this.duration);
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
        final Music other = (Music) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.duration, other.duration);
    }

    @Override
    public String toString() {
        return "Music{" + "title=" + title + ", duration=" + duration + '}';
    }
 
    public void setTitle(String title){
       this.title = title;
    }
   
    public void setDuration(String duration){
       this.duration = duration;
    }
   
    public String getTitle(){
       return this.title;
    }
   
    public String getDuration(){
       return this.duration;
    }
    
    
}
