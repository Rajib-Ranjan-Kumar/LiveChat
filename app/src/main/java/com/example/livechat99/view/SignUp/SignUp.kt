package com.example.livechat99.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.livechat99.Utils.NavigationRoutes

@Composable
fun SignUp(navController: NavHostController) {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text("Name")
        OutlinedTextField(onValueChange = {
            username = it
        }, value = username)
        Text("Email")
        OutlinedTextField(onValueChange = {
            email = it
        }, value = email)
        Text("Password")
        OutlinedTextField(onValueChange = {
            password = it
        }, value = password)

        Button(
            onClick = {}, modifier = Modifier
                .width(115.dp)
                .height(70.dp)
                .padding(8.dp)
        ) {
            Text("Login")
        }
        Text(
            "Already have an account, LogIn",
            fontStyle = FontStyle.Italic,
            modifier = Modifier.clickable {navController.navigate(NavigationRoutes.LogInR.Route) },
            color = Color.Blue
        )
    }

}


