package com.ingeacev.reto3.repository;

import com.ingeacev.reto3.model.CarModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Integer> {

    /* FORMA EXPLICITA DE ENVIAR UN QUERY DE FORMA NATIVA
    @Query(value = "SELECT * FROM CAR WHERE BRAND like ?", nativeQuery = true)
    List<CarModel> getCarsByBrand(String brand);        */

    Page<CarModel> findByBrand(String Brand, Pageable pageable);

    List<CarModel> findByBrandAndYear(String brand, int year);

    List<CarModel> findByBrandOrderByYearAsc(String brand);

    List<CarModel> findByBrandOrderByYearDesc(String brand);

    List<CarModel> findByBrandContains(String brand);

    List<CarModel> findByBrandStartsWith(String brand);
    List<CarModel> findByBrandEndsWith(String brand);
}
