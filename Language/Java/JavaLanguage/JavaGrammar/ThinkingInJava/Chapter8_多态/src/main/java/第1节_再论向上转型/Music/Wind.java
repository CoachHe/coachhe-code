package 第1节_再论向上转型.Music;


import 第1节_再论向上转型.Note;

public class Wind extends Instrument {
    // Redefine interface method:
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}