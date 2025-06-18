package com.pqd.sciencefunfactsapp.model

import com.pqd.sciencefunfactsapp.R

object FunFactData {
    val facts = listOf(
        FunFact(
            title = "Water is weird!",
            description = "Water expands when it freezes.",
            imageResId = R.drawable.ic_launcher_background
        ),
        FunFact(
            title = "Sun is loud!",
            description = "If space had air, we'd hear the sun.",
            imageResId = R.drawable.ic_launcher_background
        ),
        FunFact(
            title = "Bananas are berries?",
            description = "But strawberries aren't!",
            imageResId = R.drawable.ic_launcher_background
        )
    )
}
