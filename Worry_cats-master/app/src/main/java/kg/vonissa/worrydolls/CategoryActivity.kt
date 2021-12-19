package kg.vonissa.worrydolls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MainScreenActivity::class.java))
        }

        val defeated = findViewById<TextView>(R.id.defeated)

        defeated.setOnClickListener{
            startActivity(Intent(this,FinishedWoriesActivity::class.java))
        }
    }
}