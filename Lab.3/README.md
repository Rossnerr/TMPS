# Laboratory Work Nr. 3

### Objectives
 - Study the behavioral design patterns;
 - Implement them in a program;

### Task
Create a program which implements 5 Behavioral Design Patterns.

### Theory
In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and 
realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.

Below are presented some of the behavioral patterns:
 - Chain of responsibility - A way of passing a request between a chain of objects;
 - Command - Encapsulate a command request as an object;
 - Interpreter - A way to include language elements in a program;
 - Iterator - Sequentially access the elements of a collection;
 - Mediator - Defines simplified communication between classes;
 - Memento - Capture and restore an object's internal state;
 - Null Object - Designed to act as a default value of an object;
 - Observer - A way of notifying change to a number of classes;
 - State - Alter an object's behavior when its state changes;
 - Strategy - Encapsulates an algorithm inside a class;
 - Template - Defer the exact steps of an algorithm to a subclass;
 - Visitor - Defines a new operation to a class without change;
 
### Implementation
The created program represents a simple version of a calculator. In the application I have implemented 5 behavioral design patterns. They are: Chain of responsibility, Command, Observer, State and Strategy.

First pattern I have used was State one. In order to implement it I have created the state classes and the context class which behavior can change depending on the given state. My program has 2 states. They are represented by _StartState_ and _StopState_ classes. Both of them implement the _IState_ interface. When launching the application a _ContextState_ object is created and its _state_ field is set to null. Right after creating the context, the _StartState_ is created and set as the current state of the context. Before exiting the application the context's state is set to _StopState_. That's how the context class behavior is 

Strategy pattern helped me change the behavior of _ContextStrategy_ class depending on the strategy object. In my case _OperationAdd_, _OperationMultiply_ and _OperationSubstract_ serve as strategy objects. That's why they are implementing the _IStrategy_ interface. In order to perform an addition of 2 numbers an object of _OperationAdd_ type should be passed to the context. If next desired operation is substraction the only thing that should be done is passing an object of _OperationSubstract_ type to the already existing context. In such a way the behavior of _ContextStrategy_ class is changed based on the strategy object.

While working with the mathematical operations several types of error can occur. The errors analyzed in my program are: syntax and arithmetic. They are represented by _SyntaxError_ and _ArithmeticError_ classes correspondingly. Both of them extend the _ErrorLoger_ abstract class. Each type of error has its level. The level is used in order to identify which logger should print the error. If error's level corresponds to the logger's level the print will happen if not the error will be passed to the next logger. In other words the sender of the error and receiver are not directly tied and each receiver contains reference to another receiver. An error will pass through certain loggers before it gets the right one. The above functionality was implmented using the Chain of Responsibility pattern.

In order to implement the Observer pattern I have created two types of actor classes: subject and observer. Genreally speaking when the subject object is modified the observers attached to that subject will be automaitcally announced and certain things will happen. In my case _Subject_ class has 2 fields: _state_ and _observers_. When the first field is modfied all the objects of _Observer_ type which are contained in the _observers_ field are announced that a modification took place. So, after creating an object of _Subject_ type and setting its observers I modify the _state_ by passing into it the result of a calculaton. Now all the _Observer_ objects from _observers_ field will be notified about the modification and as a result they will print the given value in hexadecimal and binary formats.

The last pattern implemented by me in this laboratory work was the Command pattern. Here we have three types of objects: request, command and invoker. A request is wrapped under an object as command and passed to invoker. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object in order to execute the command. Instances of _History_ class are the request objects in my example. These type of objects are wrapped under objects which classes implement the _IOrder_ interface. That's why the last mentioned objects can be viewed as command objects. The invoker object is of _Invoker_ type. It can receive the objects of _SaveHistory_ or _DeleteHistory_ and decides what type of object is going to handle and execute the request.

### Conclusion
In this laboratory work I have learnt the behavioral design patterns. There are several types of them. The main purpose of such kind of patterns is to change the behavior of a class at run-time. Creating an application which implements several of them helped me understand better why there is a need in using them.
