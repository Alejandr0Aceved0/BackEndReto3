package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.model.AdminModel;
import com.ingeacev.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {
//Los controladores son quienes se conectan a los servicios para hacer las peticiones
    @Autowired
    AdminService adminService;

    @GetMapping("/all")
    public List<AdminModel> getAdmin() {
        return adminService.get();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody AdminModel admin) {
        adminService.create(admin);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable int id){
        adminService.deleteAdminById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody AdminModel admin){
        adminService.update(admin);
    }
}
