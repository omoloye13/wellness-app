package com.folashade.soothe.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

 data class DrawableStringPair(
    @DrawableRes val image: Int,
    @StringRes val text: Int
)