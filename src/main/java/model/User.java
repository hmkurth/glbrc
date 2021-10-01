package model;


@Entity(name = "User")
@Table(name = "users")//case sensitive
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native",strategy="native")
    private int id;
    @NonNull
    @Column(name="user_name")
    private String userName;
    @NonNull
    @Column(name="user_password")
    private String password;
}
