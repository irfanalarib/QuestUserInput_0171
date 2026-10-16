package com.example.praktikum_5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier : Modifier) {
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember {mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}

    //VARIANEL- VARIABEL UNTUK MENYIMOAN DATA YANG DIPEROLEH DARI KOMPONEN UI
    var nama by remember {mutableStateOf("")}
    var alamat by remember {mutableStateOf("")}
    var jenis by remember {mutableStateOf("")}
    var gender:List<String> = listOf ("Laki-Laki", "Perempuan")

    Column (modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.padding(250.dp),
            label = {Text(text = "Nama Lengkap")},
            onValueChange = {
                textNama = it
            }
        )
    }
}
