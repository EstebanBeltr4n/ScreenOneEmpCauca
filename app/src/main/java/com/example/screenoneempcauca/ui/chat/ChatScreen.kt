package com.example.screenoneempcauca.ui.chat

import androidx.navigation.compose.rememberNavController
import com.example.screenoneempcauca.ui.theme.ScreenOneEmpCaucaTheme
import androidx.compose.runtime.Composable as Composable1
import androidx.compose.ui.tooling.preview.Preview as Preview1

@Composable1
fun ChatScreen (messages:List<com.example.screenoneempcauca.ui.chat.Message>){
    Conversation2(messages=messages)
    
}

@Preview1
@Composable1
fun PreviewConversation2() {
    ScreenOneEmpCaucaTheme {
        Conversation2(SampleData.conversationSample)
    }
}