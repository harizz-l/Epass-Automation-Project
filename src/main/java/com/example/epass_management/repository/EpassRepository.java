package com.example.epass_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.epass_management.model.Epass;

public interface EpassRepository extends JpaRepository<Epass, Long> { }