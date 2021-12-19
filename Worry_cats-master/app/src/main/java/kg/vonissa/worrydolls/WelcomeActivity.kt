package kg.vonissa.worrydolls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val next = findViewById<LinearLayout>(R.id.next)

        next.setOnClickListener{
            startActivity(Intent(this,MainScreenActivity::class.java))
        }

    }
}