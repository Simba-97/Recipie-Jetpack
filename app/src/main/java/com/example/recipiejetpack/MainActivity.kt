package com.example.recipiejetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipiejetpack.ui.theme.RecipieJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Image(
                    painterResource(id = R.drawable.burger2),
                    contentDescription = null,
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop,
                )
                Column() {
                    Row(
                        modifier = Modifier.padding(16.dp),
                    ) {
                        Text(text = "Happy Meal",
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 32.sp
                        )
                        Spacer(modifier = Modifier.padding(top = 10.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.End,
                            text = "$5.99",
                            fontFamily = FontFamily.Monospace,
                            color = Color.Green,
                            fontSize = 20.sp
                        )
                    }
                    Text(
                        modifier = Modifier.padding(start = 16.dp),
                        text = "800 calories",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Monospace,
                        fontStyle = FontStyle.Italic
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "Order Now")
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RecipieJetpackTheme {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Image(
                painterResource(id = R.drawable.burger2),
                contentDescription = null,
                modifier = Modifier.height(300.dp),
                contentScale = ContentScale.Crop,
            )
            Column() {
                Row(
                    modifier = Modifier.padding(16.dp),
                ) {
                    Text(text = "Happy Meal",
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 32.sp
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.End,
                        text = "$5.99",
                        fontFamily = FontFamily.Monospace,
                        color = Color.Green,
                        fontSize = 20.sp
                    )
                }
                Text(
                    modifier = Modifier.padding(start = 16.dp),
                    text = "800 calories",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace,
                    fontStyle = FontStyle.Italic
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text(text = "Order Now")
                }
            }

        }

    }
}