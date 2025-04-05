package trotech.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
    info = Info(
        title = "ToDoList API",
        description = "API ряшины",
        version = "1.0.0",
        contact = Contact(
            name = "Николай Парахин",
            email = "nvparakhin@edu.hse.ru",
            url = "https://gitlab.com/SamuraiGalahad"
        )
    )
)
class OpenApiConfig