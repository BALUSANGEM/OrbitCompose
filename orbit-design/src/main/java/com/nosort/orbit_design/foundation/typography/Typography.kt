package com.nosort.orbit_design.foundation.typography

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp


class Typography(
    val bodyNormal: TextStyle
) {
    val bodyNormalBold = bodyNormal.copy(fontWeight = FontWeight.Bold)
    val bodyNormalMedium = bodyNormal.copy(fontWeight = FontWeight.Medium)
}

fun createTypography(): Typography =
    Typography(
        bodyNormal = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 15.sp,
            lineHeight = 20.sp,
            fontFamily = FontFamily.Default,
            platformStyle = PlatformTextStyle(includeFontPadding = false),
            lineHeightStyle = LineHeightStyle(
                alignment = LineHeightStyle.Alignment.Center,
                trim = LineHeightStyle.Trim.None
            )
        )
    )

internal val LocalTypography: ProvidableCompositionLocal<Typography> =
    compositionLocalOf { createTypography() }