package com.muzafferatmaca.scrollablelistcompose.domain.entity

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Created by Muzaffer Atmaca on 5.06.2024 at 15:34
 */
data class Affirmation (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)