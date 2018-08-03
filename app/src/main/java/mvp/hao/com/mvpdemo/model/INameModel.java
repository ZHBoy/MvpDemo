package mvp.hao.com.mvpdemo.model;

import java.util.List;

/**
 * Created by HaoBoy on 2018/8/3.
 * 装载数据
 */

public interface INameModel {
    void loadNames(OnDataLoadingListener onDataLoadingListener);
    //内部回调接口
    interface OnDataLoadingListener{
        void onComplete(List<String> data);
    }
}
