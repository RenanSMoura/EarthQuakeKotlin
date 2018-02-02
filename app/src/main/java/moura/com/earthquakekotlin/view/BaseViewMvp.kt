package moura.com.earthquakekotlin.view

import android.content.Context
import android.support.annotation.StringRes

/**
 * Created by Renan on 01/02/2018.
 */
interface BaseViewMvp{

    fun getContext() :Context

    fun showError(error: String?)

    fun showError(@StringRes stringResId : Int)

    fun showMessage(@StringRes stringResId: Int)

    fun showMessage(message: String)
}