package com.study.rental.domain.model.vo

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.time.LocalDate
import java.util.UUID.randomUUID

@Data
@AllArgsConstructor
@NoArgsConstructor
class RentalCardNo(
    var no: String,
) {
    companion object {
        fun createRentalCardNo(): RentalCardNo {
            val uuid = randomUUID()
            val year = LocalDate.now().year.toString()
            val str = "$year-$uuid"
            return RentalCardNo(str)
        }

        fun sample(): RentalCardNo = RentalCardNo.createRentalCardNo()
    }

    override fun toString(): String = "RentalCardNo(no='$no')"
}

fun main() {
    println(RentalCardNo.sample())
}
