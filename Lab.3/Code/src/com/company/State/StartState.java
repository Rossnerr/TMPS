package com.company.State;

public class StartState implements IState {
    @Override
    public void DoAction(ContextState contextState){
        System.out.println("Calculator is in start state.");
        contextState.SetState(this);
    }
}