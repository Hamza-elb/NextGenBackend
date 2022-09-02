package com.novelis.nextgenbackend.controller;

import com.novelis.nextgenbackend.entities.Admin;
import com.novelis.nextgenbackend.entities.AppUser;
import com.novelis.nextgenbackend.entities.Prof;
import com.novelis.nextgenbackend.service.NextGenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@AllArgsConstructor
public class NextGenController {
    private NextGenService nextGenService;

    @GetMapping("/api/admins")
    public List<Admin> getAdmins() {
        return nextGenService.getAdmins();
    }

    @PostMapping("/api/admins")
    public Admin saveAdmin(@RequestBody Admin admin) {
        return nextGenService.saveAdmin(admin);
    }

    @PutMapping("/api/admins/{adminId}")
    public Admin updateAdmin(@PathVariable Long adminId, @RequestBody Admin admin) {
        admin.setId(adminId);
        return nextGenService.updateAdmin(admin);
    }

    @DeleteMapping("/api/admins/{id}")
    public void deleteAdmin(@PathVariable Long id) {
        nextGenService.deleteAdmin(id);
    }

    @GetMapping("/api/appusers")
    public List<AppUser> getAppUsers() {
        return nextGenService.getAppUsers();
    }

    @PostMapping("/api/appusers")
    public AppUser saveAppUser(@RequestBody AppUser appUser) {
        return nextGenService.saveAppUser(appUser);
    }

    @PutMapping("/api/appusers/{appUserId}")
    public AppUser updateAppUser(@PathVariable Long appUserId, @RequestBody AppUser appUser) {
        appUser.setId(appUserId);
        return nextGenService.updateAppUser(appUser);
    }

    @DeleteMapping("/api/appusers/{id}")
    public void deleteAppUser(@PathVariable Long id) {
        nextGenService.deleteAppUser(id);
    }

    @GetMapping("/api/profs")
    public List<Prof> getProfs() {
        return nextGenService.getProfs();
    }

    @PostMapping("/api/profs")
    public Prof saveProf(@RequestBody Prof prof) {
        return nextGenService.saveProf(prof);
    }

    @PutMapping("/api/profs/{profId}")
    public Prof updateProf(@PathVariable Long profId, @RequestBody Prof prof) {
        prof.setId(profId);
        return nextGenService.updateProf(prof);
    }

    @DeleteMapping("/api/profs/{id}")
    public void deleteProf(@PathVariable Long id) {
        nextGenService.deleteProf(id);
    }

}
