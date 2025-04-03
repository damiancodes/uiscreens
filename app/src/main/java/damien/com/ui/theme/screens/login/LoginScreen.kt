package damien.com.ui.theme.screens.login

import android.R.attr.label
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import damien.com.navigation.ROUTE_REGISTER

@Composable
fun Login_Screen(navController: NavController) {
    var email by remember { mutableStateOf(TextFieldValue(""))  }
    var password by remember { mutableStateOf(TextFieldValue(""))  }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),)
    {
        Text(
            text = "Login",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontSize = 50.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter Email") },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = "emailIcon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(20.dp)
        )


        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter Password") },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "passwordIcon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(20.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))


        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.width(250.dp)
        ) {
            Text(
                text = "Login",
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic,
            )

        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Don't have an account? Register",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(8.dp)
                .clickable{
                    navController.navigate(ROUTE_REGISTER)
                }
        )

    }
    }

@Preview
@Composable
private fun Loginprev() {
    Login_Screen(rememberNavController())
    
}