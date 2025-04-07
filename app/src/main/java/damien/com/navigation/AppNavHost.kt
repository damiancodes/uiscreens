package damien.com.navigation

import Dashboard_Screen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import damien.com.ui.theme.screens.home.Home_Screen
import damien.com.ui.theme.screens.login.Login_Screen
import damien.com.ui.theme.screens.register.Register_Screen
import damien.com.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            Login_Screen(navController)
        }
        composable(ROUTE_REGISTER) {
            Register_Screen(navController)
        }
        composable(ROUTE_HOME) {
            Home_Screen(navController)
        }
        composable (ROUTE_DASHBOARD){
            Dashboard_Screen(navController)
        }
    }
}
