package com.example.clickbaitapp.data

import com.example.clickbaitapp.R
import com.example.clickbaitapp.model.Clickbait

object DataSource {
    val articles = listOf(
        Clickbait(
            imageResourceId = R.drawable.travel,
            titleResourceId = R.string.traveltitle,
            articleResourceId = R.string.travel,
            timeResourceId = R.string.traveltime
        ),
        Clickbait(
            imageResourceId = R.drawable.pet,
            titleResourceId = R.string.pettitle,
            articleResourceId = R.string.pet,
            timeResourceId = R.string.pettime
        ),
        Clickbait(
            imageResourceId = R.drawable.fantasy,
            titleResourceId = R.string.fantasytitle,
            articleResourceId = R.string.fantasy,
            timeResourceId = R.string.fantasytime
        ),
        Clickbait(
            imageResourceId = R.drawable.diy,
            titleResourceId = R.string.diytitle,
            articleResourceId = R.string.diy,
            timeResourceId = R.string.diytime
        ),
        Clickbait(
            imageResourceId = R.drawable.cartoons,
            titleResourceId = R.string.cartoonstitle,
            articleResourceId = R.string.cartoons,
            timeResourceId = R.string.cartoonstime
        ),
        Clickbait(
            imageResourceId = R.drawable.pizza,
            titleResourceId = R.string.pizzatitle,
            articleResourceId = R.string.pizza,
            timeResourceId = R.string.pizzatime
        ),
        Clickbait(
            imageResourceId = R.drawable.celebrity,
            titleResourceId = R.string.celebritytitle,
            articleResourceId = R.string.celebrity,
            timeResourceId = R.string.celebritytime
        ),
        Clickbait(
            imageResourceId = R.drawable.junkfood,
            titleResourceId = R.string.junkfoodtitle,
            articleResourceId = R.string.junkfood,
            timeResourceId = R.string.junkfoodtime
        ),
        Clickbait(
            imageResourceId = R.drawable.soulmate,
            titleResourceId = R.string.soulmatetitle,
            articleResourceId = R.string.soulmate,
            timeResourceId = R.string.soulmatetime
        ),
        Clickbait(
            imageResourceId = R.drawable.lifehacks,
            titleResourceId = R.string.lifehackstitle,
            articleResourceId = R.string.lifehacks,
            timeResourceId = R.string.lifehackstime
        ),
    )
}