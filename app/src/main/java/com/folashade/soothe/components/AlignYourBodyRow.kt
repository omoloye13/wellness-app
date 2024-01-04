package com.folashade.soothe.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.folashade.soothe.R




@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ){

        items(alignYourBodyData){ item ->
            AlignYourBodyElement(item.image , item.text  )

        }

    }

}


private val alignYourBodyData = listOf(
    R.drawable.ab1_inversions to R.string.inversions,
    R.drawable.ab2_quick_yoga to R.string.yoga,
    R.drawable.ab3_stretching to R.string.stretching,
    R.drawable.ab4_tabata to R.string.tabata,
    R.drawable.ab5_hiit to R.string.hiit,
    R.drawable.ab6_pre_natal_yoga to R.string.pre
).map { DrawableStringPair(it.first, it.second) }


//private data class DrawableStringPair(
//    @DrawableRes val image: Int,
//    @StringRes val text: Int
//)