package com.example.androidlifecycle.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidlifecycle.R
import com.example.androidlifecycle.Utilities.EXTRA_PLAYER
import com.example.androidlifecycle.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    fun leagueNextClicked(view: View) {

        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)

        } else {

            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()

        }

    }

    fun onMensClicked(view: View) {
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        player.league = "mens"
    }

    fun onWomensClicked(view: View) {

        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        player.league = "womens"

    }

    fun onCoedClicked(view: View) {

        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false

        player.league = "Co-ed"
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        if (savedInstanceState != null) {

            player = savedInstanceState.getParcelable(EXTRA_PLAYER)

        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)



    }
}
