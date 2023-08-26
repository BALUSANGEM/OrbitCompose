package com.nosort.orbit_design.components.button

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nosort.orbit_design.OrbitTheme

@Composable
fun ButtonSecondary(
    onClick: () -> Unit,
    modifier: Modifier,
    content: @Composable RowScope.() -> Unit
) {
    ButtonPrimitive(
        onClick = onClick,
        modifier = modifier,
        backgroundColor = OrbitTheme.colors.surface.normal,
        textColor = OrbitTheme.colors.content.normal,
        shape = RoundedCornerShape(6.dp),
        content = content
    )
}