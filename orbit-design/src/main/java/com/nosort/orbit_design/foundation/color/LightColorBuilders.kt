package com.nosort.orbit_design.foundation.color

fun lightPrimaryColors() : FeatureColors = FeatureColors(
    normal = ColorsList.ProductNormal,
    onNormal = ColorsList.White,
    subtle = ColorsList.ProductLight,
    strong = ColorsList.ProductDark
)

fun lightSurfaceColors() : SurfaceColors = SurfaceColors(
    normal = ColorsList.CloudNormal
)

fun lightContentColors() : ContentColors = ContentColors(
    normal = ColorsList.InkDark
)

fun lightColors() : Colors = Colors(
    primary = lightPrimaryColors(),
    surface = lightSurfaceColors(),
    content = lightContentColors()
)