import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class TopBarViewModel : ViewModel() {

    var topBarState : TopBarType by mutableStateOf(TopBarType.Idle)


    fun displaySuccessMessage(message : String){
        topBarState = TopBarType.SuccessMessage(msg = message)
    }

    fun displayWarningMessage(message : String){
        topBarState = TopBarType.WarningMessage(msg = message)
    }

    fun displayErrorMessage(message: String){
        topBarState = TopBarType.ErrorMessage(msg = message)
    }

}


@Composable
fun rememberBannerState() : TopBarViewModel {
    return remember {
        TopBarViewModel()
    }
}