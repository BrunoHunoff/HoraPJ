package com.example.projeto.feature.UserDetails

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
fun UserDetailsScreen(navController: NavHostController) {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp, vertical = 48.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Text("Detalhes do usuário", style = MaterialTheme.typography.bodySmall)
            }
            Button(
                onClick = {navController.navigate("home")},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryButton)
            ) {
                Text("Home")
            }
            Button(
                onClick = {navController.navigate("login")},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryButton)
            ) {
                Text("Logout")
            }

            Spacer(Modifier.weight(1f))

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun UserDetailsScrennPreview() {
    val navController = rememberNavController()
    ProjetoTheme { UserDetailsScreen(navController) }
}
