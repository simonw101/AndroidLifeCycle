package com.example.androidlifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidlifecycle.Utilities.EXTRA_LEAGUE
import com.example.androidlifecycle.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    fun leagueNextClicked(view: View) {

        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)

        } else {

            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()

        }

    }

    fun onMensClicked(view: View) {
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {

        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        selectedLeague = "womens"

    }

    fun onCoedClicked(view: View) {

        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false

        selectedLeague = "Co-ed"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
}
