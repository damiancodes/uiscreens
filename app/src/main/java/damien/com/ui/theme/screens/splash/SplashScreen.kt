package damien.com.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import damien.com.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {


    LaunchedEffect(Unit) {
        delay(3000) // 3-second delay
        navController.navigate("ROUTE_HOME")
    }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "App Logo",
                modifier = Modifier.size(150.dp)
            )
        }
    }

@Preview
@Composable
private fun SplashScreenPreview() {
    SplashScreen(rememberNavController())
}