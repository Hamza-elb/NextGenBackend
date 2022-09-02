package com.novelis.nextgenbackend.service;

import com.novelis.nextgenbackend.entities.Admin;
import com.novelis.nextgenbackend.entities.AppUser;
import com.novelis.nextgenbackend.entities.Prof;

import java.util.List;

public interface NextGenService {
    List<Admin> getAdmins();
    Admin saveAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    void deleteAdmin(Long id);
    List<AppUser> getAppUsers();
    AppUser saveAppUser(AppUser appUser);
    AppUser updateAppUser(AppUser appUser);
    void deleteAppUser(Long id);
    List<Prof> getProfs();
    Prof saveProf(Prof prof);
    Prof updateProf(Prof prof);
    void deleteProf(Long id);
}
