package com.example.lagat

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),
            navigationIcon = {
                IconButton(onClick = {mContext.startActivity(Intent(mContext,MainActivity::class.java))}) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription ="arrowback",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
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
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "BREEDS OF DOGS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
        Row {
            Image(painter = painterResource(id = R.drawable.siberianhusky),
                contentDescription ="siberian husky",
                modifier = Modifier.size(width = 150.dp, height = 150.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "Siberian Husky", fontWeight = FontWeight.Bold, fontSize =15.sp )
                Text(text = "The Siberian Husky is a medium-sized working sled dog breed. The breed belongs to the Spitz genetic family. ")
            }
        }
        //End of Row1
        Spacer(modifier = Modifier.height(5.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.bulldog),
                contentDescription ="Bulldog",
                modifier = Modifier.size(width = 150.dp, height = 150.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "Buldog", fontWeight = FontWeight.Bold, fontSize =15.sp )
                Text(text = "The Siberian Husky is a medium-sized working sled dog breed. The breed belongs to the Spitz genetic family. ")
            }
        }
        //End of Row2
        Spacer(modifier = Modifier.height(5.dp))

        Row {
            Image(painter = painterResource(id = R.drawable.gs),
                contentDescription ="German Shepherd",
                modifier = Modifier.size(width = 150.dp, height = 150.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                Text(text = "German Shepherd", fontWeight = FontWeight.Bold, fontSize =15.sp )
                Text(text = "The Siberian Husky is a medium-sized working sled dog breed. The breed belongs to the Spitz genetic family. ")
            }
        }
        //End of Row3
        Button(onClick = {

            mContext.startActivity(Intent(mContext,IntentActivity::class.java))
                         },
            modifier = Modifier.fillMaxWidth(),
            shape = CircleShape) {
            Text(text = "NEXT")
        }


    }


} 

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}