package first.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Computer {
    private MusicPlayer musicPlayer;

    @Override
    public String toString() {
        Genre genre = null2;
        System.out.println("Choose music genre: Classical - 0, Pop - 1, Reggi - 2");
        Scanner scanner = new Scanner(System.in);
        byte type = scanner.nextByte();
        switch (type){
            case 0:
                genre = Genre.CLASSICAL;
                break;
            case 1:
                genre = Genre.POP;
                break;
            case 2:
                genre = Genre.REGGI;
                break;
        }
        return "Computer playing : " + musicPlayer.playMusicList(genre) + " with music player";
    }

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}
