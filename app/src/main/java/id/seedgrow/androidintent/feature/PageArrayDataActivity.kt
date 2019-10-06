package id.seedgrow.androidintent.feature

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.seedgrow.androidintent.R
import id.seedgrow.androidintent.model.Profile
import id.seedgrow.androidintent.utils.Constans
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page_array_data.*
import org.jetbrains.anko.image

class PageArrayDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_array_data)

        val getIntent = intent.getParcelableExtra<Profile>(Constans.DATA_ARRAY)
        iv_page_array_image.setImageResource(getIntent.image)
        tv_page_array_name.text = getIntent?.name
        tv_page_array_job.text = getIntent?.job
        tv_page_array_studying.text = getIntent?.studying
        tv_page_array_age.text = getIntent?.age.toString()
        tv_page_array_religion.text = getIntent?.religion

        //Intent Implisit Dial Phone
        btn_page_array_contact.setOnClickListener {
            val samplePhone = "+6282337305750"
            val toDialPhone = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$samplePhone"))
            startActivity(toDialPhone)
        }

    }
}
