package com.example.lagat

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Assignment()
        }
    }
}

@Composable
fun Assignment(){
    val mContext = LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.pink),
            contentScale = ContentScale.FillBounds

        )

        .verticalScroll(rememberScrollState())
    ) {
        val mContext = LocalContext.current
        Row(modifier = Modifier.padding(30.dp)){
            Image(painter = painterResource(id = R.drawable.b1),
                contentDescription ="Madola",
                modifier = Modifier
                    .size(width = 50.dp, height = 55.dp)
                    .size(100.dp)
                    .clip(shape = CircleShape)

            )

            Spacer(modifier =Modifier.width(10.dp))


            Column {
                Text(text="Woof", fontWeight = FontWeight.Bold, fontSize = 20.sp)

            }
        }
        //CARD 1
        Card (modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxWidth()){
            Row {
                Image(painter = painterResource(id = R.drawable.b2),
                    contentDescription ="Madola",
                    modifier = Modifier
                        .size(width = 50.dp, height = 55.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)

                )

                Spacer(modifier =Modifier.width(10.dp))

                Column {
                    Text(text="Koda", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                    Text(text= "2 years old")
                }
            }
        }
        //END OF CARD 1
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 2
        Card (modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxWidth()){
            Row {
                Image(painter = painterResource(id = R.drawable.b4),
                    contentDescription ="Madola",
                    modifier = Modifier
                        .size(width = 50.dp, height = 55.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)

                )

                Spacer(modifier =Modifier.width(10.dp))

                Column {
                    Text(text="Lola", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                    Text(text= "16 years old")
                }
            }
        }
        //END OF CARD 2
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 3
        Card (modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxWidth()){
            Row {
                Image(painter = painterResource(id = R.drawable.b5),
                    contentDescription ="Madola",
                    modifier = Modifier
                        .size(width = 50.dp, height = 55.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)

                )

                Spacer(modifier =Modifier.width(10.dp))

                Column {
                    Text(text="Frankie", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                    Text(text= "2 years old")
                }
            }
        }
        //END OF CARD 3
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 4
        Card (modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxWidth()){
            Row {
                Image(painter = painterResource(id = R.drawable.b1),
                    contentDescription ="Madola",
                    modifier = Modifier
                        .size(width = 50.dp, height = 55.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)

                )

                Spacer(modifier =Modifier.width(10.dp))

                Column {
                    Text(text="Nox", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                    Text(text= "8 years old")
                }
            }
        }
        //END OF CARD 4
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 5
        Card (modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxWidth()){
            Row {
                Image(painter = painterResource(id = R.drawable.b4),
                    contentDescription ="Madola",
                    modifier = Modifier
                        .size(width = 50.dp, height = 55.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)

                )

                Spacer(modifier =Modifier.width(10.dp))

                Column {
                    Text(text="Faye", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                    Text(text= "6 years old")
                }
            }
        }
        //END OF CARD 5
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 6
        Card (modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxWidth()){
            Row {
                Image(painter = painterResource(id = R.drawable.b2),
                    contentDescription ="Madola",
                    modifier = Modifier
                        .size(width = 50.dp, height = 55.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)

                )

                Spacer(modifier =Modifier.width(10.dp))

                Column {
                    Text(text="Bela", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                    Text(text= "14 years old")
                }
            }
        }
        //END OF CARD 6
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 7
        Card (modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxWidth()){
            Row {
                Image(painter = painterResource(id = R.drawable.bulldog),
                    contentDescription ="Madola",
                    modifier = Modifier
                        .size(width = 50.dp, height = 55.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)

                )

                Spacer(modifier =Modifier.width(10.dp))

                Column {
                    Text(text="Moana", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                    Text(text= "2 years old")
                }
            }
        }
        //END OF CARD 7
        Spacer(modifier =Modifier.height(10.dp))

        //CARD 8
        Card (modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxWidth()){
            Row {
                Image(painter = painterResource(id = R.drawable.comp),
                    contentDescription ="Paw",
                    modifier = Modifier
                        .size(width = 50.dp, height = 55.dp)
                        .size(100.dp)
                        .clip(shape = CircleShape)

                )

                Spacer(modifier =Modifier.width(10.dp))

                Column {
                    Text(text="Tzeitel", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                    Text(text= "7 years old")
                }
            }
        }
        //END OF CARD 8
        Spacer(modifier =Modifier.height(10.dp))


    }


}



@Preview(showBackground = true)
@Composable
fun AssignmentPreview(){
    Assignment()
}