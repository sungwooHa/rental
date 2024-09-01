package com.study.rental.domain.model.vo

import com.study.rental.domain.model.RentalItem
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.time.LocalDate

@Data
@AllArgsConstructor
@NoArgsConstructor
data class ReturnItem(
    val rentalItem: RentalItem,
    val returnDate: LocalDate,
) {
    companion object {
        fun createReturnItem(rentalItem: RentalItem) = ReturnItem(rentalItem, LocalDate.now())

        fun sample() = ReturnItem.createReturnItem(RentalItem.sample())
    }
}

fun main() {
    println(ReturnItem.sample())
}
