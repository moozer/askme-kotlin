package world.my.moz.askme

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button_plus = findViewById<Button>(R.id.button_plus)
        val button_minus = findViewById<Button>(R.id.button_minus)
        val text_center = findViewById<TextView>(R.id.text_center)
        val button_next= findViewById<Button>(R.id.button_next)

        button_plus.setOnClickListener({ text_center.setText( ""+ counter++) })
        button_minus.setOnClickListener({ text_center.setText( ""+ counter--) })
        button_next.setOnClickListener({
            val intent = Intent(this, Question_1::class.java)
            startActivity(intent)

        })
    }

}
