package com.study.rental.domain.model.vo

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class IDName(
    val id: String,
    val name: String,
) {
    companion object {
        fun sample() = IDName("scant", "sample")
    }
}

fun main() {
    println(IDName.sample())
}
