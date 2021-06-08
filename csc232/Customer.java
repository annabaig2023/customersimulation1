////////////////////////////////////////////////////////////////////////////////
// File:            Customer.java
// Course:          CSC 232 A, Spring 2021
// Authors:         Anna Baig
//
// Acknowledgments: None
//
// Online sources:  None
////////////////////////////////////////////////////////////////////////////////

package csc232;

/**
* A simple customer class that describes a customer in a simulation. The 
* class also implements the 
* comparable class to compare customers' arrival times.
*
* @author annabaig_2023@depauw.edu
*/

public class Customer implements Comparable<Customer>{

private String name;
private int arrivalTime;

/**
* Constructs a customer with the given name and arrival * time function which is empty.
*
*@param name
*@param arrivalTime
*/
public Customer(String name, int arrivalTime){
  this.name = name;
  this.arrivalTime = arrivalTime;
}

/**
* @return the name associated with the Customer object.
*/
public String getName(){
  return name;
}

/**
* @return the arrival time associated with the Customer object.
*/
public int getArrivalTime(){
  return arrivalTime;
}

/**
* Compares the arrival time of "this" object to the "other" object, and returns a value * of -1 if arrival time of "this" is less than the arrival time of "other". If arrival * time of "this" if greater than the arrival time of "other", returns a value of 1. 
* Otherwise returns 0.
*
* @param other
* @return -1 if arrival time of other is greater, -1 if value is less, and 0 otherwise.
*/
public int compareTo (Customer other){
  if (arrivalTime < other.arrivalTime)
  return -1;

  if (arrivalTime > other.arrivalTime)
  return 1;

  else
  return 0;

}


/**
* @return the customer name and arrival time in string format.
*/
public String toString(){
  return "Customer { name: " + getName() + ", arrival time: " + getArrivalTime() + "}" ;
}


}