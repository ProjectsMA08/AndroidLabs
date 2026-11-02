package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreen()
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {

        // Заголовок
        Text("CardioGuard", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Профиль")

        Spacer(modifier = Modifier.height(16.dp))

        // Фото (просто серый круг) и имя
        Row {
            Box(
                modifier = Modifier
                    .size(70.dp)
                    .background(Color.LightGray, CircleShape)
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text("Сергей Викторович", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text("ID: CG-8492-RUS")
                Text("ИБС / риск аритмии", color = Color.Red)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Данные пациента
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text("Возраст")
                Text("58 лет", fontWeight = FontWeight.Bold)
            }
            Column {
                Text("Группа")
                Text("II (A) Rh+", fontWeight = FontWeight.Bold)
            }
            Column {
                Text("Вес")
                Text("76 кг", fontWeight = FontWeight.Bold)
            }
            Column {
                Text("Рост")
                Text("174 см", fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Устройство
        Text("CardioBand v4", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text("BLE подключен, телеметрия LIVE")
        Text("Заряд: 88%")
        Text("ЭКГ: непрерывный замер")
        Text("Кислород SpO2: 97%, оптимально")

        Spacer(modifier = Modifier.height(24.dp))

        // Индекс риска
        Text("Индекс риска", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text("18% (низкий)", color = Color(0xFF2E7D32))
        Text("Суточный прогноз: контролируемо")

        Spacer(modifier = Modifier.height(24.dp))

        // Лекарства
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text("Лекарства", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text("3 из 4")
        }
        Text("Бисопролол 5мг")
        Text("Кардиомагнил")
        Text("Аторвастатин", color = Color.Red)

        Button(onClick = { }) {
            Text("Открыть график")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Экстренная сеть
        Text("Экстренная сеть CardioSOS", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text("Активно", color = Color(0xFF2E7D32))

        // Красный прямоугольник с текстом
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .background(Color(0xFFFFCDD2))
                .padding(12.dp)
        ) {
            Text("Телеметрия активна при угрозе инфаркта: автодозвон и отправка координат в Скорую помощь 112.")
        }

        Text("Анна С. (Дочь) - основной")
        Text("+7 (916) •••-44-12")
        Spacer(modifier = Modifier.height(8.dp))
        Text("Михаил С. (Сын) - резервный")
        Text("+7 (903) •••-88-91")

        Button(onClick = { }) {
            Text("Проверить тестовый сигнал оповещения")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Кардиолог
        Text("Лечащий кардиолог", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text("Д-р Романова Е.А., НМИЦК")
    }
}