package com.pepela.cache.player

import com.pepela.data.player.model.Player
import com.pepela.data.player.model.Profile
import com.pepela.data.player.model.SearchProfile
import com.pepela.data.source.player.PlayerDataStore
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single

class PlayerCacheImpl : PlayerDataStore {

    override fun getPlayer(id: Long): Flowable<Player> {
        TODO("not implemented")
    }

    override fun savePlayer(player: Player): Completable =
            Completable.complete() //TODO change after implementing db

    override fun clearPlayers(): Completable {
        TODO("not implemented")
    }

    override fun isCached(): Single<Boolean> = Single.just(false)

    override fun searchPlayer(name: String): Flowable<List<SearchProfile>> {
        TODO("not implemented")
    }
}
