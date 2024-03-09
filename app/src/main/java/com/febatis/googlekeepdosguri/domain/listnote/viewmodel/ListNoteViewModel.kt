package com.febatis.googlekeepdosguri.domain.listnote.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.febatis.googlekeepdosguri.common.network.RetrofitUtils
import com.febatis.googlekeepdosguri.domain.listnote.model.NoteListModel
import com.febatis.googlekeepdosguri.domain.listnote.repository.RepositoryListNote
import com.febatis.googlekeepdosguri.domain.listnote.service.ListNoteService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListNoteViewModel(private val repository: RepositoryListNote) : ViewModel() {

    val noteList = MutableLiveData<NoteListModel>()
    val error = MutableLiveData<Boolean>()

    fun getAllNotes() {
        val request = repository.getAllNotes()
        request.enqueue(object : Callback<NoteListModel> {
            override fun onResponse(call: Call<NoteListModel>, response: Response<NoteListModel>) {
                noteList.postValue(response.body())
            }

            override fun onFailure(call: Call<NoteListModel>, t: Throwable) {
                t.printStackTrace()
                error.postValue(true)
            }

        })
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val service = RetrofitUtils.retrofit.create(ListNoteService::class.java)
                val repository = RepositoryListNote(service)
                ListNoteViewModel(repository)
            }
        }
    }
}