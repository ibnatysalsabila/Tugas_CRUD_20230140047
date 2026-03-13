package com.deploy.tugascrud.ktp.model.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class KtpAddRequest {
    private String nomorKtp;
    private String namaLengkap;
    private String alamat;
    private LocalDate tanggalLahir;
    private String jenisKelamin;
}