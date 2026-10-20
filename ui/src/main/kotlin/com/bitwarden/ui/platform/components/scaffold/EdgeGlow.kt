package com.bitwarden.ui.platform.components.scaffold

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.bitwarden.ui.platform.theme.BitwardenTheme

/**
 * Draws a soft glow in the theme's accent color along all four screen edges.
 */
@Composable
fun Modifier.edgeGlow(): Modifier {
    val color = BitwardenTheme.colorScheme.stroke.border
    return this.drawWithContent {
        drawContent()
        val w = 28.dp.toPx()
        val strong = color.copy(alpha = 0.40f)
        drawRect(
            brush = Brush.verticalGradient(
                colors = listOf(strong, Color.Transparent),
                startY = 0f,
                endY = w,
            ),
            size = Size(size.width, w),
        )
        drawRect(
            brush = Brush.verticalGradient(
                colors = listOf(Color.Transparent, strong),
                startY = size.height - w,
                endY = size.height,
            ),
            topLeft = Offset(0f, size.height - w),
            size = Size(size.width, w),
        )
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(strong, Color.Transparent),
                startX = 0f,
                endX = w,
            ),
            size = Size(w, size.height),
        )
        drawRect(
            brush = Brush.horizontalGradient(
                colors = listOf(Color.Transparent, strong),
                startX = size.width - w,
                endX = size.width,
            ),
            topLeft = Offset(size.width - w, 0f),
            size = Size(w, size.height),
        )
    }
}
