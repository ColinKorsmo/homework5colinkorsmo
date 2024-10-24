package com.example.clickbaitapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Clickbait(
    @DrawableRes val imageResourceId: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val articleResourceId: Int,
    @StringRes val timeResourceId: Int
)
