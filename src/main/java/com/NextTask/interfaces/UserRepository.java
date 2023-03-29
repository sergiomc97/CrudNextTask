package com.NextTask.interfaces;

import com.NextTask.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuarios, Integer> {

}
