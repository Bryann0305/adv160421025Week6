package com.ubaya.adv160421025week6.model

data class Handphone(
    val id: String?,
    val brand: String?,
    val model: String?,
    val year: String?,
    val specs: Map<String, String>?,
    val colors: List<String>?,
    val images: String?
)

data class PortSpecifications(
    val chargingPort: Int?,
    val headphoneJack: Int?,
    val simSlot: Int?,
    val sdCardSlot: Int?
)


