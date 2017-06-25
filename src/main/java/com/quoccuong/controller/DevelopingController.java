package com.quoccuong.controller;

import com.quoccuong.models.Contact;
import com.quoccuong.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by quoccuong on 25/06/2017.
 */


@RestController
@RequestMapping("/developer")
public class DevelopingController {

    @Controller
    public class ContactController {

        @Autowired
        private ContactService contactService;

        @GetMapping("/developer/contact")
        public Iterable<Contact> developerContact(Model model) {
            return contactService.findAll();
        }


    }
}
