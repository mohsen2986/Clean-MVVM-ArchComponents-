package com.k0d4black.theforce.domain.usecases


import com.k0d4black.theforce.domain.repository.ICharacterDetailsRepository
import javax.inject.Inject


class GetStarWarsCharacterFilmsUseCase @Inject constructor(
    private val characterDetailsRepository: ICharacterDetailsRepository
) {

    suspend operator fun invoke(characterId: Int) =
        characterDetailsRepository.getCharacterFilms(characterId)
}