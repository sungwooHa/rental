

@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.study.rental.domain.model

import com.study.rental.domain.model.vo.*

data class RentalCard(
    val rentalCardNo: RentalCardNo,
    val member: IDName,
    val rentStatus: RentStatus,
    val lateFee: LateFee,
    val rentalItemList: MutableList<RentalItem> = mutableListOf(),
    val returnItemList: MutableList<ReturnItem> = mutableListOf(),
) {
    companion object {
        fun sample(): RentalCard =
            RentalCard(
                rentalCardNo = RentalCardNo.createRentalCardNo(),
                member = IDName.sample(),
                rentStatus = RentStatus.RENT_AVAILABLE,
                lateFee = LateFee.sample(),
            )
    }

    private fun addRentalItem(rentalItem: RentalItem) {
        rentalItemList.add(rentalItem)
    }

    private fun removeRentalItem(rentalItem: RentalItem) {
        rentalItemList.remove(rentalItem)
    }

    private fun addReturnItem(returnItem: ReturnItem) {
        returnItemList.add(returnItem)
    }
}
