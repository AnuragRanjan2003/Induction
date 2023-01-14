package com.gigawattstechnology.induction

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val choose:Button=findViewById(R.id.Choose)
        choose.setOnClickListener {
            val alertDialog: AlertDialog.Builder =AlertDialog.Builder(this)
            val dialogView: View =LayoutInflater.from(this).inflate(R.layout.dialog_view,null)



            val R1:RadioButton=dialogView.findViewById(R.id.Radio1)
            val R2:RadioButton=dialogView.findViewById(R.id.Radio2)
            val R3:RadioButton=dialogView.findViewById(R.id.Radio3)
            val R4:RadioButton=dialogView.findViewById(R.id.Radio4)
            val R5:RadioButton=dialogView.findViewById(R.id.Radio5)
            val R6:RadioButton=dialogView.findViewById(R.id.Radio6)
            val R7:RadioButton=dialogView.findViewById(R.id.Radio7)
            val R8:RadioButton=dialogView.findViewById(R.id.Radio8)
            val R9:RadioButton=dialogView.findViewById(R.id.Radio9)
            val R10:RadioButton=dialogView.findViewById(R.id.Radio10)
            val R11:RadioButton=dialogView.findViewById(R.id.Radio11)
            val R12:RadioButton=dialogView.findViewById(R.id.Radio12)
            val R13:RadioButton=dialogView.findViewById(R.id.Radio13)

            alertDialog.setTitle("Choose a card").setView(dialogView).setPositiveButton("Start Game",
                DialogInterface.OnClickListener { dialog, which ->
                    if (R1.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","1")
                        startActivity(intent)
                    }
                    if (R2.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","2")
                        startActivity(intent)
                    }
                    if (R3.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","3")
                        startActivity(intent)
                    }
                    if (R4.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","4")
                        startActivity(intent)
                    }
                    if (R5.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","5")
                        startActivity(intent)
                    }
                    if (R6.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","6")
                        startActivity(intent)
                    }
                    if (R7.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","7")
                        startActivity(intent)
                    }
                    if (R8.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","8")
                        startActivity(intent)
                    }
                    if (R9.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","9")
                        startActivity(intent)
                    }
                    if (R10.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","10")
                        startActivity(intent)
                    }
                    if (R11.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","11")
                        startActivity(intent)
                    }
                    if (R12.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","12")
                        startActivity(intent)
                    }
                    if (R13.isChecked){
                        val intent=Intent(this,GameActivity::class.java)
                        intent.putExtra("Chosen","13")
                        startActivity(intent)
                    }
                }
            )
            alertDialog.show()
        }
    }
}


