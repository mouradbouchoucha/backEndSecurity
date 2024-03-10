package com.mrd.backEndSecurity.repositories;

import com.mrd.backEndSecurity.models.Role;
import com.mrd.backEndSecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    User findByRole(Role role);
}
