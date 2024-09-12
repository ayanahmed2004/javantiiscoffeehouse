package com.example.javantisassociation.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.javantiiscoffeehouse.R
import com.example.javantisassociation.ui.theme.NewOrange
import com.example.javantiiscoffeehouse.navigation.ROUT_LOGIN


@Composable
fun LoginScreen(navController: NavController){
    Column(modifier= Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.java), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(10.dp))





        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Welcome Back!",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Already have an account? Enter your credential",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,

            )

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = NewOrange) },
            label = { Text(text = "Email Address")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = NewOrange) },
            label = { Text(text = "Password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = { navController.navigate(ROUT_LOGIN) },
                colors = ButtonDefaults.buttonColors(NewOrange),
                shape = RoundedCornerShape(10.dp),
            ){

                Text(text = "Login as a User")

            }
            Spacer(modifier = Modifier.width(20.dp))


            Button(
                onClick = { navController.navigate(ROUT_LOGIN) },
                colors = ButtonDefaults.buttonColors(NewOrange),
                shape = RoundedCornerShape(10.dp),
            ){

                Text(text = "Login as a Admin")

            }



        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Do not have an account? Signup",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,

            )














    }




    }

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}
