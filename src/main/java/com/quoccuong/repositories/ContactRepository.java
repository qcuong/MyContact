package com.quoccuong.repositories;

import com.quoccuong.models.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by quoccuong on 16/06/2017.
 */

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer>{
    List<Contact> findByNameContaining(String q);
}
