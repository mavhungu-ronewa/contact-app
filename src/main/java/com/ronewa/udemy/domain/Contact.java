package com.ronewa.udemy.domain;

import jakarta.persistence.*;

@Entity
@Table(name="contact_info")
public class Contact {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String surname;
  private String contactNumber;

  public Contact() {
  }

  public Contact(long id, String name, String surname, String contactNumber) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.contactNumber = contactNumber;
  }

  public Contact(String name, String surname, String contactNumber) {
    this.name = name;
    this.surname = surname;
    this.contactNumber = contactNumber;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }
}
