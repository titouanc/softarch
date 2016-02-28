# Exercise 1

## The Factory pattern

* Demo1 c'est clairement ça


## The Facade pattern

* Demo 10


## The Observer pattern

* Demo 11 (but weather should explicitely implement the Obervable interface)


## The Adapter pattern

* Demo 13 (?) Dusty adapts cropDuster to RacerPlane


## The Visitor pattern

* Demo 2 But actually doesn't make sense because different visit functions


## Others

* Demo 3 is a Bridge Pattern
* Demo 4 is a Builder
* Demo 7 is a Composite


# Exercise 2

Strategy patterns (Behavioural)



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
object, breaking the encapsulation principle.

### Fish.java

* communicatonal cohesion because everything is grouped in the Fish class only
  1 class to group data relative to a fish.
* Subclass (interface coupling)

###

* 

