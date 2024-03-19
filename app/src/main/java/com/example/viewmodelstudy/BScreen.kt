package com.example.viewmodelstudy

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun BScreen(
    viewModel: BViewModel = hiltViewModel(),
    navigateToA: () -> Unit,
    navigateToStart: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("B Screen")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = navigateToA) {
            Text("Go to A Screen")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = navigateToStart) {
            Text("Go to Start Screen")
        }
    }
}