package com.teamsparta.springpw.domain.note.dto

import java.util.Date

data class NoteResponse (
    val id: Long,
    val title: String,
    val content: String,
    val date: Date,
    val name: String

)