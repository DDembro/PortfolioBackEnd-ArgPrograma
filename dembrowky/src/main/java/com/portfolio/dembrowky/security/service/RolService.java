package com.portfolio.dembrowky.security.service;

import com.portfolio.dembrowky.security.entity.Rol;
import com.portfolio.dembrowky.security.enums.RolNombre;
import com.portfolio.dembrowky.security.repository.IRolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    IRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
