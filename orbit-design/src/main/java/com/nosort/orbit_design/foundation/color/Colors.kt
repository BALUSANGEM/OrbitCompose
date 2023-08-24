package com.nosort.orbit_design.foundation.color

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

@Stable
class Colors(
    val primary: FeatureColors,
    val surface: SurfaceColors,
    val content: ContentColors
)

@Stable
class FeatureColors(
    val normal: Color,
    val onNormal: Color,
    val subtle: Color,
    val strong: Color
)

@Stable
class SurfaceColors(
    val normal: Color,
)

@Stable
class ContentColors(
    val normal: Color,
)

val LocalColors: ProvidableCompositionLocal<Colors> = compositionLocalOf { lightColors() }