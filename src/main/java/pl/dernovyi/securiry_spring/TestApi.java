package pl.dernovyi.securiry_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestApi {
    @GetMapping("/forAll")
    public  String getAll() {
        return "Cześć nieznajomy";
    }
    @GetMapping("/forUser")
    public  String getUser(Principal principal) {
        return "Cześć user: " + principal.getName();
    }
    @GetMapping("/forAdmin")
    public  String getAdmin(Principal principal) {
        return "Cześć admin " + principal.getName() ;
    }
    @GetMapping("/papa")
    public  String getPapa() {
        return "Papa";
    }
}
