package mvp.hao.com.mvpdemo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HaoBoy on 2018/8/3.
 */

public class INameModelImpl implements INameModel {
    @Override
    public void loadNames(OnDataLoadingListener onDataLoadingListener) {
        List<String> list = new ArrayList<>();
        list.add("林心如1");
        list.add("林心如2");
        list.add("林心如3");
        list.add("林心如4");
        list.add("林心如5");
        list.add("林心如6");
        list.add("林心如7");
        list.add("林心如8");
        list.add("林心如9");
        list.add("林心如10");
        list.add("林心如11");
        list.add("林心如12");
        list.add("林心如13");
        list.add("林心如14");
        onDataLoadingListener.onComplete(list);
    }
}
