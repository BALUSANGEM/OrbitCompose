package com.nosort.orbit_design.components

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import com.nosort.orbit_design.foundation.LocalTextStyle

@Composable
fun Text(string: AnnotatedString,style: TextStyle = LocalTextStyle.current) {
    BasicText(string, style = style)
}

@Composable
fun Text(string: String, style: TextStyle = LocalTextStyle.current) {
    Text(AnnotatedString(string), style)
}