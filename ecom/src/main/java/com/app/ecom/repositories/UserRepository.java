package com.app.ecom.repositories;


import com.app.ecom.entities.Role;
import com.app.ecom.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u JOIN FETCH u.address a where a.addressUd = ?1")
    List<User> findByAddress(Long addressId);

    Optional<User> findByEmail(String email);
}
