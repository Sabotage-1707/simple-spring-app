package first.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context =  new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );



        Computer computer = context.getBean("computer",Computer.class);

        System.out.println( computer.toString());


       /* MusicPlayer player = context.getBean("playerBean",MusicPlayer.class);
        MusicPlayer player2 = context.getBean("playerBean",MusicPlayer.class);

        System.out.println(player == player2);

        System.out.println(player);
        System.out.println(player2);

        player.playMusic();
        player2.playMusic();

        player.setVolume(23);

        player.playMusic();
        player2.playMusic();*/

        context.close();
    }
}
