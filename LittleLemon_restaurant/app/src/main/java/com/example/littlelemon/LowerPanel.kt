package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LowerPanel(dishList: List<DishModel>)
{
    LowerPanelCard(dish = dishList[0])
}

@Composable
fun LowerPanelCard(dish: DishModel)
{
    Card{
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ){
            Column {
                Text(
                    text = dish.name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )

                Text(
                    text = dish.description,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(0.75f),
                    color = Color.Gray
                )

                Text(
                    text = dish.price,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
            }

            Image(
                painter = painterResource(dish.image),
                contentDescription = dish.imageDescript
            )
        }
    }
}

/*@Preview
@Composable
fun LowerPanelPreview()
{
    LowerPanelCard()
}*/