package com.nosort.orbit_design.components.button

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nosort.orbit_design.OrbitTheme

@Composable
fun ButtonCriticalSubtle(
    onClick: () -> Unit,
    modifier: Modifier,
    content: @Composable RowScope.() -> Unit
) {
    ButtonPrimitive(
        onClick = onClick,
        modifier = modifier,
        backgroundColor = OrbitTheme.colors.critical.subtle,
        textColor =  OrbitTheme.colors.critical.strong,
        shape = RoundedCornerShape(6.dp),
        content = content
    )
}