package com.example.littlelemon

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UpperPanel()
{
    val context = LocalContext.current
    Column (
        modifier = Modifier.background(color = Color(0xFF495E57))
    ){
        Text(
            text = stringResource(id = R.string.littleLemon),
            fontSize = 50.sp, color = Color(0xFFF4CE14),
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(start = 8.dp)
        )

        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = 30.sp, color = Color(0xFFEDEFEE),
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(start = 8.dp)
        )
        Row(modifier = Modifier.padding(start = 8.dp, top = 14.dp)) {
            Text(
                text = stringResource(id = R.string.restaurant_description),
                fontSize = 18.sp, color = Color(0xFFFFFFFF),
                modifier = Modifier
                    .weight(1.25f)
                    .padding(end = 25.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.dessert),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(0.75f)
                    .padding(end = 10.dp)
                    .size(150.dp)
                    .aspectRatio(4f / 4.5f)
                    .clip(RoundedCornerShape(16.dp))
            )
        }
        TextButton(
            onClick = {
                Toast.makeText(context,"Your Reservation Is Done!", Toast.LENGTH_SHORT).show()
            },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF4CE14)
            ),
            modifier = Modifier
                .padding(start = 8.dp, bottom = 20.dp)
                .width(160.dp)
        ) {
            Text(
                text = stringResource(id = R.string.reserve_a_table),
                style = TextStyle(fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000), fontSize = 16.sp)
            )
        }
    }
}
@Preview
@Composable
fun UpperPanelPreview()
{
    UpperPanel()
}
