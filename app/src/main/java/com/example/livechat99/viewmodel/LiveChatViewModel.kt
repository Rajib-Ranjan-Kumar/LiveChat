package com.example.livechat99.viewmodel

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LiveChatViewModel @Inject constructor(
    private var auth: FirebaseAuth,
    private var db:FirebaseFirestore
):ViewModel() {

}