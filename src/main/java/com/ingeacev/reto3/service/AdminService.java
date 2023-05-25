package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.AdminModel;
import com.ingeacev.reto3.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public List<AdminModel> getAdmin() {
        return adminRepository.findAll();
    }

    public String createAdmin(AdminModel adminModel) {
        adminRepository.save(adminModel);
        System.out.println("ADMINISTRADOR CREADO");
        return "ADMINISTRADOR CREADO";
    }

}
