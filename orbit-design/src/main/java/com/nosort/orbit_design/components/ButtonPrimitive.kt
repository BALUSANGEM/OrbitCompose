package com.nosort.orbit_design.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import com.nosort.orbit_design.components.ButtonDefaults.ContentPadding
import com.nosort.orbit_design.components.ButtonDefaults.horizontalArrangement

@Composable
fun ButtonPrimitive(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    Box(modifier = modifier.background(Color.Blue)) {
        Row(
            modifier = Modifier.defaultMinSize(
                minWidth = ButtonDefaults.minWidth,
                minHeight = ButtonDefaults.minHeight
            ).padding(ContentPadding),
            horizontalArrangement = horizontalArrangement,
            verticalAlignment = Alignment.CenterVertically,
            content = content
        )
    }
}

@Composable
fun Text(string: AnnotatedString) {
    BasicText(string)
}

@Composable
fun Text(string: String) {
    BasicText(AnnotatedString(string))
}

@Preview()
@Composable
fun ButtonPrimitivePreview() {
    ButtonPrimitive {
        Text("Primitive Button")
    }
}
