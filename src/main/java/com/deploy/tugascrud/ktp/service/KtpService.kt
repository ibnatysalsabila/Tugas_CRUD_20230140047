package com.deploy.tugascrud.ktp.service

import com.deploy.tugascrud.ktp.model.dto.KtpAddRequest
import com.deploy.tugascrud.ktp.model.dto.KtpDto

interface KtpService {
    fun addKtp(request: KtpAddRequest?): KtpDto?
    val allKtp: MutableList<KtpDto?>?
    fun getKtpById(id: Int?): KtpDto?
    fun updateKtp(id: Int?, request: KtpAddRequest?): KtpDto?
    fun deleteKtp(id: Int?)
}