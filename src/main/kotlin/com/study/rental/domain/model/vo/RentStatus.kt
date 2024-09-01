package com.study.rental.domain.model.vo

// 연체가 됐을 때, 불가능한 상태로 전환된다.
enum class RentStatus {
    RENT_AVAILABLE,
    RENT_UNAVAILABLE,
}
