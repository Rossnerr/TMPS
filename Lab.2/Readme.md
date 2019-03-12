# Laboratory Work Nr. 2

### Objectives
 - Study the structural creation patterns;
 - Implement several of them in a program;

### Task
Create a program which implements 5 Structural Design Patterns.

### Theory
In Software Engineering, Structural Design Patterns are Design Patterns that ease the design by identifying a simple way to realize
relationships between entities.

Below are presented all the creational patterns:
 - Adapter - Match interfaces of different classes;
 - Bridge - Separates an object's interface from its implementation;
 - Composite - A tree structure of simple and composite objects;
 - Decorator - Add responsibilities to objects dynamically;
 - Facade - A single class that represents an entire subsystem;
 - Flyweight - A fine-grained instance used for efficient sharing;
 - Private Class Data - Restricts accessor/mutator access;
 - Proxy - An object representing another object.
 
 ### Implementation
In the created program I have implemented 5 structural design patterns. They are: Adapter, Bridge, Composite, Decorator and Flyweight.
 
First I would like to start with Composite Pattern, I have 2 classes related to this pattern _RoundedShapeComposite_ and
_SimpleShapeComposite_. Both of them have a field which's aim is to store the shapes of the same familiy. That's why this field is set to
be a list of objects. Now when a certain shape will be created, there will be the possibility to add it to its corresponding familly by
calling _addRoundedShape_ or _addSimpleShape_ on one of those families.
 
Next I know that there is need of just two points in order to draw a line or a rectangular. Having those points and passing them to the
drawing method will work fine for lines but not for rectangles. Why? Because the drawing method suppose that the last two function
arguments represent the width and height. When you try to draw a rectangle having 2 points, usually they represent the left-upper corner
and the right-down corner. This information will be enough to compute width and height of the rectangle. I need the
_RectangleAdapter_ which serve as an 'Adapter' between the _SimpleShape_ interface and the _Rectangle_ class for overriding the _draw_
method. Now it will take the same two points as arguments but it will compute the width and height by itself.

In order to add extra functionalities to an object without altering its current structure I have use the Decorator Pattern. Initially all
my shapes have no color. Then I decided to add color to them but not to alter their structure. That's why I created an abstract decorator
class called _SimpleShapeDecorator_ which is implementing the _SimpleShape_ interface. Also I have a concrete decorator class 
_RedSimpleShapeDecorator_ which implements the earlier mentioned abstract class. Now using the _RedSimpleShapeDecorator_ I can add color
to the _SimpleShape_ objects.

And what about the color for the _RoundedShape_ objects? For this purpose I used the Bridge Pattern. It decouples implementation
class _RedCircle_ and abstract class _RoundedShape_ by provoding a bridge structure between them _DrawAPI_. The last is an interface
which makes the functionality of concrete classes independent from interface implementer classes. But before adding a color to a
_RoundedShape_ object, a corresponding object should be created.

I choose to create _RoundedShape_ objects by using the Flyweight Pattern. Usage of this pattern helped me to reduce the number of created
objects. The _CircleFactory_ class is reasponsible for reusing already existing objects. It has a _HashMap_ field where the previous
created _Circle_ objects are stored. They are stored by their _radiuses_, it means that just one object with a certain _radius_ will be
included in the HashMap. Before a _Circle_ object with a certain _radius_ will be created a check will occur, in case that a _Circle_
with the specified _radius_ already exists, it will be returned, otherwise a new object will be created.

### Conclusion
In this laboratory work I got familiarized with Structural Design Patterns. I understood what are their purposes and when to use them.
Creating an application which implies using and combining several of them make me consolidate the theoretical knowledge I gained. Also
the use of Structural Design Patterns can influence on application's performance.
