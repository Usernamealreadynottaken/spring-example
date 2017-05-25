package eu.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.example.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
}
