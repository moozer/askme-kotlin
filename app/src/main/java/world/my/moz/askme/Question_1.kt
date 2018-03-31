package world.my.moz.askme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_question_1.*
import org.jetbrains.anko.toast


class Question_1 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_1)

        val page:Int = intent.getIntExtra("Page", -1)


        val radioButtonList = listOf(
                findViewById<RadioButton>(R.id.radio_1),
                findViewById<RadioButton>(R.id.radio_2),
                findViewById<RadioButton>(R.id.radio_3),
                findViewById<RadioButton>(R.id.radio_4),
                findViewById<RadioButton>(R.id.radio_5)
        )


        // set dynamic labels
        text_question.text = Questions.Qs.get(page).question
        for (i: Int in 0..4) {
            radioButtonList[i].text = Questions.Qs.get(page).options!![i]
        }

        radio_group.setOnCheckedChangeListener({ _, _ ->
            val selectedId = radio_group.getCheckedRadioButtonId()
            val button = findViewById<RadioButton>(selectedId)
            Questions.As[page] = radio_group.indexOfChild(button)
        })

        button_accept.setOnClickListener({
            if( Questions.As[page] < 0)
                toast("Please select something first")
            else {
                toast("Selected " + Questions.As[page])
                finish()
            }
        })

    }

}
