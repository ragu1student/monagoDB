package com.mongodb.app.mongodb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mongodb.app.mongodb.Database.AdminRepository;
import com.mongodb.app.mongodb.Database.DataBase;


@Controller
public class AppController {
    

    @Autowired
    AdminRepository adminRepository;

    // @GetMapping("/")
    // public String home() {

    //     return "hello";
    // }

    @GetMapping("/")
public String home() {
    adminRepository.save(new DataBase("19EEL119", "Ragu"));
    return "hello";
}

}
