package com.folashade.soothe.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.folashade.soothe.R


@Composable
fun FavoriteCollectionsGrid(
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(168.dp)
    ) {
        items(favoriteCollectionsData) { item ->
            FavoriteCollectionCard(item.text, item.image, Modifier.height(80.dp))
        }
    }
}


private val favoriteCollectionsData = listOf(
    R.drawable.fc1_short_mantras to R.string.mantra,
    R.drawable.fc2_nature_meditations to R.string.nature,
    R.drawable.fc3_stress_and_anxiety to R.string.stress,
    R.drawable.fc4_self_massage to R.string.massage,
    R.drawable.fc5_overwhelmed to R.string.overwhelm,
    R.drawable.fc6_nightly_wind_down to R.string.wind
).map { DrawableStringPair(it.first, it.second) }

