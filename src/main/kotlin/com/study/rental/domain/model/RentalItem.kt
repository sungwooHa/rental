package com.study.rental.domain.model

import com.study.rental.domain.model.vo.Item
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.time.LocalDate

@Data
@AllArgsConstructor
@NoArgsConstructor
data class RentalItem(
    val item: Item,
    val rentDate: LocalDate,
    val isOverdue: Boolean,
    val dueDate: LocalDate,
) {
    companion object {
        fun createRentalItem(item: Item) = RentalItem(item, LocalDate.now(), false, LocalDate.now().plusDays(14))

        fun sample() = createRentalItem(Item.sample())
    }
}

fun main() {
    println(RentalItem.sample())
}
