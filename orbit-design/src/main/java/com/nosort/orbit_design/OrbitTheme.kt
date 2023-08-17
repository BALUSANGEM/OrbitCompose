package com.nosort.orbit_design

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.nosort.orbit_design.foundation.color.Colors
import com.nosort.orbit_design.foundation.color.LocalColors

object OrbitTheme {
    val colors : Colors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current
}