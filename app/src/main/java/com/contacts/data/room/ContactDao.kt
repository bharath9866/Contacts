package com.contacts.data.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface ContactDao {
    @Upsert
    fun insertContact(contact: Contact)

    @Query("SELECT * FROM contact ORDER BY name ASC")
    fun getAllContacts(): List<Contact>

    @Delete
    fun deleteContact(contact: Contact)
}