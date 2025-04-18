//package trotech.service.security
//
//import io.jsonwebtoken.Claims
//import io.jsonwebtoken.Jwts
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.security.core.userdetails.UserDetails
//import org.springframework.stereotype.Service
//import trotech.config.JwtProperties
//import java.util.*
//import javax.crypto.spec.SecretKeySpec
//
//
//@Service
//class TokenService(
//    @Value("\${jwt.secret}") private val secret: String = ""
//) {
//    private val signingKey: SecretKeySpec
//        get() {
//            val keyBytes: ByteArray = Base64.getDecoder().decode(secret)
//            return SecretKeySpec(keyBytes, 0, keyBytes.size, "HmacSHA256")
//        }
//
//    fun generateToken(subject: String, expiration: Date, additionalClaims: Map<String, Any> = emptyMap()): String {
//        return Jwts.builder()
//            .setClaims(additionalClaims)
//            .setSubject(subject)
//            .setIssuedAt(Date(System.currentTimeMillis()))
//            .setExpiration(expiration)
//            .signWith(signingKey)
//            .compact()
//    }
//
//    fun extractUsername(token: String): String {
//        return extractAllClaims(token).subject
//    }
//
//    private fun extractAllClaims(token: String): Claims {
//        return Jwts.parser()
//            .setSigningKey(signingKey)
//            .parseClaimsJws(token)
//            .body
//    }
//}