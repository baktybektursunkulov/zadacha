package org.srping.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        ClassicalMusic classicalMusic2=context.getBean("classicalMusic",ClassicalMusic.class);
         //     Music music=context.getBean("classicalMusic",Music.class);
//     MusicPlayer musicPlayer=new MusicPlayer(music);
//     musicPlayer.PlayMusic();
//
//        Music music2=context.getBean("rockMusic",Music.class);
//        MusicPlayer musicPlayer2=new MusicPlayer(music2);
//        musicPlayer2.PlayMusic();


//                MusicPlayer firstmusicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
//        MusicPlayer secondmusicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
//        boolean comparison=firstmusicPlayer==secondmusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstmusicPlayer);
//        System.out.println(secondmusicPlayer);
//        firstmusicPlayer.setVolume("10");
//        secondmusicPlayer.setVolume("30");
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondmusicPlayer.getVolume());
        context.close();
    }
}
