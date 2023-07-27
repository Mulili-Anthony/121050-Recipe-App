package com.example.recipeapp

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recipeapp.ui.theme.RecipeAppTheme
import androidx.compose.ui.graphics.Color
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fun RecipeApp() {
            MaterialTheme {

                Button(
                    onClick = {  },

                    contentPadding = PaddingValues(
                        start = 20.dp,
                        top = 12.dp,
                        end = 20.dp,
                        bottom = 12.dp
                    )
                ) {

                    @Composable
                    Icon(
                        Icons.Filled.Favorite,
                        contentDescription = "Favorite",
                        modifier = Modifier.size(ButtonDefaults.IconSize)
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text("Like")
                }
                @Composable
                val imageModifier = Modifier
                    .size(150.dp)
                    .border(BorderStroke(1.dp, Color.Black))
                    .background(Color.WHITE)
                Image(
                    painter = painterResource(id = ),
                    contentDescription = stringResource(id = ),
                    contentScale = ContentScale.Fit,
                    modifier = imageModifier
                )
            }


        }

    }

}





