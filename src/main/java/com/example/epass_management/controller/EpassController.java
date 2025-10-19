package com.example.epass_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.epass_management.model.Epass;
import com.example.epass_management.repository.EpassRepository;
import java.util.List;

@RestController
@RequestMapping("/api/epass")
@CrossOrigin(origins = "*") // Allow frontend access
public class EpassController {

    @Autowired
    private EpassRepository repo;

    // ✅ Handle form submission (index.html)
    @PostMapping("/submit")
    public Epass submitApplication(@RequestBody Epass epass) {
        return repo.save(epass);
    }

    // ✅ Fetch all data for admin.html
    @GetMapping("/all")
    public List<Epass> getAllApplications() {
        return repo.findAll();
    }
}