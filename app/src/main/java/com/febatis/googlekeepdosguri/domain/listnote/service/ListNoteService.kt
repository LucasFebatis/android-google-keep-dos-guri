package com.febatis.googlekeepdosguri.domain.listnote.service

import com.febatis.googlekeepdosguri.domain.listnote.model.NoteListModel
import retrofit2.Call
import retrofit2.http.GET

interface ListNoteService {

    @GET("notes")
    fun getAllNotes(): Call<NoteListModel>
}