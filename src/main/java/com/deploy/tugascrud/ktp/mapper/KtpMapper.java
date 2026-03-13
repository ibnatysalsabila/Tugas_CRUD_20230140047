package com.deploy.tugascrud.ktp.mapper;

import com.deploy.tugascrud.ktp.model.dto.KtpAddRequest;
import com.deploy.tugascrud.ktp.model.dto.KtpDto;
import com.deploy.tugascrud.ktp.model.entity.Ktp;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface KtpMapper {
    KtpMapper MAPPER = Mappers.getMapper(KtpMapper.class);
    KtpDto toKtpDto(Ktp ktp);
    Ktp toEntity(KtpAddRequest request);
}