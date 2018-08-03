package mvp.hao.com.mvpdemo.presenter;

import java.lang.ref.WeakReference;
import java.util.List;

import mvp.hao.com.mvpdemo.model.INameModel;
import mvp.hao.com.mvpdemo.model.INameModelImpl;
import mvp.hao.com.mvpdemo.view.INameView;

/**
 * Created by HaoBoy on 2018/8/3.
 * 表示层，处理中间逻辑
 */

public class NamePresenter<T extends INameView> extends BasePresenter<T>{

    INameModel iNameModel = new INameModelImpl();

    public NamePresenter(){

    }

    public void fetch(){
        if (iNameView.get() != null){
            iNameView.get().showLoading();
            if (iNameModel != null){
                iNameModel.loadNames(new INameModel.OnDataLoadingListener() {
                    @Override
                    public void onComplete(List<String> data) {
                        if (iNameView.get() != null) {
                            iNameView.get().showNames(data);
                        }
                    }
                });
            }
        }
    }
}
