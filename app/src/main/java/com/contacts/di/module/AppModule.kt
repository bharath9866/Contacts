package com.contacts.di.module

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.contacts.data.room.ContactsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideContactsDatabase(@ApplicationContext context: Context): ContactsDatabase {
        return Room.databaseBuilder(
            context = context,
            klass = ContactsDatabase::class.java,
            name = "contacts_database.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideContactsDao(db: ContactsDatabase) = db.contactsDao
}