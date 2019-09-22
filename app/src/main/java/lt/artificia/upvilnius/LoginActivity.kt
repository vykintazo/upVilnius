package lt.artificia.upvilnius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun NextActivity(view: View?){
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }
}