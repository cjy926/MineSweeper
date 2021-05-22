import Music.Music;
import minesweeper.MainFrame;
import minesweeper.Read;
import minesweeper.SetFrame;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SetFrame setFrame = new SetFrame();
            setFrame.start();
        });
        Music music=new Music();
        music.run();
    }
        private static void playMusic () {//背景音乐播放
            try {
                URL cb;
                File f = new File("BGM.wav"); // 引号里面的是音乐文件所在的路径
                cb = f.toURL();
                AudioClip aau;
                aau = Applet.newAudioClip(cb);
                aau.play();
                aau.loop();//循环播放
                System.out.println("可以播放");

// 循环播放 aau.play()

//单曲 aau.stop()停止播放

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        }
//        MainFrame mainFrame = new MainFrame();
//        mainFrame.diy_regret(2);
        /*System.out.println(Read.read("in.txt"));
        String[] s = Read.read("in.txt").split("~");
        System.out.println(Read.read("in.txt"));
        System.out.println(s.length);
        for(int i = 0; i < s.length; i++)
            System.out.println(s[i]);*/

}
