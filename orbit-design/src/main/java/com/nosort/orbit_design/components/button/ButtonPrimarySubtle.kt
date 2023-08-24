package com.nosort.orbit_design.components.button

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
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
        shape = RoundedCornerShape(6.dp)
    ) {
        Text(
            string = label,
            style = OrbitTheme.typography.bodyNormalMedium.copy(
                color = OrbitTheme.colors.primary.strong,
                textAlign = TextAlign.Center
            )
        )
    }
}