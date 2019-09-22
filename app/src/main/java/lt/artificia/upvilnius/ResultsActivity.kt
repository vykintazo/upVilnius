package lt.artificia.upvilnius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
    }

    fun close(v: View?){
        finish()
    }
}