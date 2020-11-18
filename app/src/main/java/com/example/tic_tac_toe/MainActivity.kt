package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var isPlayerOne = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        Button00.setOnClickListener {
            changeButton(Button00)
        }
        Button01.setOnClickListener {
            changeButton(Button01)
        }
        Button02.setOnClickListener {
            changeButton(Button02)
        }
        Button10.setOnClickListener {
            changeButton(Button10)
        }
        Button11.setOnClickListener {
            changeButton(Button11)
        }
        Button12.setOnClickListener {
            changeButton(Button12)
        }
        Button20.setOnClickListener {
            changeButton(Button20)
        }
        Button21.setOnClickListener {
            changeButton(Button21)
        }
        Button22.setOnClickListener {
            changeButton(Button22)
        }
        playAgainButton.setOnClickListener {

        }

    }

    private fun changeButton(Button: Button) {
        d("click", "Button")
        if (isPlayerOne) {
            Button.text = "X"
        } else {
            Button.text = "Y"
        }
        Button.isClickable = false
        isPlayerOne = !isPlayerOne

        checkWinner()

    }

    private fun checkWinner() {
        if (Button00.text.isNotEmpty() && Button00.text.toString() == Button01.text.toString() && Button00.text.toString() == Button02.text.toString()) {
            Toast.makeText(this, "Winner ${Button00.text}", Toast.LENGTH_SHORT).show()
        } else if (Button10.text.isNotEmpty() && Button10.text.toString() == Button11.text.toString() && Button10.text.toString() == Button12.text.toString()) {
            Toast.makeText(this, "Winner ${Button10.text}", Toast.LENGTH_SHORT).show()
        } else if (Button20.text.isNotEmpty() && Button20.text.toString() == Button21.text.toString() && Button20.text.toString() == Button22.text.toString()) {
            Toast.makeText(this, "Winner ${Button20.text}", Toast.LENGTH_SHORT).show()
        } else if (Button00.text.isNotEmpty() && Button00.text.toString() == Button10.text.toString() && Button00.text.toString() == Button20.text.toString()) {
            Toast.makeText(this, "Winner ${Button00.text}", Toast.LENGTH_SHORT).show()
        } else if (Button01.text.isNotEmpty() && Button01.text.toString() == Button11.text.toString() && Button01.text.toString() == Button21.text.toString()) {
            Toast.makeText(this, "Winner ${Button01.text}", Toast.LENGTH_SHORT).show()
        } else if (Button02.text.isNotEmpty() && Button02.text.toString() == Button12.text.toString() && Button02.text.toString() == Button22.text.toString()) {
            Toast.makeText(this, "Winner ${Button02.text}", Toast.LENGTH_SHORT).show()
        } else if (Button00.text.isNotEmpty() && Button00.text.toString() == Button11.text.toString() && Button00.text.toString() == Button22.text.toString()) {
            Toast.makeText(this, "Winner ${Button00.text}", Toast.LENGTH_SHORT).show()
        } else if (Button02.text.isNotEmpty() && Button02.text.toString() == Button11.text.toString() && Button02.text.toString() == Button20.text.toString()) {
            Toast.makeText(this, "Winner ${Button02.text}", Toast.LENGTH_SHORT).show()

        }
         else if (Button00.text.isNotEmpty() && Button01.text.isNotEmpty() && Button02.text.isNotEmpty() && Button10.text.isNotEmpty() && Button11.text.isNotEmpty() && Button12.text.isNotEmpty() && Button20.text.isNotEmpty() && Button21.text.isNotEmpty() && Button22.text.isNotEmpty()){
          Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show()}

    }
}




