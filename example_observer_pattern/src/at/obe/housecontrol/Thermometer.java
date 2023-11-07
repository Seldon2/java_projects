package at.obe.housecontrol;

import at.obe.housecontrol.observer.Observer;

import java.util.ArrayList;
import java.util.Random;

public class Thermometer {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int temperature;

    public Thermometer() {
        setTemperature();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void setTemperature(){
        Random random = new Random();
        this.temperature = random.nextInt(50);
        System.out.println("Thermometer: " + this.temperature);
        if(this.temperature >= 20){
            informAll();
        }
    }

    public void informAll(){
        for(Observer observer : observers){
            observer.inform(this.temperature);
        }
    }

}
