package com.folashade.soothe.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.folashade.soothe.R
import com.folashade.soothe.components.AlignYourBodyRow
import com.folashade.soothe.components.FavoriteCollectionsGrid
import com.folashade.soothe.components.HomeSection
import com.folashade.soothe.components.SearchBar


@Composable
fun HomeScreen (
    modifier : Modifier = Modifier
){
    Column(
        modifier
            .verticalScroll(rememberScrollState())
    ){
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.body) {
            AlignYourBodyRow()
        }
        HomeSection(title = R.string.favorite) {
            FavoriteCollectionsGrid()
        }
        Spacer(modifier = Modifier.height(16.dp))

    }
}