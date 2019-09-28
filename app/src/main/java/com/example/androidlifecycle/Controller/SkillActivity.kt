package com.example.androidlifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidlifecycle.Utilities.EXTRA_LEAGUE
import com.example.androidlifecycle.R
import com.example.androidlifecycle.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)

    }

    fun onSkillFInishClicked(view: View) {

        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {

            Toast.makeText(this, "Please pick a skill level", Toast.LENGTH_LONG).show()

        }


    }

    fun onBeginClick(view: View) {

        ballerSkillButton.isChecked = false

        skill = "beginner"

    }

    fun onBallerClick(view: View) {

        biginnerSkillButton.isChecked = false

        skill = "Baller"

    }
}
