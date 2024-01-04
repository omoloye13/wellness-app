package com.folashade.soothe.navigations

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle


import androidx.compose.material.icons.outlined.Home

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.core.content.ContextCompat
import com.folashade.soothe.R


@Composable
 fun SootheBottomNavigation(
    modifier : Modifier = Modifier
){
    NavigationBar (
        containerColor = Color(ContextCompat.getColor(LocalContext.current, R.color.green)),
        modifier = modifier
    ) {
        NavigationBarItem(
            icon = {
                Icon(

                    imageVector = Icons.Outlined.Home,
                    contentDescription = null
                )
            },
            label = {
                Text(text = stringResource(R.string.bottomNavigationHome))
            },
        selected = true,
            onClick = {}
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null
                )
            },
            label = {
                Text(text = stringResource(R.string.bottomNavigationProfile))
            },
            selected = false,
            onClick = {}
        )
    }

}