@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User author;
    private String content;
    private LocalDateTime timestamp;
    private int likeCount;
    // Getters et Setters
}
