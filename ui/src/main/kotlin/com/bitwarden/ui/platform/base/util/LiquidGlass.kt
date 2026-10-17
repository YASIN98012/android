package com.bitwarden.ui.platform.base.util

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.bitwarden.ui.platform.theme.BitwardenTheme

@Composable
fun Modifier.liquidGlass(shape: Shape): Modifier {
    if (!BitwardenTheme.colorScheme.isGlass) return this
    return this
        .background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color.White.copy(alpha = 0.14f),
                    Color.White.copy(alpha = 0.03f),
                ),
            ),
            shape = shape,
        )
        .border(
            width = 1.dp,
            brush = Brush.linearGradient(
                colors = listOf(
                    Color.White.copy(alpha = 0.55f),
                    Color.White.copy(alpha = 0.06f),
                    Color.White.copy(alpha = 0.30f),
                ),
            ),
            shape = shape,
        )
}
