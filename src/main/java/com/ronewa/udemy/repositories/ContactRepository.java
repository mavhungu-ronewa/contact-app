package com.ronewa.udemy.repositories;

import com.ronewa.udemy.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
