package com.example.livechat99.di

import androidx.lifecycle.ViewModel
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class LiveChatModule {
    @Provides
    fun getFirebaseAuth():FirebaseAuth= Firebase.auth

    @Provides
    fun getFireBaseFireStore():FirebaseFirestore=Firebase.firestore
}