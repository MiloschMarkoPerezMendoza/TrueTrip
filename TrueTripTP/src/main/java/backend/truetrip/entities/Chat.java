package backend.truetrip.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="chats")

public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private Date creationDate;

    /*@ManyToOne
    @JoinColumn(name = "user_id")
    private User user1;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user2;*/
}
