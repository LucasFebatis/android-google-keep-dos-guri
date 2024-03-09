package com.febatis.googlekeepdosguri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.febatis.googlekeepdosguri.databinding.ActivityListNoteBinding

class ListNoteActivity : AppCompatActivity() {

    private val binding by lazy { ActivityListNoteBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}