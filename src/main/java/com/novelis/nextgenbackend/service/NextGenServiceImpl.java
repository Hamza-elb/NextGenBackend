package com.novelis.nextgenbackend.service;

import com.novelis.nextgenbackend.entities.Admin;
import com.novelis.nextgenbackend.entities.AppUser;
import com.novelis.nextgenbackend.entities.Prof;
import com.novelis.nextgenbackend.repositories.AdminRepository;
import com.novelis.nextgenbackend.repositories.AppUserRepository;
import com.novelis.nextgenbackend.repositories.ProfRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NextGenServiceImpl implements NextGenService {
    private AdminRepository adminRepository;
    private AppUserRepository appUserRepository;
    private ProfRepository profRepository;

    @Override
    public List<Admin> getAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    @Override
    public AppUser saveAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public AppUser updateAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public void deleteAppUser(Long id) {
        appUserRepository.deleteById(id);
    }

    @Override
    public List<Prof> getProfs() {
        return profRepository.findAll();
    }

    @Override
    public Prof saveProf(Prof prof) {
        return profRepository.save(prof);
    }

    @Override
    public Prof updateProf(Prof prof) {
        return profRepository.save(prof);
    }

    @Override
    public void deleteProf(Long id) {
        profRepository.deleteById(id);
    }
}
