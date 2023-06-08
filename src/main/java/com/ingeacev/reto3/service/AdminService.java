package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.AdminModel;
import com.ingeacev.reto3.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void update(AdminModel adminPut) {

        Optional<AdminModel> carDb = adminRepository.findById(adminPut.getIdAdmin());

        AdminModel car = carDb.get();

        if (carDb.isPresent()){

            if (adminPut.getAge() != 0){
                car.setAge(adminPut.getAge());
            }

            if (adminPut.getEmail() != null){
                car.setEmail(adminPut.getEmail());
            }

            if (adminPut.getPassword() != null){
                car.setPassword(adminPut.getPassword());
            }
        }
        adminRepository.save(car);
    }
}
