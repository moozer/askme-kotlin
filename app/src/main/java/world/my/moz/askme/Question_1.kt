package world.my.moz.askme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_question_1.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton



class Question_1 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_1)

        //val buttonAccept = findViewById<Button>(R.id.button_accept)
        //val textQuestion = findViewById<TextView>(R.id.text_question)
        //val radioGroup = findViewById<RadioGroup>(R.id.radio_group)

        val radioButtonList = listOf(
            findViewById<RadioButton>(R.id.radio_1),
            findViewById<RadioButton>(R.id.radio_2),
            findViewById<RadioButton>(R.id.radio_3),
            findViewById<RadioButton>(R.id.radio_4),
            findViewById<RadioButton>(R.id.radio_5)
        )

        // set dynamic labels
        text_question.text = MyApp.Question_1
        for( i:Int in 0..4) {
            radioButtonList[i].text = MyApp.Options_1[i]
        }

        radio_group.setOnCheckedChangeListener( { _, _ ->
            val selectedId = radio_group.getCheckedRadioButtonId()
            val button = findViewById<RadioButton>(selectedId)
            MyApp.Answer_1 = radio_group.indexOfChild(button)
        })

        button_accept.setOnClickListener({
            alert("Testing alerts") {
                title = "Alert"
                yesButton { toast("Yess: i is " + MyApp.Answer_1) }
                noButton { }
            }.show()
        })

    }

}
