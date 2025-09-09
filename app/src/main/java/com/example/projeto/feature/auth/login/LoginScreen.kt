package com.example.projeto.feature.auth.login

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.projeto.ui.theme.LinkText
import com.example.projeto.ui.theme.PrimaryButton
import com.example.projeto.ui.theme.ProjetoTheme

@Composable
fun LoginScreen(navController: NavHostController) {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp, vertical = 48.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Bem-vindo!", style = MaterialTheme.typography.headlineMedium)
            Text("Olá! Por favor, faça login", style = MaterialTheme.typography.bodyMedium)

            Text("Email", style = MaterialTheme.typography.labelLarge)

            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Digite seu email...") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            )

            Text("Senha", style = MaterialTheme.typography.labelLarge)

            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Digite sua senha...") },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                trailingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            )

            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Text("Esqueceu sua senha?", style = MaterialTheme.typography.bodySmall)
            }

            Button(
                onClick = {navController.navigate("home")},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryButton)
            ) {
                Text("Login")
            }

            Spacer(Modifier.weight(1f))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Ainda não tem uma conta? ")
                Button(
                    // A ação a ser executada quando o botão for clicado.
                    onClick = {
                        // Usa o NavController para voltar para a tela anterior na pilha de navegação.
                        navController.navigate("registerUserScreen")
                    }
                ) {
                    // O texto que aparece dentro do botão.
                    Text("Cadastre-se")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    val navController = rememberNavController()
    ProjetoTheme { LoginScreen(navController) }
}
