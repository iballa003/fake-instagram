import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun App() {
    Column(modifier = Modifier.padding(start = 15.dp, top = 5.dp, end = 25.dp)) {
        Text(text = "Instagram", fontSize = TextUnit(value = 28f, type = TextUnitType.Sp), fontWeight = FontWeight.Bold)
        Text(text = "Historias", fontSize = TextUnit(value = 18f, type = TextUnitType.Sp))
        Row(modifier = Modifier.padding(start = 15.dp), horizontalArrangement = Arrangement.spacedBy(15.dp)) {
            historias.forEach { historia ->
                Box(modifier = Modifier.width(50.dp).height(50.dp)){
                    Image(painter = painterResource(resourcePath = (historia)),
                        contentDescription = "perfil",
                        modifier = Modifier.clip(
                        CircleShape)
                    )
                }
            }
        }
        Row(modifier = Modifier.padding(top = 15.dp).fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Publicaciones", fontSize = TextUnit(value = 22f, type = TextUnitType.Sp), fontWeight = FontWeight.Bold)
            Text(text = "Sugerencias", fontSize = TextUnit(value = 22f, type = TextUnitType.Sp), fontWeight = FontWeight.Bold)
        }
        Row(modifier = Modifier.padding(top = 15.dp).fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween) {
        Column {
            publicaciones.forEach { publicacion ->
                Card(
                    Modifier.size(width = 240.dp, height = 240.dp).padding(top = 15.dp),
                    backgroundColor = Color.DarkGray,
                    contentColor = Color.White,
                    elevation = 10.dp
                )
                {
                    Image(modifier = Modifier.fillMaxSize(),
                            painter = painterResource(resourcePath = (publicacion.foto)),
                            contentDescription = "Foto"
                    )
                }
                Row(modifier = Modifier.padding(top = 15.dp)) {
                    Box(modifier = Modifier.width(50.dp).height(50.dp)){
                    Image(painter = painterResource(resourcePath = (publicacion.fotoPerfil)),
                        contentDescription = "perfil",
                        modifier = Modifier.clip(
                            CircleShape)
                    )}
                    Text(text = publicacion.autor)
                }
                //Text(text = publicacion.descripcion)

            }

        }
            Column {
                Card(
                    Modifier.size(width = 240.dp, height = 300.dp).padding(top = 15.dp),
                    backgroundColor = Color.DarkGray,
                    contentColor = Color.White,
                    elevation = 10.dp
                )
                {
                    Column(modifier = Modifier.padding(start = 15.dp), verticalArrangement = Arrangement.spacedBy(15.dp)) {
                    Text(text = "Personas", fontSize = TextUnit(value = 18f, type = TextUnitType.Sp), fontWeight = FontWeight.Bold)
                    Sugerencias.forEach { sugerencia ->
                        Row(horizontalArrangement = Arrangement.Center) {
                        Box(modifier = Modifier.width(50.dp).height(50.dp)){
                            Image(painter = painterResource(resourcePath = (sugerencia.fotoPerfil)),
                                contentDescription = "perfil",
                                modifier = Modifier.clip(
                                    CircleShape)
                            )
                        }
                        Text(text = sugerencia.name)
                        }
                    }
                    }
                }
            }

        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication,
        title = "fake instagram",
        state = rememberWindowState(width = 800.dp, height = 800.dp)
    ) {
        App()
    }
}
