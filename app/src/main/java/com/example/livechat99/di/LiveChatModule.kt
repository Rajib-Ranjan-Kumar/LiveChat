package com.example.livechat99.di

import androidx.lifecycle.ViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class LiveChatModule {
    @Provides
    fun getFirebaseAuth()
}