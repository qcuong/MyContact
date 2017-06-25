package com.quoccuong.services;

import com.quoccuong.models.Contact;

import java.util.List;
import java.util.Optional;

/**
 * Created by quoccuong on 16/06/2017.
 */


public interface ContactService {
    Iterable<Contact> findAll();

    List<Contact> search(String q);

    Optional<Contact> findOne(int id);

    void save(Contact contact);

    void deleteById(int id);

}
