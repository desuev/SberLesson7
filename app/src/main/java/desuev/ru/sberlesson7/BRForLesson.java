package desuev.ru.sberlesson7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import desuev.ru.sberlesson7.API.Callback;

public class BRForLesson extends BroadcastReceiver {

    private Callback client;

    BRForLesson(Callback client){
        this.client = client;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        client.update(intent.getStringExtra(RandomData.DATA_FILTER));
    }
}
