package com.adapter;

import com.adapter.Options.Amplifier;
import com.adapter.Options.CdPlayer;
import com.adapter.Options.DvdPlayer;
import com.adapter.Options.PopcornPopper;
import com.adapter.Options.Projector;
import com.adapter.Options.Screen;
import com.adapter.Options.TheaterLights;
import com.adapter.Options.Tuner;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

/*
   public void on() {
    }

    public void pop() {
    }

    public void dim() {
    }

    public void down() {
    }

    public void wideScreenMode() {
    }

    public void setDvd() {
    }

    public void setSurroundSound() {
    }

    public void setVolume() {
    }

    public void play() {
    }*/


    public void watchMovie(String movie) {
        System.out.println("Get ready to watch movie ...");
        popper.on();
        popper.pop();
        lights.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);

    }

    public void endMovie() {
        System.out.println("Shutting movie theater down ...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();


    }
}
