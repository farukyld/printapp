package farukyld.printapp.printout;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/printout")
public class PrintOutController {

  private final PrintOutService printOutService;

  public PrintOutController(PrintOutService printOutService) {
    this.printOutService = printOutService;
  }

  @GetMapping("/")
  public List<PrintOut> getAllPrintOuts() {
    return printOutService.getPrintOuts();

  }

}
