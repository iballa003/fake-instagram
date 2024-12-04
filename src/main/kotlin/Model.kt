import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings

data class Sugerencia(val name : String, val fotoPerfil: String)
val Sugerencias = listOf<Sugerencia>(
    Sugerencia("Persona1","default-profile.jpg"),
    Sugerencia("Persona2","default-profile.jpg"),
    Sugerencia("Persona3","default-profile.jpg"),
    Sugerencia("Persona4","default-profile.jpg"),
    Sugerencia("Persona5","default-profile.jpg"),
)

data class Publicacion(val autor : String, val descripcion: String, val foto: String, val fotoPerfil: String)
val historias = listOf("default-profile.jpg", "default-profile.jpg", "default-profile.jpg", "default-profile.jpg", "default-profile.jpg", "default-profile.jpg", "default-profile.jpg", "default-profile.jpg")

const val descripcion = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas odio augue, sagittis ut fermentum ac, pellentesque vitae erat."

val publicaciones = listOf<Publicacion>(
    Publicacion("Persona1", descripcion, "default-photo.png", "default-profile.jpg"),
    Publicacion("Persona2", descripcion, "default-photo.png", "default-profile.jpg"),
)

data class Foto(val image: String)
val Fotos = listOf<Foto>(
    Foto("default-profile.jpg"),
    Foto("default-profile.jpg"),
    Foto("default-profile.jpg"),
    Foto("default-profile.jpg"),
    Foto("default-profile.jpg"),
    Foto("default-profile.jpg"),
    Foto("default-profile.jpg"),
    Foto("default-profile.jpg"),
)
