package com.example.pilotflighthourtracker.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import com.example.pilotflighthourtracker.ui.navigation.Screen

@Composable
fun LoginScreen(navController: NavController) {
    val constraints = ConstraintSet{
        val tv_title = createRefFor("tv_title")
        val btn_back = createRefFor("btn_back")

        constrain(tv_title){
            top.linkTo(parent.top, margin = 16.dp)
            start.linkTo(parent.start, margin = 16.dp)
            end.linkTo(parent.end, margin = 16.dp)
            width = Dimension.fillToConstraints
            height = Dimension.wrapContent
        }

        constrain(btn_back) {
            top.linkTo(tv_title.bottom, margin = 16.dp)
            start.linkTo(parent.start, margin = 16.dp)
            end.linkTo(parent.end, margin = 16.dp)
            width = Dimension.fillToConstraints
            height = Dimension.wrapContent
        }
    }

    ConstraintLayout(constraintSet = constraints,
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
    ) {

        Text(text = "Login Screen",
            fontSize = 20.sp,
            color = Color.Blue,
            textAlign = TextAlign.Center,
            modifier = Modifier.layoutId("tv_title"))

        Button(
            onClick = { navController.navigate(Screen.HomeScreen.route) },
            modifier = Modifier.layoutId("btn_back")
        ) {
            Text(text = "Back")
        }


        
    }



}