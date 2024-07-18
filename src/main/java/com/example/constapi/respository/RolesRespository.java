package com.example.constapi.respository;

import com.example.constapi.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRespository extends JpaRepository<Roles,String> {
}
