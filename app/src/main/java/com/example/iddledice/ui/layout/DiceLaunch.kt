package com.example.iddledice.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun DiceLaunch(modifier: Modifier = Modifier) {
    var diceValue by rememberSaveable { mutableStateOf(1) }
    var total by rememberSaveable { mutableStateOf(0) }
    var upgradeLevel by rememberSaveable { mutableStateOf(0) }
    var upgradeCost by rememberSaveable { mutableStateOf(10) }

    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            DiceView(diceValue)
        }

        Text(
            text = "Total: $total",
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "Upgrade level: $upgradeLevel — Next upgrade cost: $upgradeCost",
            style = MaterialTheme.typography.bodyMedium
        )

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Button(onClick = {
                val maxFace = 6 + upgradeLevel
                val roll = Random.nextInt(1, maxFace + 1)
                diceValue = roll
                total += roll
            }) {
                Text("Roll Dice")
            }

            Button(
                onClick = {
                    if (total >= upgradeCost) {
                        upgradeLevel++
                        total -= upgradeCost
                        upgradeCost = upgradeCost * 2
                    }
                },
                enabled = total >= upgradeCost
            ) {
                Text("Upgrade (Cost: $upgradeCost)")
            }
        }

        OutlinedButton(
            onClick = {
                diceValue = 1
                total = 0
                upgradeLevel = 0
                upgradeCost = 10
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Reset")
        }
    }
}

@Composable
fun DiceView(value: Int, size: Int = 64) {
    Box(
        modifier = Modifier
            .size(size.dp)
            .shadow(4.dp, RoundedCornerShape(8.dp))
            .background(Color.White, RoundedCornerShape(8.dp))
            .border(2.dp, Color.Black, RoundedCornerShape(8.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = value.toString(),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
    }
}
