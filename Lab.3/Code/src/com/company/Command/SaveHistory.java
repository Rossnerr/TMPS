package com.company.Command;

public class SaveHistory implements IOrder {
    private History history;

    public SaveHistory(History history){
        this.history = history;
    }

    @Override
    public void Execute(){
        history.Save();
    }
}
