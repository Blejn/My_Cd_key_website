package pl.projekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.projekt.author.Author;
import pl.projekt.author.AuthorDao;
import pl.projekt.cdkeys.CdKey;
import pl.projekt.cdkeys.CdKeyDao;

@Controller
@RequestMapping("/cdkey")
public class CdKeyController {
    private final CdKeyDao cdKeyDao;
    private final AuthorDao authorDao;

    public CdKeyController(CdKeyDao cdKeyDao, AuthorDao authorDao) {
        this.cdKeyDao = cdKeyDao;
        this.authorDao = authorDao;
    }

    @GetMapping("/create")
    @ResponseBody
    public String createBook() {
        CdKey cdKey = new CdKey("Piękny umysł");
        cdKeyDao.saveCdKey(cdKey);
        return "utworzono customera o id :" + cdKey.getId();
    }

    @GetMapping("/creae-with-author")
    @ResponseBody
    public String createBookWithAuthor() {
        Author author = new Author();
        author.setName_artist("Blejn");
        authorDao.saveCustomer(author);
        CdKey cdKey = new CdKey("Piękny Umysł");
        cdKey.setAuthor(author);
        cdKeyDao.saveCdKey(cdKey);
        return "Plyta: " + cdKey.getId()+"Twórca: " +author.getId();
    }
}
