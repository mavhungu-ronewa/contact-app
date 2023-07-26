package com.ronewa.udemy.services;

import com.ronewa.udemy.domain.Contact;

import java.util.List;

public interface ContactService {
  public String createContact(Contact contact);
  public String updateContact(long contactId, Contact contact);
  public String deleteContact(long contactId);
  public Contact getContact(long contactId);
  public List<Contact> getAllContact();
}
