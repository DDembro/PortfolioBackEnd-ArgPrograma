package com.portfolio.dembrowky.security.repository;

import com.portfolio.dembrowky.security.entity.Rol;
import com.portfolio.dembrowky.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{

    Optional<Rol> findByRolNombre(RolNombre rolNombre); 
}
