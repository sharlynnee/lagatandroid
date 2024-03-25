package com.example.lagat

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           myIntents()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myIntents(){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.pink),
            contentScale = ContentScale.FillBounds
        )
    ){
    val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),
            navigationIcon = {
                IconButton(onClick = {
                              mContext.startActivity(Intent(mContext,layoutactivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription ="arrowback",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription ="Share",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription ="Settings",
                        tint = Color.White
                    )
                }

            }
        )
        //End of TopAppBar

        OutlinedButton(
            onClick = {
                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
           Text(text = "MPESA",
               color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = {
                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0720245837".toUri()
                mContext.startActivity(callIntent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
            Text(text = "CALL",
                color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedButton(
            onClick = {
                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }
                      },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
            Text(text = "CAMERA",
                color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
            Text(text = "EMAIL",
                color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = { val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0720245837".toUri()
                smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
                mContext.startActivity(smsIntent) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
            Text(text = "SMS",
                color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = {  val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share")) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
            Text(text = "SHARE",
                color = Color.Black)
        }
        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Do not have an Account?Register",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    mContext.startActivity(Intent(mContext,FormActivity::class.java))
                },
            textAlign = TextAlign.Center)
    }

}

@Preview(showBackground = true)
@Composable
fun myIntentsPreview(){
    myIntents()

}