package moura.com.earthquakekotlin.view

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import moura.com.earthquakekotlin.presenter.BasePresenter

/**
 * Created by Renan on 01/02/2018.
 */
abstract class EarthQuakeActivity<in V:BaseViewMvp,T : BasePresenter<V>> : AppCompatActivity(),BaseViewMvp{

    protected abstract var mPresenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mPresenter.attachView(this as V)
    }

    override fun getContext(): Context  = this

    override fun showError(error: String?) {
        error?.showToast(this)
    }

    override fun showError(stringResId: Int) {
        stringResId.showToast(this)
    }

    override fun showMessage(stringResId: Int) {
        stringResId.showToast(this)
    }

    override fun showMessage(message: String) {
        message.showToast(this)
    }

    fun Any.showToast(context: Context){
        Toast.makeText(context,this.toString(),Toast.LENGTH_LONG).show()
    }
}

