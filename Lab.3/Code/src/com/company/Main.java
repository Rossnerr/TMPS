package com.company;

import com.company.ChainOfResponsibility.ArithmeticError;
import com.company.ChainOfResponsibility.ErrorLoger;
import com.company.ChainOfResponsibility.SyntaxError;
import com.company.Command.Invoker;
import com.company.Command.History;
import com.company.Command.DeleteHistory;
import com.company.Command.SaveHistory;
import com.company.Observer.BinaryObserver;
import com.company.Observer.HexaObserver;
import com.company.Observer.Subject;
import com.company.State.ContextState;
import com.company.State.StartState;
import com.company.State.StopState;
import com.company.Strategy.ContextStrategy;
import com.company.Strategy.OperationAdd;
import com.company.Strategy.OperationMultiply;
import com.company.Strategy.OperationSubstract;

public class Main {
    private static ErrorLoger GetChainOfLoggers(){
        ErrorLoger arithmeticLogger = new ArithmeticError(ErrorLoger.ARITHMETIC);
        ErrorLoger syntaxLogger = new SyntaxError(ErrorLoger.SYNTAX);

        arithmeticLogger.SetNextLogger(syntaxLogger);

        return arithmeticLogger;
    }

    public static void main(String[] args) {
        ContextState contextState = new ContextState();

        ErrorLoger loggerChain = GetChainOfLoggers();

        Subject subject = new Subject();
        new HexaObserver(subject);
        new BinaryObserver(subject);

        History history = new History();

        SaveHistory saveHistory = new SaveHistory(history);
        DeleteHistory deleteHistory = new DeleteHistory(history);

        Invoker invoker = new Invoker();

        StartState startState = new StartState();
        startState.DoAction(contextState);

        ContextStrategy contextStrategy = new ContextStrategy(new OperationAdd());
        int result = contextStrategy.ExecuteStrategy(10, 5);
        System.out.println("10 + 5 = " + result);

        subject.SetState(result);

        invoker.TakeOrder(saveHistory);
        invoker.TakeOrder(deleteHistory);
        invoker.PlaceOrders();

        contextStrategy = new ContextStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + contextStrategy.ExecuteStrategy(10, 5));

        if(result != 50){
            loggerChain.LogMessage(ErrorLoger.ARITHMETIC, "This is an arithmetic error.");
        }

        contextStrategy = new ContextStrategy(new OperationSubstract());
        System.out.println("10 - 5 = " + contextStrategy.ExecuteStrategy(10, 5));

        StopState stopState = new StopState();
        stopState.DoAction(contextState);
    }
}