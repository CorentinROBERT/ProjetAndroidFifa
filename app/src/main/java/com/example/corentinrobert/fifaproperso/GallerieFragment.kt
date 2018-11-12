package com.example.corentinrobert.fifaproperso


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_gallerie.*
import android.graphics.BitmapFactory
import android.graphics.Bitmap
import kotlinx.android.synthetic.main.nav_header_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import com.example.corentinrobert.fifaproperso.R.id.imageView
import android.provider.MediaStore
import kotlinx.android.synthetic.main.content_main.*
import android.R.attr.data
import android.net.Uri
import android.os.Environment
import java.io.File
import android.app.Activity




/**
 * A simple [Fragment] subclass.
 *
 */
class GallerieFragment : Fragment(),AnkoLogger {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallerie, container, false)
    }
    var SELECT_PHOTO = 1
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val photoPickerIntent = Intent(Intent.ACTION_PICK)
        photoPickerIntent.type = "image/*"
        startActivityForResult(photoPickerIntent, SELECT_PHOTO)
        btnCharger.setOnClickListener(){
            val photoPickerIntent = Intent(Intent.ACTION_PICK)
            photoPickerIntent.type = "image/*"
            startActivityForResult(photoPickerIntent, SELECT_PHOTO)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == SELECT_PHOTO) {
            if (resultCode == Activity.RESULT_OK) {
                val selectedImage = data!!.data
                imgViewGallerie.setImageURI(selectedImage)

            }

        }
    }
}
