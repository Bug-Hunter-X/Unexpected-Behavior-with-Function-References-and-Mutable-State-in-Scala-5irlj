```scala
class MyClass {
  private var internalValue: Int = 0

  def updateValue(newValue: Int): Unit = {
    internalValue = newValue
  }

  def getValue: Int = internalValue
}

object Main extends App {
  val myObject = new MyClass
  myObject.updateValue(10)
  println(myObject.getValue) //Prints 10
  //But if you run the following code the output will be 0 not 10
  val myObject2 = new MyClass
  val updateFunc = myObject2.updateValue _
  updateFunc(20)
  println(myObject2.getValue) //Prints 0
}
```