package com.ubaya.adv160421025week6.model

data class PortSpecifications(
    val chargingPort: Int?,
    val headphoneJack: Int?,
    val simSlot: Int?,
    val sdCardSlot: Int?
)

data class Handphone(
    val id: Int,
    val brand: String,
    val model: String,
    val year: Int,
    val specs: Map<String, String>,
    val colors: List<String>,
    val images: String
)
