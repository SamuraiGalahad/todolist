package trotech.controller.todo

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@Tag(name = "ToDoController", description = "REST контроллер для доступа к основным методам")
@RestController
@RequestMapping("/api/todo")
class ToDoController {
    @GetMapping
    fun getTodos(principal: Principal) {
        //todo
    }
}