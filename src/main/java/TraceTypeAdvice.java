/* once i ran into this problem . I had a trace point on an object that can be arbitrarily large
  and this blew up spunk yurning a large json to a string. what we want to be able to do here is 
  spardefine how an object can be logged so we can customize it
  at runtime.. ie for this flow I only want to log properly x but this flow only y */

abstract class TracingMixin extends ClassToLog (

  @TraceonProperty
  int fieldY

  @traceoffProperty
  int fieldZ


)
