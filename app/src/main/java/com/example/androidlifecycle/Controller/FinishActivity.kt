package com.example.androidlifecycle.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlifecycle.R
import com.example.androidlifecycle.Utilities.EXTRA_PLAYER
import com.example.androidlifecycle.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league} ${player.league} league near you"

    }
}
