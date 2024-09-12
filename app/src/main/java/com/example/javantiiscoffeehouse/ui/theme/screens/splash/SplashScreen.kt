package com.example.javantisassociation.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.javantisassociation.R
import com.example.javantisassociation.ui.theme.PurpleGrey40
import com.example.javantisassociation.ui.theme.NewOrange
import com.example.sellapy.navigation.ROUT_HOME
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()
    ){


        var coroutine= rememberCoroutineScope()
        coroutine.launch {
            delay(3000)
            navController.navigate(ROUT_HOME)
        }


        Card(modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),
            shape = RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp),
            colors = CardDefaults.cardColors(NewOrange)
        ) {


           Column (
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally,
               modifier = Modifier.fillMaxSize()
           ){
               Image(
                   painterResource(id = R.drawable.java),
                   contentDescription = "product",
                   modifier = Modifier.size(200.dp)

               )
               Image(
                   painterResource(id = R.drawable.coffee),
                   contentDescription = "product",
                   modifier = Modifier.size(200.dp)
               )

               Text(text ="Welcome to SaintAppi",
                   fontSize = 40.sp,
                   color = Color.White,
                   fontFamily = FontFamily.Cursive

               )

               Text(text ="The home of fashion",
                   fontSize = 40.sp,
                   color = Color.White,
                   fontFamily = FontFamily.Cursive)



           }

        }


        Spacer(modifier = Modifier.height(70.dp))

        Text(
            text ="We are more than a coffee shop. A space to connect, unwind and relax. Because when you come to Javantis House, you are coming home.\n" +
                    "\u200EOur Products · \u200EJavantis Love Gifting · \u200EContact Us · \u200EFind a store. or even come have a taste of heaven through our coffee",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )

        Button(
            onClick = {  },
            colors = ButtonDefaults.buttonColors(PurpleGrey40),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)

        ){

            Text(text = "EVERYTHING I BREW, I BREW FOR YOU")

        }





    }

}


@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}
