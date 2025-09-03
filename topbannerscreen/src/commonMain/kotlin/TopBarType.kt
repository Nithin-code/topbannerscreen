
import androidx.compose.ui.graphics.Color


sealed class TopBarType(
    val textColor : Color = Color.Black,
    val backgroundColor : Color = Color.White,
    val message: String
) {

    data object Idle : TopBarType(message = "")

    data class SuccessMessage(
        val msg : String,
        val txtColor: Color = successTextColor,
        val bgColor: Color = successBackgroundColor,
    ) : TopBarType(txtColor,bgColor, message = msg)

    data class WarningMessage(
        val msg : String,
        val txtColor: Color = warningTextColor,
        val bgColor: Color = warningBackgroundColor,
    ) : TopBarType(txtColor,bgColor, message = msg)

    data class ErrorMessage(
        val msg : String,
        val txtColor: Color = errorTextColor,
        val bgColor: Color = errorBackgroundColor,
    ) : TopBarType(txtColor,bgColor, message = msg)

}



