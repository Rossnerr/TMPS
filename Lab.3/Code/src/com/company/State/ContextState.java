package com.company.State;

public class ContextState {
    private IState state;

    public ContextState(){
        state = null;
    }

    public void SetState(IState state){
        this.state = state;
    }

    public IState GetState(){
        return state;
    }
}
