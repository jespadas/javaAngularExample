package com.javaexample.angularjwt.repository;

import com.javaexample.angularjwt.entity.Rol;
import com.javaexample.angularjwt.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
