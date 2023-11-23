package com.project.Restaurant.Member.owner;

import com.project.Restaurant.Member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Optional<Owner> findByusername(String username);

    Optional<Owner> findByemail(String email);
}
