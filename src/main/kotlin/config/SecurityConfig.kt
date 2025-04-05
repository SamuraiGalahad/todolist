//package trotech.config
//
//import com.example.todolist.security.JwtFilter
//import com.example.todolist.service.UserDetailsServiceImpl
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.security.authentication.AuthenticationManager
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration
//import org.springframework.security.config.annotation.web.builders.HttpSecurity
//import org.springframework.security.config.http.SessionCreationPolicy
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
//import org.springframework.security.crypto.password.PasswordEncoder
//import org.springframework.security.web.SecurityFilterChain
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter
//
//@Configuration
//class SecurityConfig(
//    private val jwtFilter: JwtFilter,
//    private val userDetailsService: UserDetailsServiceImpl
//) {
//    @Bean
//    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()
//
//    @Bean
//    fun authManager(config: AuthenticationConfiguration): AuthenticationManager =
//        config.authenticationManager
//
//    @Bean
//    fun filterChain(http: HttpSecurity): SecurityFilterChain {
//        http.csrf().disable()
//            .authorizeHttpRequests {
//                it.requestMatchers("/auth/**").permitAll()
//                    .anyRequest().authenticated()
//            }
//            .sessionManagement { it.sessionCreationPolicy(SessionCreationPolicy.STATELESS) }
//            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter::class.java)
//        return http.build()
//    }
//}