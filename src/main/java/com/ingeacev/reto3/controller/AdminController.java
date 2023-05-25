package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.dbo.AdminDbo;
import com.ingeacev.reto3.model.AdminModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

//    @Autowired
//    AdminService adminService;

    @GetMapping("/all")
    public List<AdminModel> getAdmin(){
//        return adminService.getAdmin();
        return null;
    }

    @PostMapping("/save")
    public String saveAdmin(@RequestBody AdminDbo adminDbo){
//        return adminService.createAdmin(adminDbo);
        return null;
    }
}
