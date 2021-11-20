package com.patrykserek.flowplayground.domain

class ObserveNumber(
    private val numberRepository: NumberRepository,
) {

    operator fun invoke() = numberRepository.observe()
}
