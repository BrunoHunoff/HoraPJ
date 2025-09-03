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
import com.example.projeto.ui.theme.LinkText
import com.example.projeto.ui.theme.PrimaryButton
import com.example.projeto.ui.theme.ProjetoTheme

@Composable
fun RegisterUserScreen() {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp, vertical = 48.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Título e subtítulo
            Text("Cadastre-se!", style = MaterialTheme.typography.headlineMedium)
            Text("Facilite sua gestão de tempo na palma da sua mão.", style = MaterialTheme.typography.bodyMedium)

            // Label Email
            Text("CPF", style = MaterialTheme.typography.labelLarge)

            // Campo Email (visual apenas: value fixo e onValueChange vazio)
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Digite seu CPF...") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            )

            // Label Email
            Text("E-mail", style = MaterialTheme.typography.labelLarge)

            // Campo Email (visual apenas: value fixo e onValueChange vazio)
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Digite seu e-mail...") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            )

            // Label Senha
            Text("Senha", style = MaterialTheme.typography.labelLarge)

            // Campo Senha (visual apenas, com ícone “olho” estático)
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

            // Label Senha
            Text("Confirmação de senha", style = MaterialTheme.typography.labelLarge)

            // Campo Senha (visual apenas, com ícone “olho” estático)
            OutlinedTextField(
                value = "",
                onValueChange = {},
                placeholder = { Text("Confirme sua senha...") },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                trailingIcon = { Icon(Icons.Default.Lock, contentDescription = null) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            )

            // Botão Logar
            Button(
                onClick = {}, // sem ação
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryButton)
            ) {
                Text("Registrar")
            }

            Spacer(Modifier.weight(1f))

            // Rodapé cadastro
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Já tem uma conta? ")
                Text(
                    "Logar",
                    color = LinkText,
                    modifier = Modifier.clickable(enabled = false) {} // só visual
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RegisterUserScreenPreview() {
    ProjetoTheme { RegisterUserScreen() }
}
