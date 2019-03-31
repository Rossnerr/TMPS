package com.company.Observer;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void Update(){
        System.out.println("Hex String: " + Integer.toHexString(subject.GetState()).toUpperCase());
    }
}