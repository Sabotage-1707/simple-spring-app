package first.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private List<String> playList1;
    private List<String> playList2;
    private List<String> playList3;

    /*public static MusicPlayer getMusicPlayer(){
        System.out.println("I'm here");
        return new MusicPlayer();
    }*/
    private String name;
    private int volume;

   /* void doMyInit(){
        System.out.println("Doing initialization...");
    }
    void doMyDestroy(){
        System.out.println("Doing destruction...");
    }*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music playList1,
                       @Qualifier("popMusic") Music playList2,
                       @Qualifier("reggiMusic") Music playList3){
        this.playList1 = playList1.getSong();
        this.playList2 = playList2.getSong();
        this.playList3 = playList3.getSong();
    }
    public MusicPlayer() {}


    public void setMusicList(List<Music> musicList){
        this.musicList = musicList;
    }
    public void addGenre(Music music){
        this.musicList.add(music);
    }
    /*public String playMusic(){
           return music.getSong() + " AND " + music2.getSong();
    }*/
    public String playMusicList(Genre genre){
        int random = (int)(Math.random() * 2);
        switch (genre){
            case CLASSICAL:
                 return playList1.get(random);
            case POP:
                return playList2.get(random);
            case REGGI:
                return playList3.get(random);
            default:
                return "";

        }

    }
}
