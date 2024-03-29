package com.keeprawteach.compose.ui.theme


import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = MainColor,
    primaryVariant = MainColor,
    secondary = MainColor
)

@Composable
fun DefaultTheme(content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        shapes = Shapes,
        content = content
    )
}