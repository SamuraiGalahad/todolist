package trotech.dto

import io.swagger.v3.oas.annotations.tags.Tag
import jakarta.persistence.*
import lombok.Getter
import lombok.Setter
import org.jetbrains.annotations.NotNull

@Entity
@Table(name = "task")
@Getter
@Setter
class Task constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id : Long = 0,
    @Column(name = "timestamp")
    val timestamp: Long?,
    @Column(name = "title")
    val title: String?,
    @Column(name = "text")
    val text: String?,
    @Column(name = "status")
    val status: Boolean?,
    @Column(name = "userId")
    val userId: Long
)