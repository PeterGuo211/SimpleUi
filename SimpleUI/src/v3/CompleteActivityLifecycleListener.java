package v3;

import v2.simpleUi.ActivityLifecycleListener;
import android.app.Activity;
import android.os.Bundle;

/**
 * Extends the default {@link ActivityLifecycleListener} by all additional event
 * methods. Also read
 * http://developer.android.com/reference/android/app/Activity.html
 * 
 * @author Simon Heinen
 * 
 */
public interface CompleteActivityLifecycleListener extends ActivityLifecycleListener {

	void onCreate(Activity a, Bundle savedInstanceState);

	void onStart(Activity a);

	void onRestart(Activity a);

	void onDestroy(Activity a);
}
