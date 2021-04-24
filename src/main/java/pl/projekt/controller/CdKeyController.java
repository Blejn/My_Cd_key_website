package pl.projekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.projekt.cdkeys.CdKeyDao;
import pl.projekt.dto.CdKeyDto;
import pl.projekt.service.CdKeyService;

import java.util.Map;

@Controller
@RequestMapping("/cdtitle")
public class CdKeyController {
    private final CdKeyService cdKeyService;


    public CdKeyController(CdKeyService cdKeyService) {
        this.cdKeyService = cdKeyService;
    }

    @GetMapping
    public ModelAndView GetCdKeyPage() {
        return new ModelAndView("cdtitle", Map.of(
                "cdkeys", new CdKeyDto()

        ));

    }
  @PostMapping
    @ResponseBody
    public String postForm(CdKeyDto cdkey){
         cdKeyService.add(cdkey);
        return "redirect:/";
  }





}
