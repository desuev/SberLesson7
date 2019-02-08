package desuev.ru.sberlesson7;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;

import java.util.Random;

public class RandomData extends IntentService {

    public static final String DATA_FILTER = "RANDOM_DATA";

    public RandomData() {
        super(RandomData.class.getName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Random r = new Random();
        while (true){
            Intent internalIntent = new Intent("desuev.ru.sberlesson7.FILTER");
            internalIntent.putExtra(DATA_FILTER, String.valueOf(r.nextInt(4)));
            sendBroadcast(internalIntent);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static Intent newIntent(Context context){
        return new Intent(context, RandomData.class);
    }
}
