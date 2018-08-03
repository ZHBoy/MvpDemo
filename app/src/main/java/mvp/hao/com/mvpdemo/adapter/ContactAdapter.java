package mvp.hao.com.mvpdemo.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import mvp.hao.com.mvpdemo.R;

public class ContactAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    private Context mContext;

    public ContactAdapter(List<String> data, Context mContext) {
        super(R.layout.item_name, data);
        this.mContext = mContext;
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, final String string) {
        baseViewHolder.setText(R.id.tv_name, string);
    }
}
