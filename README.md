# Java-SimpleStopWatch
Really Simple Class to measure the time a process takes

## How to use
You have nothing to da as create an object of class StopWatch to use it. After that you can use the methods 

  `start( String name )` and 
  
  `stop()`
  
If you want to use a logger, ypu have provide an instance of Logger to StopWatch by using the method

  `setLogger( Logger logger )`

## Requirements
The class will going to include *slf4j* logger. Make sure it is available in your classpath.

## Example
```java
StopWatch watch = new StopWatch( "Timer" );
watch.start( "sending post request" );
postRequest( entity );
watch.stop();
```
Which prints out the following to STDOUT, because no logger is supplied:
```
[Timer][sending post request] has took 87 ms
```
