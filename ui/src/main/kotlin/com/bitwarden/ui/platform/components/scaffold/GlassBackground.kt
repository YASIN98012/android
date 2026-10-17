package com.bitwarden.ui.platform.components.scaffold

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.bitwarden.ui.platform.theme.BitwardenTheme

/**
 * Draws a dark base with soft glowing color orbs, but only for the Glass themes.
 */
@Composable
fun Modifier.glassBackground(): Modifier {
    val scheme = BitwardenTheme.colorScheme
    if (!scheme.isGlass) return this
    val base = scheme.background.primary
    val orbA = scheme.stroke.border
    val orbB = scheme.illustration.accent
    return this.drawBehind {
        drawRect(color = base)
        drawRect(
            brush = Brush.radialGradient(
                colors = listOf(orbA.copy(alpha = 0.45f), Color.Transparent),
                center = Offset(size.width * 0.15f, size.height * 0.12f),
                radius = size.width * 0.9f,
            ),
        )
        drawRect(
            brush = Brush.radialGradient(
                colors = listOf(orbB.copy(alpha = 0.35f), Color.Transparent),
                center = Offset(size.width * 0.9f, size.height * 0.55f),
                radius = size.width * 1.0f,
            ),
        )
        drawRect(
            brush = Brush.radialGradient(
                colors = listOf(orbA.copy(alpha = 0.25f), Color.Transparent),
                center = Offset(size.width * 0.2f, size.height * 0.95f),
                radius = size.width * 0.8f,
            ),
        )
    }
}
