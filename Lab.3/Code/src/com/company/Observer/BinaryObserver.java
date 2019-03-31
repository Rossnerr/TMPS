package com.company.Observer;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void Update(){
        System.out.println("Binary string: " + Integer.toBinaryString(subject.GetState()));
    }
}
