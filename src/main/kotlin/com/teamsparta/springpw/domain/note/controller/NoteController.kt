package com.teamsparta.springpw.domain.note.controller

import com.teamsparta.springpw.domain.note.dto.CreateNoteRequest
import com.teamsparta.springpw.domain.note.dto.NoteResponse
import com.teamsparta.springpw.domain.note.dto.UpdateNoteRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/Notes")
@RestController
class NoteController {

    @GetMapping("/")
    fun getNoteList(): ResponseEntity<List<NoteResponse>> {
        TODO()
    }

    @GetMapping("/{noteId}")
    fun getNote(@PathVariable noteId: Long){
        TODO()
    }

    @PostMapping
    fun createNote(@RequestBody createNoteRequest: CreateNoteRequest): ResponseEntity<NoteResponse>{
        TODO()
    }

    @PutMapping("/{noteId}")
    fun updateNote(@PathVariable noteId: Long, @RequestBody updateNoteRequest: UpdateNoteRequest){
        TODO()
    }

    @DeleteMapping("/{noteId}")
    fun deleteNote(@PathVariable NoteId:Long){
        TODO()
    }
}
