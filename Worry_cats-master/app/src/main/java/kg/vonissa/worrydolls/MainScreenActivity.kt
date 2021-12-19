package kg.vonissa.worrydolls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class MainScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)

        val menu = findViewById<ImageView>(R.id.menu)

        menu.setOnClickListener{
            startActivity(Intent(this,CategoryActivity::class.java))
        }

        val plus = findViewById<LinearLayout>(R.id.plus)

        plus.setOnClickListener{
            startActivity(Intent(this,TellUsActivity::class.java))
        }
    }
}