package moura.com.earthquakekotlin.presenter

import moura.com.earthquakekotlin.view.BaseViewMvp

/**
 * Created by Renan on 01/02/2018.
 */

class EarthQuakePresenter<V:BaseViewMvp> : BasePresenter<BaseViewMvp>{


    protected var mView : V? = null
    override fun attachView(view: BaseViewMvp) {

    }

    override fun detachView(view: BaseViewMvp) {

    }


}