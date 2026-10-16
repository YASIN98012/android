package com.bitwarden.ui.platform.theme.color

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance

data class ThemePalette(
    val id: String,
    val label: String,
    val isDark: Boolean,
    val bg: Long,
    val surface: Long,
    val text: Long,
    val primary: Long,
    val accent: Long,
)

fun ThemePalette.toBitwardenColorScheme(): BitwardenColorScheme {
    val base = if (isDark) darkBitwardenColorScheme else lightBitwardenColorScheme
    val bgC = Color(bg)
    val surfaceC = Color(surface)
    val textC = Color(text)
    val primaryC = Color(primary)
    val accentC = Color(accent)
    val onPrimary = if (primaryC.luminance() > 0.5f) Color.Black else Color.White
    val muted = textC.copy(alpha = 0.65f)
    val line = textC.copy(alpha = 0.18f)
    return base.copy(
        text = base.text.copy(
            primary = textC,
            secondary = muted,
            interaction = primaryC,
            reversed = bgC,
        ),
        background = base.background.copy(
            primary = bgC,
            secondary = surfaceC,
            tertiary = surfaceC,
            alert = textC,
            pressed = muted,
        ),
        stroke = base.stroke.copy(
            divider = line,
            border = primaryC,
            segmentedNav = line,
        ),
        icon = base.icon.copy(
            primary = muted,
            secondary = primaryC,
            reversed = bgC,
            badgeBackground = accentC,
            badgeForeground = bgC,
            navActiveAccent = primaryC.copy(alpha = 0.35f),
        ),
        filledButton = base.filledButton.copy(
            background = primaryC,
            backgroundDisabled = surfaceC,
            backgroundReversed = surfaceC,
            foreground = onPrimary,
            foregroundDisabled = muted,
            foregroundReversed = primaryC,
        ),
        outlineButton = base.outlineButton.copy(
            border = primaryC,
            borderDisabled = line,
            borderReversed = textC,
            foreground = primaryC,
            foregroundDisabled = muted,
            foregroundReversed = textC,
        ),
        toggleButton = base.toggleButton.copy(
            backgroundOn = primaryC,
            backgroundOff = textC.copy(alpha = 0.35f),
        ),
        sliderButton = base.sliderButton.copy(
            knobBackground = primaryC,
            knobLabel = onPrimary,
            filled = primaryC,
            unfilled = line,
        ),
        illustration = base.illustration.copy(
            outline = primaryC,
            backgroundPrimary = surfaceC,
            backgroundSecondary = surfaceC,
            backgroundTertiary = bgC,
            accent = accentC,
            logo = primaryC,
        ),
    )
}

private fun dark(
    id: String,
    label: String,
    bg: Long,
    surface: Long,
    text: Long,
    primary: Long,
    accent: Long,
) = ThemePalette(id, label, true, bg, surface, text, primary, accent)

private fun light(
    id: String,
    label: String,
    bg: Long,
    surface: Long,
    text: Long,
    primary: Long,
    accent: Long,
) = ThemePalette(id, label, false, bg, surface, text, primary, accent)

val customThemePalettes: List<ThemePalette> = listOf(
    dark("dracula", "Dracula", 0xFF282A36, 0xFF44475A, 0xFFF8F8F2, 0xFFBD93F9, 0xFFFF79C6),
    dark("nord", "Nord", 0xFF2E3440, 0xFF3B4252, 0xFFECEFF4, 0xFF88C0D0, 0xFF81A1C1),
    dark("gold_black", "Gold & Black", 0xFF000000, 0xFF14110A, 0xFFF5E6B8, 0xFFD4AF37, 0xFFFFD700),
    dark("aurora", "Aurora", 0xFF0B1220, 0xFF121C2E, 0xFFE6F1FF, 0xFF3DDC97, 0xFF7B61FF),
    dark("cyberpunk", "Cyberpunk", 0xFF0D0221, 0xFF1A0B3B, 0xFFF1E9FF, 0xFFFF2A6D, 0xFF05D9E8),
    dark("ember", "Ember", 0xFF140C0A, 0xFF241613, 0xFFFBE9DD, 0xFFFF7A3D, 0xFFFFC15E),
    dark("forest", "Forest", 0xFF0C1511, 0xFF15241C, 0xFFE4F0E6, 0xFF7BC47F, 0xFFE0C068),
    dark("amoled", "AMOLED Black", 0xFF000000, 0xFF0A0A0A, 0xFFFFFFFF, 0xFF8AB4F8, 0xFFBB86FC),
    dark("mocha", "Catppuccin Mocha", 0xFF1E1E2E, 0xFF313244, 0xFFCDD6F4, 0xFFCBA6F7, 0xFFF5C2E7),
    dark("macchiato", "Catppuccin Macchiato", 0xFF24273A, 0xFF363A4F, 0xFFCAD3F5, 0xFFC6A0F6, 0xFFF5BDE6),
    dark("tokyo_night", "Tokyo Night", 0xFF1A1B26, 0xFF24283B, 0xFFC0CAF5, 0xFF7AA2F7, 0xFFBB9AF7),
    dark("gruvbox", "Gruvbox Dark", 0xFF282828, 0xFF3C3836, 0xFFEBDBB2, 0xFFFABD2F, 0xFFFE8019),
    dark("solarized_dark", "Solarized Dark", 0xFF002B36, 0xFF073642, 0xFF93A1A1, 0xFF268BD2, 0xFF2AA198),
    dark("monokai", "Monokai", 0xFF272822, 0xFF3E3D32, 0xFFF8F8F2, 0xFFA6E22E, 0xFFF92672),
    dark("one_dark", "One Dark", 0xFF282C34, 0xFF353B45, 0xFFABB2BF, 0xFF61AFEF, 0xFFC678DD),
    dark("rose_pine", "Rosé Pine", 0xFF191724, 0xFF26233A, 0xFFE0DEF4, 0xFFEBBCBA, 0xFFC4A7E7),
    dark("everforest", "Everforest", 0xFF2B3339, 0xFF374145, 0xFFD3C6AA, 0xFFA7C080, 0xFFE69875),
    dark("kanagawa", "Kanagawa", 0xFF1F1F28, 0xFF2A2A37, 0xFFDCD7BA, 0xFF7E9CD8, 0xFF957FB8),
    dark("ayu_mirage", "Ayu Mirage", 0xFF1F2430, 0xFF2A3040, 0xFFCCCAC2, 0xFFFFCC66, 0xFF73D0FF),
    dark("synthwave", "Synthwave", 0xFF262335, 0xFF34294F, 0xFFFFFFFF, 0xFFFF7EDB, 0xFF36F9F6),
    dark("midnight_ocean", "Midnight Ocean", 0xFF06141F, 0xFF0D2233, 0xFFDCEBF5, 0xFF2EC4B6, 0xFF4EA8DE),
    dark("sakura", "Sakura", 0xFF1C1418, 0xFF2B1E24, 0xFFFBE8EE, 0xFFF4A6C0, 0xFFB8A1E3),
    dark("crimson", "Crimson", 0xFF120709, 0xFF211012, 0xFFF6E3E5, 0xFFE63946, 0xFFFF9F1C),
    dark("matrix", "Matrix", 0xFF000A00, 0xFF0A1A0A, 0xFFC8FFC8, 0xFF00FF41, 0xFF008F11),
    dark("lavender_haze", "Lavender Haze", 0xFF17121F, 0xFF241C30, 0xFFEDE4F7, 0xFFB79CED, 0xFF8FD3FE),
    dark("mint_chocolate", "Mint Chocolate", 0xFF1B1411, 0xFF2A201B, 0xFFF0E6DC, 0xFF7FD8BE, 0xFFC49A6C),
    dark("slate", "Slate", 0xFF1B1F23, 0xFF262C32, 0xFFE1E4E8, 0xFF6CB6FF, 0xFFF69D50),
    dark("sunset", "Sunset", 0xFF1A0F1F, 0xFF2A1830, 0xFFFFE8D6, 0xFFFF6B6B, 0xFFFFB86B),
    dark("deep_space", "Deep Space", 0xFF05060F, 0xFF0E1124, 0xFFE3E8FF, 0xFF6C8CFF, 0xFFA78BFA),
    dark("coffee", "Coffee", 0xFF17110D, 0xFF261C16, 0xFFEFE0D0, 0xFFD4A373, 0xFFA98467),
    light("solarized_light", "Solarized Light", 0xFFFDF6E3, 0xFFEEE8D5, 0xFF586E75, 0xFF268BD2, 0xFFB58900),
    light("latte", "Catppuccin Latte", 0xFFEFF1F5, 0xFFDCE0E8, 0xFF4C4F69, 0xFF8839EF, 0xFFEA76CB),
    light("paper", "Paper", 0xFFFAF8F3, 0xFFEDE9DF, 0xFF2B2B2B, 0xFF1F6FEB, 0xFFD9480F),
    light("rose_pine_dawn", "Rosé Pine Dawn", 0xFFFAF4ED, 0xFFF2E9E1, 0xFF575279, 0xFF907AA9, 0xFFD7827E),
)
