package com.test.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.jetpackcompose.ui.theme.JetpackComposeTheme
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color.White
                ) {
                    // LoginScreen()
                   // calendar()
                    //OnBoardingOneScreenPreview()
                    // Greeting("Android", "Learning jetpack compose")
                    TestingPreview()
                }
            }
        }
    }
}

@Composable
fun Greeting(img: Int, name: String, subtitle: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(8.dp)
            .clickable { }
    ) {
        Image(
            painter = painterResource(img),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(75.dp)
                .padding(8.dp)
                .clip(CircleShape)
                .border(0.5.dp, Color.DarkGray, CircleShape)
                .weight(.2f), contentDescription = ""
        )
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.weight(.8f)) {
            Text(
                text = "$name",
                style = MaterialTheme.typography.titleSmall,
                fontSize = 21.sp,
                color = Color.Black,
                textAlign = TextAlign.Right
            )
            Text(
                text = "$subtitle",
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Gray,
                textAlign = TextAlign.Right
            )
        }
    }
    Divider(
        modifier = Modifier
            .fillMaxWidth() // Stretch the line horizontally
            .height(0.5.dp) // Set the height to 1dp for a thin line
            .background(Color.Gray)
            .padding(20.dp)// Set the color of the line (optional)
    )
}

@Preview(heightDp = 500)
@Composable
fun TestingPreview() {
    Column {
        TopAppBar(
            title = { Text(text = "India Squad", fontSize = 20.sp, fontWeight = FontWeight.Medium) }, // Set the title text
            backgroundColor = Color.White,
            modifier = Modifier.height(60.dp),
            elevation = 7.dp,
            navigationIcon = { // Add the icon here
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack, // Replace with your desired icon
                        contentDescription = "Navigate back" // Set content description for accessibility
                    )
                }
            }
        )

        //Greeting(R.drawable.images,"Android", "Learning jetpack compose")
        LazyColumn(content = {
            items(getCategoryList()) {
                Greeting(img = it.img, name = it.name, subtitle = it.subtitle)
            }
        })


    }
}

data class Category(val img: Int, val name: String, val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.virat2, "Virat", "Right handed batsman"))
    list.add(Category(R.drawable.images, "Rahul", "Wicket keeper batsman"))
    list.add(Category(R.drawable.images, "Iyer", "Right handed batsman"))
    list.add(Category(R.drawable.images, "Gill", "Right handed batsman"))
    list.add(Category(R.drawable.images, "Jaiswal", "Left handed batsman"))
    list.add(Category(R.drawable.images, "Patidar", "Right handed batsman"))
    list.add(Category(R.drawable.images, "Siraj", "Fast bowler"))
    list.add(Category(R.drawable.images, "Jadeja", "Bating allrounder"))
    list.add(Category(R.drawable.images, "Pant", "Wicket keeper batsman"))
    list.add(Category(R.drawable.images, "Ishan", "Wicket keeper batsman"))
    list.add(Category(R.drawable.images, "Rohit", "Right handed batsman"))
    list.add(Category(R.drawable.images, "Samson", "Wicket keeper batsman"))
    list.add(Category(R.drawable.images, "Tripathi", "Right handed batsman"))
    list.add(Category(R.drawable.images, "Bumrah", "Fast bowler"))
    list.add(Category(R.drawable.images, "Yuzi", "Spin bowler"))
    list.add(Category(R.drawable.images, "Kuldeep", "Spin bowler"))
    list.add(Category(R.drawable.images, "Shami", "Fast bowler"))
    list.add(Category(R.drawable.images, "Axar", "Bowling allrounder"))
    list.add(Category(R.drawable.images, "Ruturaj", "Right handed batsman"))
    list.add(Category(R.drawable.images, "Rinku", "Left handed batsman"))
    list.add(Category(R.drawable.images, "Jurel", "Wicket keeper batsman"))
    list.add(Category(R.drawable.images, "Bharat", "Wicket keeper batsman"))

    return list
}

