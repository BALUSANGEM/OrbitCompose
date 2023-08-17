package com.nosort.orbit_design.foundation.color

fun lightPrimaryColors() : FeatureColors = FeatureColors(
    normal = ColorsList.ProductNormal,
    onNormal = ColorsList.White,
    subtle = ColorsList.ProductLight,
    strong = ColorsList.ProductDark
)

fun lightColors() : Colors = Colors(primary = lightPrimaryColors())