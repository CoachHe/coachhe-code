package 第20条_接口优于抽象类;

import java.applet.AudioClip;

public class SingerAndWriterClass implements SingerSongWriter {
    @Override
    public AudioClip strum() {
        return null;
    }

    @Override
    public void actSensitive() {

    }

    @Override
    public AudioClip sing(Song song) {
        return null;
    }

    @Override
    public Song compose(int chartPosition) {
        return null;
    }
}
