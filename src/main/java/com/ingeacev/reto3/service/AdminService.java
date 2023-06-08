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

    public List<AdminModel> get() {
        return adminRepository.findAll();
    }

    public String create(AdminModel admin) {
        adminRepository.save(admin);
        System.out.println("ADMINISTRADOR CREADO");
        return "ADMINISTRADOR CREADO";
    }

    public void deleteAdminById(int id) {
        adminRepository.deleteById(id);
        System.out.println("ADMIN ELIMINADO");
    }
}
