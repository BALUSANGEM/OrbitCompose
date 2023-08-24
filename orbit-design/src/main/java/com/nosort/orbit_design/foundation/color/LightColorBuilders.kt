package com.nosort.orbit_design.foundation.color

fun lightPrimaryColors(): FeatureColors = FeatureColors(
    normal = ColorsList.ProductNormal,
    onNormal = ColorsList.White,
    subtle = ColorsList.ProductLight,
    strong = ColorsList.ProductDark
)

fun lightSurfaceColors(): SurfaceColors = SurfaceColors(
    normal = ColorsList.CloudNormal
)

fun lightContentColors(): ContentColors = ContentColors(
    normal = ColorsList.InkDark
)

fun lightCriticalColors(): FeatureColors = FeatureColors(
    normal = ColorsList.RedNormal,
    //TODO Will be changed below colors as we progress
    onNormal = ColorsList.White,
    subtle = ColorsList.RedLight,
    strong = ColorsList.RedDark
)

fun lightColors() : Colors = Colors(
    primary = lightPrimaryColors(),
    surface = lightSurfaceColors(),
    content = lightContentColors(),
    critical = lightCriticalColors()
)