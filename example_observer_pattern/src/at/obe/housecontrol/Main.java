package at.obe.housecontrol;

import at.obe.housecontrol.controller.HeatController;
import at.obe.housecontrol.controller.AwningController;

public class Main {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        HeatController heatController = new HeatController();
        AwningController awningController = new AwningController();
        thermometer.addObserver(heatController);
        thermometer.addObserver(awningController);

        for(int i = 0; i < 10; i++) {
            thermometer.setTemperature();
        }
    }
}