package divyansh.tech.fia

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FIAApplication: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}