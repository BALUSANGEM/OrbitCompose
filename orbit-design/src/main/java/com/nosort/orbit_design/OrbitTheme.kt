package com.nosort.orbit_design

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.nosort.orbit_design.foundation.color.Colors
import com.nosort.orbit_design.foundation.color.LocalColors
import com.nosort.orbit_design.foundation.typography.LocalTypography
import com.nosort.orbit_design.foundation.typography.Typography

object OrbitTheme {
    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}