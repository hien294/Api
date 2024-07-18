package com.example.constapi.controller;

import com.example.constapi.entity.Roles;
import com.example.constapi.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HienCode")
public class RolesController {
    @Autowired
    private RolesService rolesService;
    @GetMapping("/hienThi")
    public ResponseEntity<?>getAll(){
        return ResponseEntity.ok(rolesService.getAll());
    }
    @PostMapping("/add")
    public ResponseEntity<?>add(@RequestBody Roles r){
        return ResponseEntity.ok(rolesService.add(r));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody Roles r){
        return ResponseEntity.ok(rolesService.update(r,id));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        return ResponseEntity.ok(rolesService.delete(id));
    }

}
