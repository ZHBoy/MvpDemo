package mvp.hao.com.mvpdemo;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import mvp.hao.com.mvpdemo.adapter.ContactAdapter;
import mvp.hao.com.mvpdemo.presenter.NamePresenter;
import mvp.hao.com.mvpdemo.view.BaseActivity;
import mvp.hao.com.mvpdemo.view.INameView;

public class MainActivity extends BaseActivity<INameView,NamePresenter<INameView>> implements INameView{

    private ContactAdapter contactAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        presenter.fetch();
    }

    @Override
    protected NamePresenter<INameView> createPresenter() {
        return new NamePresenter<>();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this,"加载成功",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showNames(List<String> data) {
        contactAdapter = new ContactAdapter(data,this);
        recyclerView.setAdapter(contactAdapter);
    }
}
