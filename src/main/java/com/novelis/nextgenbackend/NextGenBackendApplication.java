package com.novelis.nextgenbackend;

import com.novelis.nextgenbackend.entities.Admin;
import com.novelis.nextgenbackend.entities.AppUser;
import com.novelis.nextgenbackend.entities.Prof;
import com.novelis.nextgenbackend.repositories.AdminRepository;
import com.novelis.nextgenbackend.repositories.AppUserRepository;
import com.novelis.nextgenbackend.repositories.ProfRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class NextGenBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(NextGenBackendApplication.class, args);
    }

    //@Bean
    CommandLineRunner runner(AdminRepository adminRepository,
                             AppUserRepository appUserRepository,
                             ProfRepository profRepository) {
        return args -> {

            Stream.of("Title1","Title2","Title3").forEach(title -> {
                Admin admin = new Admin();
                admin.setTitle(title);
                admin.setSlug(title+"_slug");
                adminRepository.save(admin);
            });

            Stream.of("User1","User2","User3").forEach(title -> {
                AppUser appUser = new AppUser();
                appUser.setTitle(title);
                appUser.setDescription("Description for " + title);
                appUser.setCategory("Category for " + title);
                appUser.setAuthor("Author for " + title);
                appUser.setReviews("Reviews for " + title);
                appUserRepository.save(appUser);
            });

            Stream.of("Prof1","Prof2","Prof3").forEach(title -> {
                Prof prof = new Prof();
                prof.setTitle(title);
                prof.setName("Name for " + title);
                prof.setPhone("0123456789");
                profRepository.save(prof);

            });

        };

    }

}
