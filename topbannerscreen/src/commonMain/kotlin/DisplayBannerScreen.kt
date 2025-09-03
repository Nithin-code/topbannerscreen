import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun DisplayBannerScreen(
    modifier: Modifier = Modifier,
    state : TopBarViewModel,
    displayBannerForMillis : Long = 2000L,
    content : @Composable () -> Unit,
){

    val positionY = animateIntAsState(
        targetValue = if (state.topBarState == TopBarType.Idle) -200 else 0,
        animationSpec = tween(durationMillis = 600)
    )

    LaunchedEffect(state.topBarState) {
        delay(displayBannerForMillis)
        state.topBarState = TopBarType.Idle
    }

    Scaffold { padding->

        Box(
            modifier = modifier
                .padding(top = padding.calculateTopPadding() , bottom = padding.calculateBottomPadding())
        ){
            content.invoke()

            StatusBar(
                modifier = Modifier
                    .offset(
                        x = 0.dp,
                        y = positionY.value.dp
                    )
                    .height(50.dp),
                topBarType = state.topBarState
            )


        }


    }

}