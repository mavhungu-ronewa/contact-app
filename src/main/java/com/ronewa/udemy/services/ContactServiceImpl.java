package com.ronewa.udemy.services;

import com.ronewa.udemy.domain.Contact;
import com.ronewa.udemy.exception.ResourceNotFoundException;
import com.ronewa.udemy.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
  private final ContactRepository contactRepository;

  @Autowired
  public ContactServiceImpl(ContactRepository contactRepository) {
    this.contactRepository = contactRepository;
  }

  @Override
  public String createContact(Contact contact) {
    contactRepository.save(contact);
    return "Successfully saved data";
  }

  @Override
  public String updateContact(long contactId, Contact updateContact) {
    Contact contacts = contactRepository.findById(contactId).orElseThrow(
            () -> new ResourceNotFoundException("Contact does not exists with a given id:"+ contactId)
    );

    contacts.setName(updateContact.getName());
    contacts.setSurname(updateContact.getSurname());
    contacts.setContactNumber(updateContact.getContactNumber());
    contactRepository.save(contacts);
    return "Successfully updated data";
  }

  @Override
  public String deleteContact(long contactId) {
    contactRepository.deleteById(contactId);
    return "Successfully deleted data";
  }

  @Override
  public Contact getContact(long contactId) {
    return contactRepository.findById(contactId).get();
  }

  @Override
  public List<Contact> getAllContact() {
    return contactRepository.findAll();
  }
}
