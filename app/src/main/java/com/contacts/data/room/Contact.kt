package com.contacts.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact(@PrimaryKey val id: Int, val name: String, val phone: String)