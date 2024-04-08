package com.example.lagat

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySplash()

            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
           coroutineScope.launch {
               delay(1000)
               mContext.startActivity(Intent(mContext,MainActivity::class.java))
               finish()
           }

        }
    }
}

@Composable
fun MySplash(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.spotify),
            contentDescription ="Splash",
            modifier = Modifier
                .size(width = 90.dp, height = 75.dp)
                .size(100.dp)
        )
        Text(text = "Spotify",
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.White)


    }

}


@Preview(showBackground = true)
@Composable
fun MySplashPreview(){
    MySplash()
}
