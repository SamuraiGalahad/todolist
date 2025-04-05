//package trotech.controller.security
//
//import org.springframework.http.HttpStatus
//import org.springframework.http.ResponseEntity
//import org.springframework.security.crypto.password.PasswordEncoder
//import org.springframework.web.bind.annotation.PostMapping
//import org.springframework.web.bind.annotation.RequestBody
//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.RestController
//import trotech.dao.UserRepository
//import trotech.dto.User
//
//@RestController
//@RequestMapping("/auth")
//class AuthController(
//    private val userRepository: UserRepository,
//    private val passwordEncoder: PasswordEncoder
//) {
//
//    @PostMapping("/register")
//    fun register(@RequestBody user: User): ResponseEntity<String> {
//        if (userRepository.findByUsername(user.username) != null) {
//            return ResponseEntity.badRequest().body("User already exists")
//        }
//        val newUser = user.copy(password = passwordEncoder.encode(user.password))
//        userRepository.save(newUser)
//        return ResponseEntity.ok("User registered")
//    }
//
//    @PostMapping("/login")
//    fun login(@RequestBody user: User): ResponseEntity<Map<String, String>> {
//        val existingUser = userRepository.findByUsername(user.username)
//            ?: return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
//
//        if (!passwordEncoder.matches(user.password, existingUser.password)) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
//        }
//
//        val token = JwtUtil.generateToken(user.username)
//        return ResponseEntity.ok(mapOf("token" to token))
//    }
//}