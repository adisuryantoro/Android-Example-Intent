package id.seedgrow.androidintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import id.seedgrow.androidintent.feature.PageArrayDataActivity
import id.seedgrow.androidintent.feature.PageNoDataActivity
import id.seedgrow.androidintent.feature.PageTakeDataActivity
import id.seedgrow.androidintent.model.Profile
import id.seedgrow.androidintent.utils.Constans
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Intent no data
        btn_change_page_no_data.setOnClickListener {
            //TODO : way one does not with data
//            val intent = Intent(this, PageNoDataActivity::class.java)
//            startActivity(intent)

            //TODO : way two does not with data
            startActivity<PageNoDataActivity>()
        }

        //Intent with data
        btn_change_page_take_data.setOnClickListener {
            //TODO : way one with data
//            val intent = Intent(this, PageTakeDataActivity::class.java)
//            intent.putExtra(Constans.DATA_STRING, "Studying Intent Explisit")
//            intent.putExtra(Constans.DATA_INT, 123456789)
//            startActivity(intent)

            //TODO : way two with data
            startActivity<PageTakeDataActivity>(Constans.DATA_STRING to "Studying Intent Explisit", Constans.DATA_INT to 123456789)
        }

        //Intent with array data
        btn_change_page_take_array_data.setOnClickListener{
            val profile = Profile(R.drawable.image_adi_suryantoro, "Adi Suryantoro", "Android Developer", "STTA", 23, "Yogyakarta", "Islam" )

            //TODO : way one with array data
//            val intent = Intent(this, PageArrayDataActivity::class.java)
//            intent.putExtra(Constans.DATA_ARRAY, profile)
//            startActivity(intent)

            //TODO : way two with array data
            startActivity<PageArrayDataActivity>(Constans.DATA_ARRAY to profile)
        }

        //Intent Implisit Dial Phone
        btn_change_page_to_dial_phone.setOnClickListener {
            val samplePhone = "+6282337305750"
            val toDialPhone = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$samplePhone"))
            startActivity(toDialPhone)
        }

        //Intent Implisit Image Camera
        btn_change_page_to_camera.setOnClickListener {
            val toImageCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(toImageCamera)
        }

    }
}
