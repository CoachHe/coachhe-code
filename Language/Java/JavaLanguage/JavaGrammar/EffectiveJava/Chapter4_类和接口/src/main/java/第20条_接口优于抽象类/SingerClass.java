package 第20条_接口优于抽象类;

import java.applet.AudioClip;

public class SingerClass implements Singer {
    @Override
    public AudioClip sing(Song song) {
        return null;
    }
}
