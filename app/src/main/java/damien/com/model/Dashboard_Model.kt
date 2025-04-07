package damien.com.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class DashboardStat(
    val title: String,
    val value: String,
    val Icon:ImageVector,
    val background:Color

)

data class QuickAction(
    val title: String,
    val Icon:ImageVector
)