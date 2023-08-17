package com.nosort.orbit_design.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

object ButtonDefaults {
    internal val minWidth = 64.dp
    internal val minHeight = 32.dp

    internal val horizontalPadding = 16.dp
    internal val verticalPadding = 14.dp

    internal val ContentPadding = PaddingValues(horizontalPadding, verticalPadding)

    internal val horizontalArrangement = Arrangement.spacedBy(space = 0.dp, Alignment.CenterHorizontally)
}