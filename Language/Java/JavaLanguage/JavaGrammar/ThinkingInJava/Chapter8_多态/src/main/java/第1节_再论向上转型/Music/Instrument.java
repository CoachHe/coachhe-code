package 第1节_再论向上转型.Music;

import 第1节_再论向上转型.Note;

class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }

    public void print(String s) {
        System.out.println(s);
    }
}