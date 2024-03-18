package com.test.jetpackcompose

import android.icu.util.Calendar
import android.widget.CalendarView
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun calendar() {

//
//    Row(
//        modifier = Modifier
//            .padding(6.dp),
//        verticalAlignment = Alignment.Top
//    ) {
//
//        AndroidView(
//            { CalendarView(it) },
//            modifier = Modifier.wrapContentWidth().border(1.dp,Color.Black, RectangleShape),
//            update = { views ->
//                views.setOnDateChangeListener { _, year, month, dayOfMonth ->
//                    val cal = Calendar.getInstance()
//                    cal.set(year, month, dayOfMonth)
//
//                }
//            }
//        )
//
//        Text(
//            text = "Today",
//            modifier = Modifier
//                .wrapContentWidth(),
//            fontFamily = FontFamily.Default,
//            fontWeight = FontWeight.SemiBold,
//            fontSize = 10.sp,
//            color = Color(0xFF0A70C4),
//            textAlign = TextAlign.Center,
//        )
//
//    }


    var selectedDate by remember { mutableStateOf(Calendar.getInstance()) }
    var showDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Selected Date: ${selectedDate.time}",
            style = MaterialTheme.typography.body1,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(onClick = { showDialog = true }) {
            Text(text = "Select Date")
        }
        if (showDialog) {
            DatePickerDialog(onDismissRequest = { /*TODO*/ }, confirmButton = { /*TODO*/ }) {
                
            }
//            DatePicker(
//                state = DatePickerState(),
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(1.dp)
//            )
        }
    }
}


@Preview
@Composable
fun preview() {
    calendar()
}