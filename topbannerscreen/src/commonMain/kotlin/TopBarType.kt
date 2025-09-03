
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource

sealed class TopBarType(
    val textColor : Color = Color.Black,
    val backgroundColor : Color = Color.White,
    val icon : DrawableResource? = null,
    val message: String
) {

    data object Idle : TopBarType(message = "")

    data class SuccessMessage(
        val msg : String,
        val txtColor: Color = successTextColor,
        val bgColor: Color = successBackgroundColor,
        val icn: DrawableResource? = null
    ) : TopBarType(txtColor,bgColor,icn, message = msg)

    data class WarningMessage(
        val msg : String,
        val txtColor: Color = warningTextColor,
        val bgColor: Color = warningBackgroundColor,
        val icn: DrawableResource? = null
    ) : TopBarType(txtColor,bgColor,icn, message = msg)

    data class ErrorMessage(
        val msg : String,
        val txtColor: Color = errorTextColor,
        val bgColor: Color = errorBackgroundColor,
        val icn: DrawableResource? = null
    ) : TopBarType(txtColor,bgColor,icn, message = msg)

}



