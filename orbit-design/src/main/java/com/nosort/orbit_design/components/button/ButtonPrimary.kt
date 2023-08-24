package com.nosort.orbit_design.components.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nosort.orbit_design.OrbitTheme
import com.nosort.orbit_design.components.Text

@Composable
fun ButtonPrimary(
    onClick: () -> Unit,
    modifier: Modifier,
    label: String,
) {
    ButtonPrimitive(
        onClick = onClick,
        modifier = modifier,
        backgroundColor = OrbitTheme.colors.primary.normal,
        shape = RoundedCornerShape(6.dp)
    ) {
        Text(
            string = label,
            style = OrbitTheme.typography.bodyNormalMedium.copy(color = OrbitTheme.colors.primary.onNormal)
        )
    }
}