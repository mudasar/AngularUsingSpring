package webapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import webapp.entitites.BlogEntry;

/**
 * Created by mudasar on 11/09/2015.
 */

@Controller
public class BlogEntryController {

    @RequestMapping("test")
    public @ResponseBody
    BlogEntry get(){
        BlogEntry blogEntry = new BlogEntry();
        blogEntry.setTitle("Test blog entry");

        return blogEntry;
    }

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public @ResponseBody BlogEntry Post(@RequestBody BlogEntry entry){
        return entry;
    }

}
