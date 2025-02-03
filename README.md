# Unexpected Behavior with Function References and Mutable State in Scala

This repository demonstrates a subtle bug in Scala related to function references and mutable state within a class. When a method that modifies the internal state of an object is accessed via a function reference, the expected behavior might not occur.

The `Bug.scala` file contains the code exhibiting the unexpected behavior. The `BugSolution.scala` file demonstrates how to correctly capture the object's state when creating a function reference.

## Problem Description

The problem stems from how Scala handles closures and mutable variables within classes.  When a function reference is created, it captures the method, but not necessarily the object's instance.  This can lead to unexpected results when the method modifies the object's state, as demonstrated in `Bug.scala`.

## Solution

The solution, as shown in `BugSolution.scala`, involves using a different approach for capturing the object's state, in order to preserve the context and have the correct behavior when calling the function reference.

## How to Run

1. Ensure you have Scala installed.
2. Clone this repository.
3. Compile and run each Scala file using the Scala compiler (scalac) and interpreter (scala).