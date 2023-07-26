package com.ronewa.udemy.controller;

import com.ronewa.udemy.domain.Contact;
import com.ronewa.udemy.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contacts")
public class ContactController {

  private ContactService contactService;

  @Autowired
  public ContactController(ContactService contactService) {
    this.contactService = contactService;
  }

  @GetMapping
  public List<Contact> getAllContact() {
    return contactService.getAllContact();
  }

  @GetMapping("/{id}")
  public Contact getContacts(@PathVariable("id") Integer contactId) {
    return contactService.getContact(contactId);
  }

  @PostMapping("/create")
  public Contact createContact(@RequestBody Contact contact) {
    System.out.print(contact.getName());
    System.out.print(contact.getSurname());
    contactService.createContact(contact);
    return contact;
  }

  @PutMapping("/{id}")
  public Contact updateContact(@PathVariable("id") long contactId,
                               @RequestBody Contact contact) {
    contactService.updateContact(contactId, contact);
    return contact;
  }

  @DeleteMapping("/delete/{id}")
  public String deleteContact(@PathVariable("id") long contactId) {
    contactService.deleteContact(contactId);
    return "contactId is deleted";
  }
}
