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

import csc232.Customer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
* A simple WaitingLine class that operates like a queue of customers.
* Comprises of methods to add customers, remove customers, to peek at 
* customers, and to check if the queue of customers is empty or not.
*
* @author annabaig_2023@depauw.edu
*/

public class WaitingLine {
private List<Customer> contents;



/**
* Construct an empty stack-like queue.
*/
public WaitingLine() {
    this.contents = new ArrayList<>();
  }

/**
* Add a customer to the queue, and sort the customers in the queue according
* to the customers' arrival times.
*
* @param customer the Customer to add
* @postcondition the queue will be non-empty, and the customer will be added according to
* arrival time, where customer with smallest arrival time will be at the head of the line.
*/
public void push(Customer customer) {
  contents.add(customer);
  Collections.sort(contents);
  }

  /**
  * Remove a customer from the queue.
  *
  * @return the removed customer.
  * @precondition this queue is not empty.
  * @postcondition the head of the queue is removed.
  */
public Customer pop() {
    return contents.remove(0);
  }


/**
  * Peek at the customer at the head of the queue.
  *
  * @return the customer at the head of the queue.
  * @precondition this queue is not empty.
  * @postcondition the queue is unchanged.
  */
public Customer peek() {
    return contents.get(0);
  }


/**
   * Check whether the queue is empty.
   *
   * @return true if the queue is empty.
   * @postcondition the queue is unchanged.
   */
  public boolean isEmpty() {
    return contents.size() == 0;
  }








}
  