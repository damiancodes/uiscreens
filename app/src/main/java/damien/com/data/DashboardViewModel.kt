package damien.com.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import damien.com.model.DashboardStat
import damien.com.model.QuickAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashboardViewModel : ViewModel() {

    private val _stat = MutableStateFlow(
        listOf(
            DashboardStat(title = "Revenue", value = "1200", Icons.Default.Phone, Color.Cyan),
            DashboardStat(title = "Profit", value = "800",  Icons.Default.Phone, Color.Green)
        )
    )
    val stat: StateFlow<List<DashboardStat>> = _stat

    private val _quickAction = MutableStateFlow(
        listOf(
            QuickAction(title = "Add new User", Icons.Default.Person),
            QuickAction(title = "Create Account",  Icons.Default.AccountCircle),
            QuickAction(title = "Settings", Icons.Default.Settings)
        )
    )
    val quickAction: StateFlow<List<QuickAction>>get() =  _quickAction
}
