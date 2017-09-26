package activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


/**
 * @author lifeng
 * Created by obeya on 2017/9/26.
 */

public class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, getClass().getSimpleName());
        ActivityController.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityController.removeActivity(this);
    }
}
