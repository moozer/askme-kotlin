package world.my.moz.askme


class Question( questionText:String, answerOptions:List<String>) {
    var question : String?
    var options : List<String>?

    init {
        question = questionText
        options = answerOptions
    }
}


object Questions {
    val Q1 = Question(
            "How tired were you this morning?",
            listOf("No probs",
                    "Slept fine, fresh",
                    "Ok",
                    "Tired",
                    "Not functioning")
    )
    val Qs = listOf( Q1)

    val As: IntArray = intArrayOf(-1)


}