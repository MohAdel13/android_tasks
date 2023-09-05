package com.example.littlelemon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    private var dishList: List<DishModel> = listOf()
    private lateinit var dish: DishModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val name = getString(R.string.greek_salad)
        val description = getString(R.string.greek_salad_description)
        val price = getString(R.string._12_99)
        val image = R.drawable.salad
        val imageDescript = getString(R.string.greek_salad)
        dish = DishModel(name, description, price, image, imageDescript)
        dishList += dish
        setContent {
            HomeScreen()
        }
    }

    @Composable
    fun HomeScreen()
    {
        Column {
            UpperPanel()
            LowerPanel(dishList = dishList)
        }
    }
}

