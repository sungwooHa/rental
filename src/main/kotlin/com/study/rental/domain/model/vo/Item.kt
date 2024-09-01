package com.study.rental.domain.model.vo

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class Item(
    val no: Int,
    val name: String,
) {
    companion object {
        fun sample() = Item(10, "sample")
    }
}
