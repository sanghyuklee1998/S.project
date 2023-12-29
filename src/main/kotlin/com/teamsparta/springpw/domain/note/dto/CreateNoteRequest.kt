package com.teamsparta.springpw.domain.note.dto

import java.util.Date

data class CreateNoteRequest (
    val title: String,
    val content: String,
)