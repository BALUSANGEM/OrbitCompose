package com.nosort.orbit_design.components

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle

@Composable
fun Text(string: AnnotatedString,style: TextStyle) {
    BasicText(string, style = style)
}

@Composable
fun Text(string: String, style: TextStyle) {
    Text(AnnotatedString(string), style)
}