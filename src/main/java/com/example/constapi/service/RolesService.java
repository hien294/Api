package com.example.constapi.service;

import com.example.constapi.entity.Roles;
import com.example.constapi.respository.RolesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesService {
    @Autowired
    private RolesRespository rolesRespository;

    public List<Roles> getAll(){
        return rolesRespository.findAll();
    }

    public Roles add(Roles r){
       return rolesRespository.save(r);
    }
    public Roles update(Roles r,String id) {
        Optional<Roles> optionalRoles = rolesRespository.findById(id);
        return optionalRoles.map(o->{
            o.setNameRoles(r.getNameRoles());
            return rolesRespository.save(o);
        }).orElse(null);
    }
    public Roles delete(String id) {
        Optional<Roles> optionalRoles = rolesRespository.findById(id);
        return optionalRoles.map(o->{
            rolesRespository.delete(o);
            return o;
        }).orElse(null);
    }
}
