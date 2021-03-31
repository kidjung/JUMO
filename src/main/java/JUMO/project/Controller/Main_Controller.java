package JUMO.project.Controller;

import JUMO.project.Entity.User;
import JUMO.project.Service.User_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class Main_Controller {

    private final User_Service user_service;

    @GetMapping(value="/")
    public String main(HttpServletRequest request, HttpServletResponse response){
        return "main";
    }

    @GetMapping(value="/login")
    public String login_pages(HttpServletRequest request, HttpServletResponse response){
        return "login";
    }

    @PostMapping(value="/signup")
    public String signup(User user){
        user_service.Signup(user);
        return "redirect:/";
    }



    @GetMapping("/signup")
    public String signup_page(HttpServletRequest request, HttpServletResponse response){
        return "signup";
    }
}
