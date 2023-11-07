package at.obe.housecontrol.controller;

import at.obe.housecontrol.observer.Observer;

public class AwningController implements Observer {

    @Override
    public void inform(int temp) {
        System.out.println("AwningController: " + temp);
    }
}
