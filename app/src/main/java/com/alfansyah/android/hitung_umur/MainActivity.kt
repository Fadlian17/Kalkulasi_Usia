package com.alfansyah.android.hitung_umur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_umur.setOnClickListener {
            //deklarasi pada editText
            var tahunLahir = et_input.text.toString()

            //get tahun dengan kalendar
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            //hasil dengan if else
            var umur = 0
            if (tahunLahir.toIntOrNull() !=null){
                umur = tahun - tahunLahir.toInt()
                tv_umur.text = "umur $umur tahun"
            }else{
                tv_umur.text = "Tahun tidak valid"
            }
        }
    }
}
