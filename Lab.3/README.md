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

First pattern I have used was State one. In order to implement it I have created the state classes and the context class which behavior can change depending on the given state. My program has 2 states. They are represented by _StartState_ and _StopState_ classes. Both of them implement the _IState_ interface. When launching the application a _ContextState_ object is created and its _state_ field is set to null. Right after creating the context, the _StartState_ is created and set as the current state of the context. Before exiting the application the context's state is set to _StopState_.

Strategy pattern helped me change the behavior of _ContextStrategy_ class depending on the strategy object. In my case _OperationAdd_, _OperationMultiply_ and _OperationSubstract_ serve as strategy objects. That's why they are implementing the _IStrategy_ interface. In order to perform an addition of 2 numbers an object of _OperationAdd_ type should be passed to the context.

While working with the mathematical operations several types of error can occur. The errors analyzed in my program are: syntax and arithmetic. In order to find what type of error occured I have used the chain of responsibility pattern. Each error has a level. 
