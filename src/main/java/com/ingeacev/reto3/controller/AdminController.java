package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.model.AdminModel;
import com.ingeacev.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/all")
    public List<AdminModel> getAdmin(){
        return adminService.getAdmin();
    }

    @PostMapping("/save")
    public String saveAdmin(@RequestBody AdminModel adminModel){
        return adminService.createAdmin(adminModel);
    }
}
