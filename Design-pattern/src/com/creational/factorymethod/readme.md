https://www.journaldev.com/1392/factory-design-pattern-in-java

Super class in factory design pattern can be an interface, abstract class or a normal java class.

Implement this abstract class with two sub class exmaple 
PC, Server

Create a factory class 
We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
Notice that based on the input parameter, different subclass is created and returned. getComputer is the factory method.

Advantages
=================
Factory design pattern provides approach to code for interface rather than implementation.
Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
Factory pattern provides abstraction between implementation and client classes through inheritance.


Reference
https://dzone.com/articles/design-patterns-factory