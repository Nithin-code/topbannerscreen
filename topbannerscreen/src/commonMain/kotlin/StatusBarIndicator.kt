

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource

@Composable
fun StatusBar(
    modifier: Modifier = Modifier,
    message : String = "",
    maxLines : Int = 2,
    topBarType: TopBarType
){

    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = topBarType.backgroundColor)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        topBarType.icon?.let { icon->
            Icon(
                modifier = Modifier.size(24.dp),
                painter = painterResource(icon),
                contentDescription = topBarType.message,
                tint = topBarType.textColor
            )
        }



        Spacer(modifier = Modifier.width(16.dp))

        Text(
            text = topBarType.message,
            color = topBarType.textColor,
            textAlign = TextAlign.Center,
            maxLines = maxLines
        )

    }

}
