package com.novelis.nextgenbackend.repositories;

import com.novelis.nextgenbackend.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
}
