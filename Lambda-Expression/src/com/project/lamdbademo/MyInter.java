package com.project.lamdbademo;

//lambda is a ananymous function--->no name,no modifier,no return type
/* to enable functional programming in java
 * we can reduce more no of lines of codes,
 * to write more readable,maintanable and concize code
 * to call functional interface,,,,,,,,,
 * Functional interface--->an interface contains only one abstract method,we call
 * it as funactional interface,,,,,,,,,,,,,
 */
@FunctionalInterface
public interface MyInter {
abstract void sayHello();
	/*here,to use abtract(),,
	 * We can create one class and implement this interface for that class
	 * by using ananymous class
	 * using lambda expresions,,,,,,,,,,,,
	 * 
	 * 
	 */

}
