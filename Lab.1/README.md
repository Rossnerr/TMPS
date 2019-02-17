# Laboratory Work Nr. 1

### Objectives
 - Study the design creation patterns;
 - Implement them in a program;

### Task
Create a program which implements 5 Creational Design Patterns.

### Theory
In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects
in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design.
Creational design patterns solve this problem by somehow controlling this object creation.

Below are presented all the creational patterns:
 - Abstract Factory - Creates an instance of several families of classes;
 - Builder - Separates object construction from its representation;
 - Factory Method - Creates an instance of several derived classes;
 - Object Pool - Avoid expensive acquisition and release of resources by recycling objects that are no longer in use;
 - Prototype - A fully initialized instance to be copied or cloned;
 - Singleton - A class of which only a single instance can exist.
 
 ### Laboratory work implementation
In the created program I have implemented 5 creational design patterns. They are: Singleton, Builder, Prototype, Factory Method and Abstract Factory.

First of all I have created a class called Singleton which obviously is using the Singleton Pattern in order to create an instance of the
AbstractFactory. It will be created only once per lifetime.

Next thing I have implemented is the AbstractFactory class. Its aim is to create different types of factories, in my case CarFactory and
DriverFactory. Both of them are used in order to create objects of Car and Driver types respectively.

I have implemented the Builder Pattern while creating the objects of the Car type. Using this approach I can construct a Car object which is a complex one step by step. In order to make it possibile I have created a CarBuilder class which has several methods that adds different parts to a Car and a method which creates the resulted Car.

The Prototype Pattern was used in the process of creating the Driver objects. This approach allows me to create an object by cloning an existing one. This pattern is used when creation of object directly is costly. Its implementation requires a prototype interface IDriver and it is implemented by the Driver class which has a method Clone() that returns a copy of the current object.

