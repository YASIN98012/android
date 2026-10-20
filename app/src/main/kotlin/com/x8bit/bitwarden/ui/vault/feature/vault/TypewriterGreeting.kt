package com.x8bit.bitwarden.ui.vault.feature.vault

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.bitwarden.ui.platform.theme.BitwardenTheme
import kotlinx.coroutines.delay
import java.time.LocalTime

/**
 * Picks a first name for the greeting from the account name, or else from the email.
 */
fun greetingNameFor(name: String?, email: String): String {
    val fromName = name
        ?.trim()
        ?.split(" ")
        ?.firstOrNull { it.isNotBlank() }
    val raw = fromName
        ?: email
            .substringBefore("@")
            .split(Regex("[^A-Za-z]+"))
            .firstOrNull { it.isNotBlank() }
            .orEmpty()
    return raw.replaceFirstChar { it.uppercase() }
}

@Composable
fun TypewriterGreeting(name: String, modifier: Modifier = Modifier) {
    val full = remember(name) {
        val hour = LocalTime.now().hour
        val part = when {
            hour < 12 -> "Good morning"
            hour < 18 -> "Good afternoon"
            else -> "Good evening"
        }
        if (name.isBlank()) part else "$part, $name"
    }
    var shown by remember(full) { mutableIntStateOf(0) }
    LaunchedEffect(full) {
        while (shown < full.length) {
            delay(70L)
            shown += 1
        }
    }
    Text(
        text = full.take(shown) + if (shown < full.length) "▌" else "",
        color = BitwardenTheme.colorScheme.text.primary,
        fontSize = 20.sp,
        modifier = modifier.fillMaxWidth(),
    )
}
