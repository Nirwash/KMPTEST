package com.example.kmptest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.example.kmptest.theme.AppTheme
import com.icerockdev.library.SharedRes
import dev.icerock.moko.resources.ImageResource



@Composable
internal fun App() = AppTheme {
   Box(
       modifier = Modifier.fillMaxSize(),
       contentAlignment = Alignment.Center
   ) {
       Image(
           modifier = Modifier.size(300.dp).padding(top = 16.dp),
           painter = dev.icerock.moko.resources.compose.painterResource(SharedRes.images.wind),
           contentDescription = null,
       )
       Text(
           dev.icerock.moko.resources.compose.stringResource(SharedRes.strings.hello_world)
       )

   }

}

