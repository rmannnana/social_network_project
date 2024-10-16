@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Bienvenue sur le réseau social!";
    }
}
