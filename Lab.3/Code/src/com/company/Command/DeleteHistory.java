package com.company.Command;

public class DeleteHistory implements IOrder {
    private History history;

    public DeleteHistory(History history){
        this.history = history;
    }

    @Override
    public void Execute(){
        history.Delete();
    }
}
