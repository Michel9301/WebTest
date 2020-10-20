package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario,Integer> {
	
	Usuario findByNombre(String nombre);

}
