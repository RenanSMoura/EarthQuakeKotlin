package moura.com.earthquakekotlin.presenter

import moura.com.earthquakekotlin.view.BaseViewMvp

/**
 * Created by Renan on 01/02/2018.
 */
interface BasePresenter<in V: BaseViewMvp> {

    fun attachView (view : V)

    fun detachView(view: V)
}