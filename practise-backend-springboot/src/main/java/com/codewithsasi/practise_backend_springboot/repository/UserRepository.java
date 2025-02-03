package com.codewithsasi.practise_backend_springboot.repository;

import com.codewithsasi.practise_backend_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
