package com.micahnyabuto.streamflix.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.PointerIcon

data class BottomNavigationItem(
    val title :String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,


)
