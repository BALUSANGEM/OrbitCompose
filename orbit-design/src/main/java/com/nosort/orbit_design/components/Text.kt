package com.nosort.orbit_design.components

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString

@Composable
fun Text(string: AnnotatedString) {
    BasicText(string)
}

@Composable
fun Text(string: String) {
    BasicText(AnnotatedString(string))
}