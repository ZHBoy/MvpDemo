package mvp.hao.com.mvpdemo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mvp.hao.com.mvpdemo.presenter.BasePresenter;

/**
 * Created by HaoBoy on 2018/8/3.
 */

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity{
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
         presenter.attachView((V)this);
    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
