package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}