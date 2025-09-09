package com.example.projeto.feature.home

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
fun HomeScreen(navController: NavHostController) {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp, vertical = 48.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Text("Página home", style = MaterialTheme.typography.bodySmall)
            }
            Button(
                onClick = {navController.navigate("userDetails")},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryButton)
            ) {
                Text("Detalhes do Usuário")
            }

            Spacer(Modifier.weight(1f))

            }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    val navController = rememberNavController()
    ProjetoTheme { HomeScreen(navController) }
}
