package com.company.State;

public class StopState implements IState {
    @Override
    public void DoAction(ContextState contextState){
        System.out.println("Calculator is in stop state.");
        contextState.SetState(this);
    }
}
