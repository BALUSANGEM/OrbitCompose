package com.nosort.orbit_design.components.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nosort.orbit_design.OrbitTheme
import com.nosort.orbit_design.components.Text

@Composable
fun ButtonPrimarySubtle(
    onClick: () -> Unit,
    modifier: Modifier,
    label: String,
) {
    ButtonPrimitive(
        onClick = onClick,
        modifier = modifier,
        backgroundColor = OrbitTheme.colors.primary.subtle,
        textColor = OrbitTheme.colors.primary.strong,
        shape = RoundedCornerShape(6.dp)
    ) {
        Text(string = label)
    }
}