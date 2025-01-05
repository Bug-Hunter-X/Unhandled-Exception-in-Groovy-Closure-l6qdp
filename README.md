# Unhandled Exception in Groovy Closure

This example demonstrates a common issue in Groovy where exceptions thrown within closures are not properly handled by the calling method.  The solution showcases best practices for handling such exceptions.

## Bug

The `methodWithClosure` function executes a provided closure. If the closure throws an exception (as in this case), the exception is not caught and the program terminates abruptly, without any graceful handling. 

## Solution

The solution demonstrates how to use a `try-catch` block within the `methodWithClosure` to handle any exceptions thrown by the closure.
