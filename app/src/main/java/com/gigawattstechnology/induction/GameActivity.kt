package com.gigawattstechnology.induction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val chosenCard=intent.getStringExtra("Chosen")
        //Toast.makeText(this,chosenCard,Toast.LENGTH_LONG).show()
        val number= chosenCard?.toInt()
        var trials:Int=3
        var winCount:Int=0
        var imageCard: ImageView =findViewById(R.id.Card_start)
        val trialsLeft:TextView=findViewById(R.id.Trials)
        val wins:TextView=findViewById(R.id.Wins)
        val button=findViewById<Button>(R.id.FlipCard)
        button.setOnClickListener {
            button.text="Flip Again"
            if (trials>0){
                var random:Int=(1..13).random()
                trials=trials-1
                trialsLeft.text=""+trials
                if(random==number){
                    winCount++
                    wins.text=""+winCount
                }
                val cardID=when(random){
                    1->R.drawable.card1
                    2->R.drawable.card2
                    3->R.drawable.card3
                    4->R.drawable.card4
                    5->R.drawable.card5
                    6->R.drawable.card6
                    7->R.drawable.card7
                    8->R.drawable.card8
                    9->R.drawable.card9
                    10->R.drawable.card10
                    11->R.drawable.card11
                    12->R.drawable.card12
                    else->R.drawable.card13
                }
                imageCard.setImageResource(cardID)
                if(trials==0){
                    if (winCount >= 2){
                        button.text="You Won"
                        Toast.makeText(this,"You Win",Toast.LENGTH_SHORT).show()
                    }else{
                        button.text="You Loose"
                        Toast.makeText(this,"You Loose",Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                if (winCount >= 2){
                    button.text="You Won"
                    Toast.makeText(this,"You Win",Toast.LENGTH_SHORT).show()
                }else{
                    button.text="You Loose"
                    Toast.makeText(this,"You Loose",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}