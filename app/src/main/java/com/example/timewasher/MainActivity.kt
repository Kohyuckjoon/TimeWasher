package com.example.timewasher

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.timewasher.ui.theme.TimeWasherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            CharacterLayout(
//                artistName = "Claude Monet",
//                lastSeenOnline = "Just now",
//                imageResource = R.drawable.outline_battery_profile_24
//            )
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen(
) {
    Column(
        modifier = Modifier
            .fillMaxSize() // Column이 화면 전체를 차지할수 있도록 설정
            .padding(horizontal = 24.dp)
            .padding(top = 100.dp), // 상단에 100.dp 여백 추가
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text (
                text = "Time Washer",
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                color = Color.DarkGray
            )
            Text (
                text = "N잡러를 위한 출장세차 앱",
                modifier = Modifier
                    .padding(top = 20.dp),
                fontSize = 18.sp
            )
        }

        Spacer(modifier = Modifier.height(100.dp))

        Column (
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column (
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text(text = "세차 맡기기", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(
                        text = "내 차에 맞는 워셔를 직접 선택하고 가격을 제안하세요.",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 10.dp),
                        color = Color.Blue
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
            ) {
                Column (
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text(
                        text = "세차 하기(N잡)",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "당신의 틈새 시간을 수익으로 만드세요.\n전문가가 아니어도 가능해요.",
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 10.dp),
                        color = Color.Blue
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TimeWasherTheme {
//        CharacterLayout(
//            artistName = "alfred Sisley",
//            lastSeenOnline = "3 minutes ago",
//            imageResource = R.drawable.outline_battery_profile_24
//        )
        HomeScreen()
    }
}