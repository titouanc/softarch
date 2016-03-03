# Exercise 1

## The Factory Method pattern

We found an instance of the Factory Method pattern in the package `Demo1`.
In the demo, the `Corei(5|7)Factory` creates an object that implements the
`Processor` interface. This particular construct allows to dynamically change
the type of processor to be created. This is therefore a creational pattern.

![Demo1 UML](demo1.eps)


## The Observer pattern

We observed the observer pattern in the package `Demo11`. However, the package
contains the `Observer` and `Observable` interfaces that are not used. The
pattern is directly implemented in the `Weather` class, which is observable, 
and therefore keep tracks of all the `WeatherObserver` to be notified when
the weather changes. Finally, the `Country` class provide a concrete
of the `WeatherObserver` interface, and is notified everytime the weather it
observes changes. This is a behavioral pattern, because it define how the
program flow is spread across objects.

![Demo11 UML](demo11.eps)


## The Adapter pattern

The Adapter pattern could be seen in the `Demo13` package. In this case, we have
a `RacerPlace` interface, which declares 2 methods `fly` and `flipAndMore`.
We also have a `CropDusterPlane` class which defines 2 methods `fly` and `fumigate`.
In order to use a `CropDusterPlane` object in a plane race, we need to adapt it
with the `Dusty` class, which encapsulate the right method dispatching on the
CropDusterPlane. This is a structural pattern, because it defines how the
responsibilities are dispatched between the different classes.

![Demo13 UML](demo13.eps)


# Exercise 2

The `Demo16` contains a Strategy pattern, which is a behavorial pattern.

`PitchType` is an abstract Strategy. `CutterFastBall`, `FoshChangeup` and `SliderBreakingBall` are concrete strategies. `Pitcher` is the context that can change strategies but has no idea of the current underlying strategy thanks to polymorphism.

![Demo16 UML](demo16.eps).

The idea here is that `Pitcher` has several ways to pitch (i.e. Strategies) and must choose one depending on the context. It has a method that allows it to change its pitch when context change and not know the current pitch. Because only the pitch type must change when the context change, inheriting several classes of `Pitcher` would not be logical. Instead, a Strategy design pattern is used where only the pitch type is changed when the context changes.



# Exercise 3

## Which is preferable: high or low cohesion ?

A high cohesion is preferable because it allows to have logically coherent features in the same module and reuse them. It is also easier to maintain and debug because each part of the program does a specific thing and is responsible of specific features.


## Which is preferable: tight or loose coupling ?

A loose coupling is preferable because small independant parts of programs are more reliable and easier testable. It is also easier to refactor code if the different parts do not depend on each other or rely on a fixed API.

## Analyse the source code of exercise3.demo17

### DemoUtils.java

* Coincidental cohesion because this class is used as a container for various unrelated methods.

* Content coupling (high) because it directly accesses an attribute of another
class (`FishBowl`), breaking the encapsulation principle.

### Fish.java

* Communicational cohesion because this module group every data related to a `Fish`.
* Subclass (interface) coupling because the only dependency to another class is through the implementation of the `Serializable` interface

### Fishbowl

* Communicational and informational cohesion because the module groups data and methods related to a `List<Fish>`
* Coupling with the List and Fish classes (external coupling ?)??????????????????????????????????????? je dirais message coupling en relisant https://en.wikipedia.org/wiki/Coupling_%28computer_programming%29 mais pas sur du tout

### SmartFish

* Communicational cohesion because this module group every data related to a `SmartFish`.
* Subclass coupling with `Fish`

### Main

* Procedural cohesion because methods are called in the order they need to be.
* Mais respecte l'encapsulation (pas de content coupling)
  external coupling, common coupling??????????????????????????,
