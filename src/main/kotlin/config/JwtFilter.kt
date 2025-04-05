//package trotech.config
//
//import io.jsonwebtoken.*
//import io.jsonwebtoken.security.Keys
//import jakarta.servlet.FilterChain
//import jakarta.servlet.http.HttpServletRequest
//import jakarta.servlet.http.HttpServletResponse
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
//import org.springframework.security.core.context.SecurityContextHolder
//import org.springframework.security.core.userdetails.UserDetails
//import org.springframework.security.core.userdetails.UserDetailsService
//import org.springframework.stereotype.Component
//import org.springframework.web.filter.OncePerRequestFilter
//import java.util.*
//import javax.crypto.SecretKey
//
//@Component
//class JwtUtil {
//    private val key: SecretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256)
//
//    fun generateToken(username: String): String =
//        Jwts.builder()
//            .setSubject(username)
//            .setIssuedAt(Date())
//            .setExpiration(Date(System.currentTimeMillis() + 1000 * 60 * 60))
//            .signWith(key)
//            .compact()
//
//    fun extractUsername(token: String): String =
//        Jwts.builder().signWith(key).claims().
//
//    fun validateToken(token: String, userDetails: UserDetails): Boolean =
//        extractUsername(token) == userDetails.username
//}