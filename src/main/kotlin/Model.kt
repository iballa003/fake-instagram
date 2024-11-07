import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings


data class Message(val name : String, val message: String, val foto: String, val fotoPerfil: String)
val body = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas odio augue, sagittis ut fermentum ac, pellentesque vitae erat. Etiam vehicula vehicula congue. Donec quis nulla luctus, consectetur dolor a, efficitur nisl. Pellentesque aliquam rhoncus ultricies. Sed sed felis risus. Vivamus iaculis metus id tincidunt vehicula. Vestibulum congue placerat sapien ac auctor. In commodo finibus purus, eget finibus sapien consectetur nec. Vivamus dictum quis nisl vel blandit. Ut erat risus, ornare eget sodales a, semper quis sem. Donec volutpat tempor libero in luctus. Mauris ac fermentum leo. Nulla quis semper augue. Praesent a viverra risus, et mollis augue. Proin mattis tortor quis enim pretium placerat."

val publicaciones = listOf<Message>(
    Message("Persona1", body, "img.jpeg", "img.jpeg"),
    Message("Persona2", body, "img2.jpeg", "img2.jpeg"),
    Message("Persona3", body, "img3.jpeg", "img3.jpeg"),
    Message("Persona4", body, "img4.jpeg", "img4.jpeg")
)

val items = listOf(
    "Home" to Icons.Default.Home,
    "Search" to Icons.Default.Search,
    "Settings" to Icons.Default.Settings,
)