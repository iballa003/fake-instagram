import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings

data class Sugerencia(val name : String, val fotoPerfil: String)
val Sugerencias = listOf<Sugerencia>(
    Sugerencia("Persona1","img.jpeg"),
    Sugerencia("Persona2","img.jpeg"),
    Sugerencia("Persona3","img.jpeg"),
    Sugerencia("Persona4","img.jpeg"),
    Sugerencia("Persona5","img.jpeg"),
)

data class Publicacion(val name : String, val message: String, val foto: String, val fotoPerfil: String)
val historias = listOf("historia1.jpeg", "historia2.jpeg", "historia3.jpeg", "historia4.jpeg", "historia5.jpeg")
val descripcion = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas odio augue, sagittis ut fermentum ac, pellentesque vitae erat."

val publicaciones = listOf<Publicacion>(
    Publicacion("Persona1", descripcion, "img.jpeg", "img.jpeg"),
    Publicacion("Persona2", descripcion, "img2.jpeg", "img2.jpeg"),
    Publicacion("Persona3", descripcion, "img3.jpeg", "img3.jpeg"),
    Publicacion("Persona4", descripcion, "img4.jpeg", "img4.jpeg")
)
