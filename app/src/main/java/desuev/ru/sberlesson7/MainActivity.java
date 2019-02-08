package desuev.ru.sberlesson7;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import desuev.ru.sberlesson7.API.Callback;

public class MainActivity extends AppCompatActivity implements Callback {

    private RecyclerView recyclerView;
    private BRForLesson broadcastReceiver;
    private IntentFilter filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initService();
        initViews();
        init();
    }

    private void init(){
        broadcastReceiver = new BRForLesson(this);
        filter = new IntentFilter("desuev.ru.sberlesson7.FILTER");
    }

    private void initService(){
        startService(RandomData.newIntent(MainActivity.this));
    }

    @Override
    public void onResume() {
        super.onResume();
        registerReceiver(broadcastReceiver, filter, null, null);
    }

    @Override
    public void onPause() {
        super.onPause();
        unregisterReceiver(broadcastReceiver);
    }

    private void initViews(){
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new ContactAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public void update(String data) {
        ( (ContactAdapter)recyclerView.getAdapter()).addContact(new Contact("Тестовая заглушка", "Да", "89161488666", Integer.valueOf(data)));
    }
}
