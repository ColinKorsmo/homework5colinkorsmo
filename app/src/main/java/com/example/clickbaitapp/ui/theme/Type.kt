package com.example.clickbaitapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.clickbaitapp.R

val Coustard = FontFamily(
    Font(R.font.coustard_black)
)
val Gowun = FontFamily(
    Font(R.font.gowunbatang_regular)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Coustard,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Gowun,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = Coustard,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    ),
    titleLarge = TextStyle(
        fontFamily = Gowun,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Gowun,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    )
)
