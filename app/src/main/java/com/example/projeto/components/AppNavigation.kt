import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projeto.feature.auth.login.LoginScreen
import com.example.projeto.feature.auth.login.RegisterUserScreen
import com.example.projeto.feature.home.HomeScreen
import com.example.projeto.feature.UserDetails.UserDetailsScreen

@Composable
fun AppNavigation() {
    // Cria e "lembra" de uma instância do NavController.
    // O rememberNavController garante que o controlador não seja recriado a cada recomposição, mantendo o estado da navegação.
    val navController = rememberNavController()

    // NavHost é o contêiner que exibe o destino de navegação atual.
    NavHost(
        // Associa o NavController que acabamos de criar.
        navController = navController,
        // Define a rota de destino inicial, que será exibida quando o app iniciar.
        startDestination = "login"
    ) {
        // Define uma rota de navegação chamada "tela1".
        composable("login") {
            LoginScreen(navController)
        }

        composable("userDetails") {
            UserDetailsScreen(navController)
        }

        composable("home") {
            HomeScreen(navController)
        }
        // Define uma segunda rota de navegação chamada "tela2".
        composable("registerUserScreen") {
            // Define o conteúdo a ser exibido para a rota "tela2".
            RegisterUserScreen(navController)
        }
    }
}