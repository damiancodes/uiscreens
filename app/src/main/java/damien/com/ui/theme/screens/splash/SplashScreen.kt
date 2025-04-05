package damien.com.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import damien.com.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    var isSplashFinished by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(3000) // 3-second delay
        isSplashFinished = true
    }

    if (isSplashFinished) {
        navController.navigate("ROUTE_HOME") // Navigate to home screen
    } else {
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
}
