package com.example.lagat

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lagat.ui.theme.LagatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
    
    Column (modifier = Modifier.fillMaxSize()){
        Text(
            text = "Welcome to Android",
            color = Color.DarkGray,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold)
        Text(text = "Discover the latest app development tools, platform updates, training, and documentation for developers across every Android device.")
        Button(onClick = { /*TODO*/ },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "See More")
        }

        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Types of cars",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .height(40.dp)
            ,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline)
        Text(text = "1.BMW")
        Text(text = "2.Mercedes Benz")
        Text(text = "3.Ferrari")
        Text(text = "4.Bugatti")




        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Programming languages",
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray),
            textAlign = TextAlign.Center
            )

        Text(text = "1.JAVA")
        Text(text = "2.Python")
        Text(text = "3.PHP")
        Spacer(modifier = Modifier.height(15.dp))
        Divider()
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "A programming language is a system of notation for writing computer programs.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        //Centering an image
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.sunset1) ,
                contentDescription ="sunset",
                modifier = Modifier.size(200.dp))
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Continue")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}


