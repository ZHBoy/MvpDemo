package mvp.hao.com.mvpdemo.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by HaoBoy on 2018/8/3.
 */

public class BasePresenter<T> {
    protected WeakReference<T> iNameView;

    //进行绑定
    public void attachView(T view){
        iNameView = new WeakReference<T>(view);

    }

    public void detachView(){
        iNameView.clear();
    }

}

