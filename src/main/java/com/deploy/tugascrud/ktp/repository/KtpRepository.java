package com.deploy.tugascrud.ktp.repository;

import com.deploy.tugascrud.ktp.model.entity.Ktp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface KtpRepository extends JpaRepository<Ktp, Integer> {
    Optional<Ktp> findByNomorKtp(String nomorKtp);
}