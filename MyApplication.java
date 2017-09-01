import android.app.Application;
import android.content.Context;

/**
 * Android
 * 获取Context
 * <p>
 * 静态导入 import static tools.MyApplication.*;
 * <p>
 * 配置AndroidManifest.xml文件
 * <application
 *     android:name="packageName.MyApplication"
 * </application>
 * <p>
 * 调用 : MyApplication.getContext()
 *
 * @author 李锋
 * @version 1.0 2017-01-07
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }

}