package com.novelis.nextgenbackend.repositories;

import com.novelis.nextgenbackend.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
