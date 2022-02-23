package 第20条_接口优于抽象类;

import java.applet.AudioClip;

public interface SingerSongWriter extends Singer, Songwriter {
    AudioClip strum();
    void actSensitive();
}
