package com.NextTask.Usuarios;

import com.NextTask.Usuarios.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuarios, Integer> {

}
