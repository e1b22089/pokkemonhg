package oit.is.hagehage.pokkemonhg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sample3")
public class Sample31Controller {

  @GetMapping("/step1")
  public String showSample31() {
    return "sample31"; // sample31.htmlを返す
  }
}
