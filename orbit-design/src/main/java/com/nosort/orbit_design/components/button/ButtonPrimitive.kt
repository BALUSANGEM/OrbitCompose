package com.nosort.orbit_design.components.button

import androidx.compose.foundation.Image
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.nosort.orbit_design.OrbitTheme
import com.nosort.orbit_design.components.Text
import com.nosort.orbit_design.foundation.ButtonDefaults
import com.nosort.orbit_design.foundation.ButtonDefaults.ContentPadding
import com.nosort.orbit_design.foundation.ButtonDefaults.horizontalArrangement
import com.nosort.orbit_design.foundation.LocalTextStyle

@Composable
fun ButtonPrimitive(
    onClick: () -> Unit,
    backgroundColor: Color,
    shape: Shape,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = OrbitTheme.typography.bodyNormalMedium,
    textColor: Color = Color.Unspecified,
    contentArrangement: Arrangement.Horizontal = horizontalArrangement,
    content: @Composable RowScope.() -> Unit
) {
    val contentStyle = textStyle.copy(color = textColor)
    CompositionLocalProvider(
        LocalTextStyle provides contentStyle
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
}

@Preview()
@Composable
fun ButtonPrimaryPreview() {
    val mW = Modifier.fillMaxWidth();
    Column(modifier = mW) {
        ButtonPrimary(onClick = {}, mW) {
            Text(string = "Primary")
        }
        ButtonPrimary(onClick = {}, mW) {
            Image(painter = painterResource(id = com.google.android.material.R.drawable.ic_arrow_back_black_24), contentDescription = "Launcher icon")
            Text(string = "Primary")
        }
        ButtonPrimarySubtle(onClick = {}, mW) {
            Text(string = "Subtle")
        }
        ButtonSecondary(onClick = {}, mW) {
            Text(string = "Secondary")
        }
        ButtonCritical(onClick = {}, mW) {
            Text(string = "Critical")
        }
        ButtonCriticalSubtle(onClick = {}, mW) {
            Text(string = "Critical Subtle")
        }
    }
}
