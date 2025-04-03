package damien.com.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import damien.com.R
import damien.com.navigation.ROUTE_LOGIN
import damien.com.navigation.ROUTE_REGISTER

@Composable
fun Home_Screen(navController: NavController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,){
        Text(
            text = "Safari App",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Blue,
            fontStyle = FontStyle.Normal,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(painter = painterResource(id = R.drawable.appdev),
            contentDescription = "image of app dev",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)

        )

        Text(
            text = " sign up or login",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            fontStyle = FontStyle.Normal,
        )

       Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navController.navigate(ROUTE_LOGIN) },
        modifier = Modifier.width(250.dp)) {
            Text(text = "Login",
            color = Color.White,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,

            )

            }

        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { navController.navigate(ROUTE_REGISTER) },
            modifier = Modifier.width(250.dp)) {
            Text(text = "Register",
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic,

                )
        }

    }



}

@Preview
@Composable
private fun Home_Preview() {
    Home_Screen(rememberNavController())

    
}