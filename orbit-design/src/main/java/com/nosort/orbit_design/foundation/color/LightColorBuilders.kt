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

fun lightColors() : Colors = Colors(primary = lightPrimaryColors(), surface = lightSurfaceColors())