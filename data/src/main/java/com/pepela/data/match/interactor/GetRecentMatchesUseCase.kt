package com.pepela.data.match.interactor

import com.pepela.data.MatchDataRepository
import com.pepela.data.executor.PostExecutionThread
import com.pepela.data.executor.ThreadExecutor
import com.pepela.data.interpretator.FlowableUseCase
import com.pepela.data.match.model.Match
import io.reactivex.Flowable

class GetRecentMatchesUseCase(private val matchDataRepository: MatchDataRepository,
                              threadExecutor: ThreadExecutor,
                              postExecutionThread: PostExecutionThread)
    : FlowableUseCase<List<Match>, Long>(threadExecutor, postExecutionThread) {

    public override fun buildUseCase(params: Long?): Flowable<List<Match>> {
        if (params == null) {
            throw  IllegalArgumentException("Account id is required to fetch matches")
        }
        return matchDataRepository.getRecentMatches(params)
    }

}
