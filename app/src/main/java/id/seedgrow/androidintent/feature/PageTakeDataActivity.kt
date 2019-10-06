package id.seedgrow.androidintent.feature

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.seedgrow.androidintent.R
import id.seedgrow.androidintent.utils.Constans
import kotlinx.android.synthetic.main.activity_page_take_data.*

class PageTakeDataActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_take_data)

        val getString = intent.getStringExtra(Constans.DATA_STRING)
        val getInt = intent.getIntExtra(Constans.DATA_INT, 0)

        tv_page_take_data.text = "$getString \n $getInt"
    }
}
