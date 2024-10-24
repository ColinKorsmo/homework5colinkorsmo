package com.example.clickbaitapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clickbaitapp.data.DataSource
import com.example.clickbaitapp.model.Clickbait
import com.example.clickbaitapp.ui.theme.ClickbaitAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClickbaitAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ClickbaitApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClickbaitTopAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Top Headlines",
                style = MaterialTheme.typography.titleLarge
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewClickbaitItem() {
    ClickbaitItem(clickbait = DataSource.articles[0])
}

@Preview
@Composable
fun ClickbaitDarkThemePreview() {
    ClickbaitAppTheme(darkTheme = true) {
        ClickbaitApp()
    }
}

@Preview
@Composable
fun ClickbaitApp() {
    Scaffold(
        topBar = {
            ClickbaitTopAppBar()
        }
    ) { innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = innerPadding
        ) {
            items(DataSource.articles.size) { index ->
                ClickbaitItem(clickbait = DataSource.articles[index])
            }
        }
    }
}


@Composable
fun ClickbaitItem(clickbait: Clickbait) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .height(300.dp)
            .fillMaxWidth(),
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Image(
                painter = painterResource(clickbait.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.FillBounds
            )
            Text(
                text = stringResource(clickbait.titleResourceId),
                style = MaterialTheme.typography.labelLarge,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(8.dp)
                    .fillMaxWidth(),
            )
            Text(
                text = stringResource(clickbait.articleResourceId),
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 3, // made this as three due to it not working correctly at 4.
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxWidth(),
            )
            Spacer(
                modifier = Modifier.padding(8.dp)
            )
            Divider()
            Text(
                text = stringResource(clickbait.timeResourceId),
                style = MaterialTheme.typography.labelMedium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}


