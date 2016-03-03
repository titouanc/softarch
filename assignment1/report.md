# Exercise 1

## The Factory Method pattern

We found an instance of the Factory Method pattern in the package `Demo1`.
In the demo, the `Corei(5|7)Factory` creates an object that implements the
`Processor` interface. This particular construct allows to dynamically change
the type of processor to be created. This is therefore a creational pattern.


![Demo1 UML](demo1.eps)

## The Facade pattern

* Demo 10


## The Observer pattern

We observed the observer pattern in the package `Demo11`. However, the package
contains the `Observer` and `Observable` interfaces that are not used. The
pattern is directly implemented in the `Weather` class, which is observable, 
and therefore keep tracks of all the `WeatherObserver` to be notified when
the weather changes. Finally, the `Country` class provide a concrete
of the `WeatherObserver` interface, and is notified everytime the weather it
observes changes.

![Demo11 UML](demo11.eps).


## The Adapter pattern

* Demo 13 (?) Dusty adapts cropDuster to RacerPlane


## The Visitor pattern

* Demo 2 But actually doesn't make sense because different visit functions


## Others

* Demo 3 is a Bridge Pattern
* Demo 4 is a Builder
* Demo 7 is a Composite


# Exercise 2

The `Demo16` contains a Strategy pattern, which is a behavorial pattern.

`PitchType` is an abstract Strategy. `CutterFastBall`, `FoshChangeup` and `SliderBreakingBall` are concrete strategies. `Pitcher` is the context that can change strategies but has no idea of the current underlying strategy thanks to polymorphism.

![Demo16 UML](demo16.eps).

The idea here is that `Pitcher` has several ways to pitch (i.e. Strategies) and must choose one depending on the context. He has a method that allows him to change his pitch when context change and not know the current pitch. Because only the pitch type must change when the context change, inheriting several classes of `Pitcher` would not be logical. Instead, a Strategy design pattern is used where only the pitch type is changed when the context changes.



# Exercise 3

## Which is preferable: high or low wohesion ?

A high cohesion is preferable.

* DRY
* Functional cohesion (small units, KISS)


## Which is preferable: tight or loose coupling ?

A loose coupling is preferable

* Complexity of interdependances

## 

### DemoUtils.java

* coincindental cohesion: used as container for various unrelated methods.

It also has a high coupling, because it directly access an attribute of another
object, breaking the encapsulation principle. Content coupling

### Fish.java

* communicatonal cohesion because everything is grouped in the Fish class only
  1 class to group data relative to a fish.
* Subclass (interface coupling)

### Fishbowl

* Communicational and informational cohesion: everything that's inside works on
  the same data.
* Coupling with the List and Fish classes (external coupling ?)

### SmartFish

* Coupling with fish (subclass coupling)

### Main

* Procedural cohesion (order in which we have to call the methods)
* Mais respecte l'encapsulation (pas de content coupling)
  external coupling, common coupling
