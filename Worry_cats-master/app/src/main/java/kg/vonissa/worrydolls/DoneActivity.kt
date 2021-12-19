package kg.vonissa.worrydolls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class DoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MainScreenActivity::class.java))
        }

        val ok = findViewById<LinearLayout>(R.id.ok)

        ok.setOnClickListener{
            startActivity(Intent(this,MainScreenActivity::class.java))
        }
    }
}