```scala
class MyClass {
  private var internalValue: Int = 0

  def updateValue(newValue: Int): Unit = {
    internalValue = newValue
  }

  def getValue: Int = internalValue

  def createUpdateFunction(obj: MyClass): (Int) => Unit = (newValue: Int) => obj.updateValue(newValue)
}

object Main extends App {
  val myObject = new MyClass
  myObject.updateValue(10)
  println(myObject.getValue) //Prints 10
  val myObject2 = new MyClass
  val updateFunc = myObject2.createUpdateFunction(myObject2)
  updateFunc(20)
  println(myObject2.getValue) //Prints 20
}
```