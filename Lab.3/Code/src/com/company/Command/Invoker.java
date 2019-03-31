package com.company.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<IOrder> orderList = new ArrayList<IOrder>();

    public void TakeOrder(IOrder order){
        orderList.add(order);
    }

    public void PlaceOrders(){
        for(IOrder order : orderList){
            order.Execute();
        }
        orderList.clear();
    }
}