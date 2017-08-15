package com.example.hibernate.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernate.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

//	List<Users> findByName(String name);
	Optional<List<Users>> findByName(String name);

}
