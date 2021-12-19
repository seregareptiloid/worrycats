package kg.vonissa.worrydolls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class TellUsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tell_us)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MainScreenActivity::class.java))
        }

        val tell = findViewById<LinearLayout>(R.id.tellyour)

        tell.setOnClickListener{
            startActivity(Intent(this,DoneActivity::class.java))
        }
    }
}