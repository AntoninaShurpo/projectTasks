package com.adapter;

import com.adapter.Options.*;

public class HomeTheaterTest {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights screen = new TheaterLights();
        Screen lights = new Screen();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

        homeTheater.watchMovie("Test movie");
        homeTheater.endMovie();
    }
}
