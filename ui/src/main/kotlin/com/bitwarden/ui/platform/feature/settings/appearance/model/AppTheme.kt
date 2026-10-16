package com.bitwarden.ui.platform.feature.settings.appearance.model

import androidx.appcompat.app.AppCompatDelegate

/**
 * Represents the theme options the user can set.
 */
enum class AppTheme(val value: String?, val osValue: Int) {
    DEFAULT(value = null, osValue = AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM),
    DARK(value = "dark", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    LIGHT(value = "light", osValue = AppCompatDelegate.MODE_NIGHT_NO),
    DRACULA(value = "dracula", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    NORD(value = "nord", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    GOLD_BLACK(value = "gold_black", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    AURORA(value = "aurora", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    CYBERPUNK(value = "cyberpunk", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    EMBER(value = "ember", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    FOREST(value = "forest", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    AMOLED(value = "amoled", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    MOCHA(value = "mocha", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    MACCHIATO(value = "macchiato", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    TOKYO_NIGHT(value = "tokyo_night", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    GRUVBOX(value = "gruvbox", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    SOLARIZED_DARK(value = "solarized_dark", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    MONOKAI(value = "monokai", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    ONE_DARK(value = "one_dark", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    ROSE_PINE(value = "rose_pine", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    EVERFOREST(value = "everforest", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    KANAGAWA(value = "kanagawa", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    AYU_MIRAGE(value = "ayu_mirage", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    SYNTHWAVE(value = "synthwave", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    MIDNIGHT_OCEAN(value = "midnight_ocean", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    SAKURA(value = "sakura", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    CRIMSON(value = "crimson", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    MATRIX(value = "matrix", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    LAVENDER_HAZE(value = "lavender_haze", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    MINT_CHOCOLATE(value = "mint_chocolate", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    SLATE(value = "slate", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    SUNSET(value = "sunset", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    DEEP_SPACE(value = "deep_space", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    COFFEE(value = "coffee", osValue = AppCompatDelegate.MODE_NIGHT_YES),
    SOLARIZED_LIGHT(value = "solarized_light", osValue = AppCompatDelegate.MODE_NIGHT_NO),
    LATTE(value = "latte", osValue = AppCompatDelegate.MODE_NIGHT_NO),
    PAPER(value = "paper", osValue = AppCompatDelegate.MODE_NIGHT_NO),
    ROSE_PINE_DAWN(value = "rose_pine_dawn", osValue = AppCompatDelegate.MODE_NIGHT_NO),
}
