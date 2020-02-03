package com.applike.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.*

@Entity
data class Crime(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false,
    var suspect: String = ""
) {

    val photoFileName
        get() = "IMG_$id.jpg"

    // Challenge 2 (Formatting the Date)
//    val dateFormat: String = SimpleDateFormat("MMM d, yyyy").format(date)
}