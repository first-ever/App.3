package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.User;
import web.service.UserService;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String printUsers(ModelMap model) {
        model.addAttribute("users",userService.getUsers());
        return "users";
    }

//    @RequestMapping("/new_user")
//    public String newCustomerForm(Map<String, Object> model) {
//        User user= new User();
//        model.put("user", user);
//        return "new_user";
//    }

//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String saveCustomer(@ModelAttribute("user") User user) {
//        userService.saveUser(user);
//        return "redirect:/";
//    }

//    @RequestMapping("/edit")
//    public ModelAndView editCustomerForm(@RequestParam long id) {
//        ModelAndView mav = new ModelAndView("edit_customer");
//        User user = userService.getUser(id);
//        mav.addObject("user", user);
//
//        return mav;
//    }
}