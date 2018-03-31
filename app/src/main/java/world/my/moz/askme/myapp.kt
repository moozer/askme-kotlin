package world.my.moz.askme

import android.app.Application

class MyApp : Application() {

    companion object sharedData {
        val Question_1 = "How tired were you this morning?"
        val Options_1 = listOf( "No probs",
                "Slept fine, fresh",
                "Ok",
                "Tired",
                "Not functioning")

        var Answer_1 = -1
    }

}