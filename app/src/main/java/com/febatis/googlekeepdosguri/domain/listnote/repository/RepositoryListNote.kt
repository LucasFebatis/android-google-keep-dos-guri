package com.febatis.googlekeepdosguri.domain.listnote.repository

import com.febatis.googlekeepdosguri.domain.listnote.service.ListNoteService

class RepositoryListNote(private val listNoteService: ListNoteService) {

    fun getAllNotes() = listNoteService.getAllNotes()
}