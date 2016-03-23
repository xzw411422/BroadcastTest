package iphone.com.broadcasttest;

/**
 * Created by xzw12 on  0022.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by xzw12 on  0022.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
//    public  void onReceiver(Context context,Intent intent){
//        Toast.makeText(context,"lllllll",Toast.LENGTH_SHORT).show();
//    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"llloooooooooooooooooooollll",Toast.LENGTH_SHORT).show();
    }
}