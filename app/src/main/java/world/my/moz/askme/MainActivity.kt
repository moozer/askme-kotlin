package world.my.moz.askme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_plus.setOnClickListener({ text_center.setText( ""+ counter++) })
        button_minus.setOnClickListener({ text_center.setText( ""+ counter--) })
        button_next.setOnClickListener({
            val intent = Intent(this, Question_1::class.java)
            intent.putExtra("Page", 0)
            startActivity(intent)

        })
    }

}
