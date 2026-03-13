package com.deploy.tugascrud.ktp.controller;

import com.deploy.tugascrud.ktp.model.dto.KtpAddRequest;
import com.deploy.tugascrud.ktp.model.dto.KtpDto;
import com.deploy.tugascrud.ktp.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class KtpController {

    @Autowired
    private KtpService ktpService;

    @PostMapping(
            path = "/ktp",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> addKtp(@RequestBody KtpAddRequest request) {
        KtpDto result = ktpService.addKtp(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "status", "success",
                "message", "Data KTP berhasil ditambahkan",
                "data", result
        ));
    }

    @GetMapping(
            path = "/ktp",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getAllKtp() {
        List<KtpDto> result = ktpService.getAllKtp();
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "data", result
        ));
    }

    @GetMapping(
            path = "/ktp/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getKtpById(@PathVariable("id") Integer id) {
        KtpDto result = ktpService.getKtpById(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "data", result
        ));
    }

    @PutMapping(
            path = "/ktp/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> updateKtp(
            @PathVariable("id") Integer id,
            @RequestBody KtpAddRequest request
    ) {
        KtpDto result = ktpService.updateKtp(id, request);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "message", "Data KTP berhasil diperbarui",
                "data", result
        ));
    }

    @DeleteMapping(
            path = "/ktp/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> deleteKtp(@PathVariable("id") Integer id) {
        ktpService.deleteKtp(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "message", "Data KTP dengan id " + id + " berhasil dihapus"
        ));
    }
}