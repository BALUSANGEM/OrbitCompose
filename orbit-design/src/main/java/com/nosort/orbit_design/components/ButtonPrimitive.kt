package com.nosort.orbit_design.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nosort.orbit_design.OrbitTheme
import com.nosort.orbit_design.foundation.ButtonDefaults
import com.nosort.orbit_design.foundation.ButtonDefaults.ContentPadding
import com.nosort.orbit_design.foundation.ButtonDefaults.horizontalArrangement

@Composable
fun ButtonPrimitive(
    onClick: () -> Unit,
    backgroundColor: Color,
    shape: Shape,
    modifier: Modifier = Modifier,
    contentArrangement: Arrangement.Horizontal = horizontalArrangement,
    content: @Composable RowScope.() -> Unit
) {
    Box(
        modifier = modifier
            .clip(shape)
            .background(backgroundColor)
            .clickable(
                onClick = onClick,
                onClickLabel = null,
                role = Role.Button
            ),
        propagateMinConstraints = true,
    ) {
        Row(
            modifier = Modifier
                .defaultMinSize(
                    minWidth = ButtonDefaults.minWidth,
                    minHeight = ButtonDefaults.minHeight
                )
                .padding(ContentPadding),
            horizontalArrangement = contentArrangement,
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

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

@Preview()
@Composable
fun ButtonPrimaryPreview() {
    val mW = Modifier.fillMaxWidth();
    Column(modifier = mW) {
        ButtonPrimary(onClick = {}, mW, label = "Primary")
        ButtonPrimarySubtle(onClick = {}, mW, label = "Subtle")
    }
}
