package world.my.moz.askme

import android.app.AlertDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

class Question_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_1)

        val button_accept = findViewById<Button>(R.id.button_accept)
        val text_question = findViewById<TextView>(R.id.text_question)
        val radio_group = findViewById<RadioGroup>(R.id.radio_group)
        val radio_button_list = listOf(
                findViewById<RadioButton>(R.id.radio_1),
                findViewById<RadioButton>(R.id.radio_2),
                findViewById<RadioButton>(R.id.radio_3),
                findViewById<RadioButton>(R.id.radio_4),
                findViewById<RadioButton>(R.id.radio_5)
                )


        text_question.setText(MyApp.Question_1)

        for( i:Int in 0..4) {
            radio_button_list[i].text = MyApp.Options_1[i]
        }


        button_accept.setOnClickListener({
            alert("Testing alerts") {
                title = "Alert"
                yesButton { toast("Yess: i is" + MyApp.Answer_1) }
                noButton { }
            }.show()
        })

    }
}
