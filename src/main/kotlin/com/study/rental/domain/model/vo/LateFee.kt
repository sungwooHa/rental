package com.study.rental.domain.model.vo

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class LateFee(
    var point: Long = 0,
) {
    fun addPoint(additionalPoint: Long): LateFee = LateFee(this.point + additionalPoint)

    fun removePoint(pointToRemove: Long): LateFee {
        if (pointToRemove > this.point) {
            throw IllegalArgumentException("보유한 포인트보다 커서 삭제할 수 없습니다.")
        }
        return LateFee(this.point - pointToRemove)
    }

    companion object {
        fun createLateFee(): LateFee = LateFee(0)

        fun sample(): LateFee = LateFee(34)
    }
}

fun main() {
    println(LateFee.sample())
}
