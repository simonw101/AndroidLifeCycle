package com.example.androidlifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidlifecycle.R
import com.example.androidlifecycle.Utilities.EXTRA_PLAYER
import com.example.androidlifecycle.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onSkillFInishClicked(view: View) {

        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {

            Toast.makeText(this, "Please pick a skill level", Toast.LENGTH_LONG).show()

        }


    }

    fun onBeginClick(view: View) {

        ballerSkillButton.isChecked = false

        player.skill = "beginner"

    }

    fun onBallerClick(view: View) {

        biginnerSkillButton.isChecked = false

        player.skill = "Baller"

    }
}
