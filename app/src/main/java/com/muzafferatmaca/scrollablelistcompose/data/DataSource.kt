package com.muzafferatmaca.scrollablelistcompose.data

import com.muzafferatmaca.scrollablelistcompose.R
import com.muzafferatmaca.scrollablelistcompose.domain.entity.Affirmation

/**
 * Created by Muzaffer Atmaca on 5.06.2024 at 15:34
 */
class DataSource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation2, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation3, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation4, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation5, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation6, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation7, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation8, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation9, R.drawable.ic_launcher_foreground),
            Affirmation(R.string.affirmation10, R.drawable.ic_launcher_foreground))
    }
}