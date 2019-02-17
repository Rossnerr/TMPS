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
In the created program I have implemented 5 creational design patterns. They are: Singleton, Builder, Prototype, Factory Method and Abstract 
Factory.

First of all I have created a class called Singleton which obviously is using the Singleton Pattern in order to create an instance of 
AbstractFactory. It will be created only once per lifetime.

Next thing I have implemented is the AbstractFactory class. Its aim is to create different types of factories, in my case CarFactory and
DriverFactory. Which are used to create objects of Car and Driver types.

