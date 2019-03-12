package designpattern.Behavioural_Patterns.Observer;

import java.util.ArrayList;

/**
 *
 * @author Marwa
 */
public class Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyMe(){
        for (Observer o : observers) {
            o.update();
        }
    }

}
