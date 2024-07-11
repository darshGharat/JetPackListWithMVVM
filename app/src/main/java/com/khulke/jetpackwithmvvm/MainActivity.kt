package com.khulke.jetpackwithmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.khulke.jetpackwithmvvm.screens.CategoryScreen
import com.khulke.jetpackwithmvvm.screens.TwittScreen
import com.khulke.jetpackwithmvvm.ui.theme.JetPackWithMVVMTheme
import dagger.hilt.android.AndroidEntryPoint

@OptIn(ExperimentalMaterial3Api::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Scaffold(topBar = {
                TopAppBar(
                    title = { Text(text = "Twitts", color = Color.White) },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = Color.Black,
                    ),
                    modifier = Modifier
                        .background(Color.Black)
                        .fillMaxWidth()
                )
            }) {
                Box(modifier = Modifier.padding(it)) {
                    App()
                }
            }

        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "category_list") {
        composable(route = "category_list") {
            CategoryScreen {
                navController.navigate("twitts/$it")
            }
        }
        composable(route = "twitts/{category}", arguments = listOf(
            navArgument("category") {
                type = NavType.StringType
            }
        )) {
            TwittScreen()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackWithMVVMTheme {
        Greeting("Android")
    }
}