package com.ingeacev.reto3.repository;

import com.ingeacev.reto3.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel,Integer> {
    //JPA es un ORM, una libreria que ayuda a conectarse a las bases de datos mucho mas facil
}
