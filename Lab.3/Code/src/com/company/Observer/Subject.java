package com.company.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int GetState(){
        return state;
    }

    public void SetState(int state){
        this.state = state;
        NotifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void NotifyAllObservers(){
        for(Observer observer : observers){
            observer.Update();
        }
    }
}
