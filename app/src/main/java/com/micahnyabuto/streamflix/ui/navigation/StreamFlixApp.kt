package com.micahnyabuto.streamflix.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun StreamFlixApp(){
    val items= listOf(
        BottomNavigationItem(
            title = "Home",
            selectedIcon = Icons.Filled.Home,
            unselectedIcon = Icons.Filled.Home,
        ),
        BottomNavigationItem(
            title = "Movies",
            selectedIcon = Icons.Filled.Movie,
            unselectedIcon = Icons.Filled.Movie,

        ),
        BottomNavigationItem(
            title = "Watchlist",
            selectedIcon = Icons.Filled.Bookmark,
            unselectedIcon = Icons.Filled.Bookmark,

        ),

        BottomNavigationItem(
            title = "Settings",
            selectedIcon = Icons.Filled.Settings,
            unselectedIcon = Icons.Filled.Settings,

        ),


    )
    var selectedItemIndex by rememberSaveable { mutableStateOf(0) }
    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index,item ->
                    NavigationBarItem(
                        selected = selectedItemIndex==index,
                        onClick = {
                            selectedItemIndex= index
                        },
                        label = {
                            Text(text= item.title)
                        },
                        icon = {
                            Icon(
                                imageVector = if(index== selectedItemIndex){
                                    item.selectedIcon
                                }else item.unselectedIcon,
                                contentDescription = item.title
                            )
                        }
                    )

                }

            }
        }
    ) {  }
}