import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod}


import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(Array("/"))
class HelloWorldController {
  @RequestMapping(method = Array(RequestMethod.GET))
   def main(args: Array[String]) {
      println("Hello, world! ")
    }
}
