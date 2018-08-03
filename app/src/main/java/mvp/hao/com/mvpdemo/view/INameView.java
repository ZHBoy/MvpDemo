package mvp.hao.com.mvpdemo.view;

import java.util.List;

/**
 * Created by HaoBoy on 2018/8/3.
 * 定义UI逻辑
 */

public interface INameView {

    void showLoading();
    /**
     * 展示RecycleView中的数据
     */
    void showNames(List<String> data);
}
