package com.ronewa.udemy.exception;

/**
 * Created by Mavhungu Ronewa 07-2023
 */
public class ContactNotFoundException extends RuntimeException {
  public ContactNotFoundException (String message) {
    super(message);
  }
  public ContactNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}

