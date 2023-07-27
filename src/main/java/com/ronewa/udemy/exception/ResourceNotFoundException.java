package com.ronewa.udemy.exception;

/**
 * Created by Mavhungu Ronewa 07-2023
 */

public class ResourceNotFoundException extends RuntimeException {
  public ResourceNotFoundException (String message){
    super(message);
  }
}
