package com.springinaction.springidol;

/**
 * Created by Vitek on 25.05.2015.
 */

public class Instrumentalist implements Performer
{
    public Instrumentalist()
    {
    }

    public void perform() throws PerformanceException
    {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public void setSong(String song)
    { // Внедрение мелодии
        this.song = song;
    }

    public String getSong()
    {
        return song;
    }

    public String screamSong()
    {
        return song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument)
    { // Внедрение
        this.instrument = instrument; // инструмента
    }
}