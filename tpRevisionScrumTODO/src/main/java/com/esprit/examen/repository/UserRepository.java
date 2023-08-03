package com.esprit.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("SELECT e FROM User e WHERE e.email=:email and e.pwd=:password")
	public User getUsereByEmailAndPassword(@Param("email")String login,
	@Param("password")String password);
}
