```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Exception caught within closure: ${e.message}"
    // Perform additional error handling, logging etc.
  } catch (Exception e) {
    println "An unexpected error occurred: ${e.message}"
  }
  println "After closure execution"
}

methodWithClosure { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong!")
}
```